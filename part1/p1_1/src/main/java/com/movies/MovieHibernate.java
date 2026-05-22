package part3.p3_1;

import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

// ==================== Сущность Movie (исправленная) ====================
@Entity
@Table(name = "movies")
class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "genre")
    private String genre;

    // ВАЖНО: экранируем year обратными кавычками
    @Column(name = "`year`")
    private Integer year;

    // Конструкторы
    public Movie() {}

    public Movie(String title, String genre, Integer year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    @Override
    public String toString() {
        return String.format("Movie{id=%d, title='%s', genre='%s', year=%d}",
                id, title, genre, year);
    }
}

// ==================== Основной класс ====================
public class MovieHibernate {

    private SessionFactory sessionFactory;

    public MovieHibernate() {
        // Конфигурация Hibernate
        this.sessionFactory = new Configuration()
                .addAnnotatedClass(Movie.class)
                .setProperty("hibernate.connection.driver_class", "org.h2.Driver")
                .setProperty("hibernate.connection.url", "jdbc:h2:mem:moviedb_hibernate;DB_CLOSE_DELAY=-1")
                .setProperty("hibernate.connection.username", "sa")
                .setProperty("hibernate.connection.password", "")
                .setProperty("hibernate.hbm2ddl.auto", "create-drop")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.format_sql", "true")
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        MovieHibernate app = new MovieHibernate();

        try (Session session = app.sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();

            System.out.println("=== Сохранение фильмов ===");

            // Создаем и сохраняем фильмы
            Movie movie1 = new Movie("Матрица", "sci-fi", 1999);
            Movie movie2 = new Movie("Начало", "sci-fi", 2010);
            Movie movie3 = new Movie("Крестный отец", "crime", 1972);
            Movie movie4 = new Movie("Темный рыцарь", "action", 2008);

            app.saveMovie(session, movie1);
            app.saveMovie(session, movie2);
            app.saveMovie(session, movie3);
            app.saveMovie(session, movie4);

            tx.commit();
            System.out.println("✅ Фильмы сохранены\n");

            // Поиск по жанру
            System.out.println("=== Поиск по жанру 'sci-fi' ===");
            List<Movie> sciFiMovies = app.findMoviesByGenre(session, "sci-fi");
            sciFiMovies.forEach(System.out::println);

            // Все фильмы
            System.out.println("\n=== Все фильмы ===");
            List<Movie> allMovies = session.createQuery("FROM Movie", Movie.class).list();
            allMovies.forEach(System.out::println);

            // Обновление фильма
            System.out.println("\n=== Обновление фильма ===");
            tx = session.beginTransaction();
            if (!allMovies.isEmpty()) {
                app.updateMovie(session, allMovies.get(0).getId(), "Матрица (Обновлено)", "sci-fi", 1999);
            }
            tx.commit();

            // Удаление фильма
            System.out.println("\n=== Удаление фильма ===");
            tx = session.beginTransaction();
            if (allMovies.size() > 1) {
                app.deleteMovie(session, allMovies.get(1).getId());
            }
            tx.commit();

            // Итоговый список
            System.out.println("\n=== Итоговый список фильмов ===");
            List<Movie> finalMovies = session.createQuery("FROM Movie", Movie.class).list();
            finalMovies.forEach(System.out::println);

        } catch (Exception e) {
            System.err.println("❌ Ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            app.sessionFactory.close();
        }
    }

    public void saveMovie(Session session, Movie movie) {
        session.persist(movie);
        System.out.println("Сохранен: " + movie.getTitle());
    }

    public List<Movie> findMoviesByGenre(Session session, String genre) {
        String hql = "FROM Movie WHERE genre = :genre";
        return session.createQuery(hql, Movie.class)
                .setParameter("genre", genre)
                .list();
    }

    public void updateMovie(Session session, Long id, String title, String genre, Integer year) {
        Movie movie = session.get(Movie.class, id);
        if (movie != null) {
            movie.setTitle(title);
            movie.setGenre(genre);
            movie.setYear(year);
            session.merge(movie);
            System.out.println("Обновлен фильм: " + movie.getTitle());
        }
    }

    public void deleteMovie(Session session, Long id) {
        Movie movie = session.get(Movie.class, id);
        if (movie != null) {
            session.remove(movie);
            System.out.println("Удален фильм: " + movie.getTitle());
        }
    }
}