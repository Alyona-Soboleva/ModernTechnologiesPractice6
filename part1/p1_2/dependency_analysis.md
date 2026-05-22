# Анализ зависимостей Maven

## Инструкция

Выполните команду в директории `part1/p1_1`:

```bash
mvn dependency:tree
```

Скопируйте вывод команды ниже:

```
C:\Users\242770\.jdks\ms-21.0.10\bin\java.exe -Dmaven.multiModuleProjectDirectory=C:\Users\242770\IdeaProjects\ModernTechnologiesPractice6\part1\p1_1 -Djansi.passthrough=true "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\lib\idea_rt.jar=52404:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\plugins\maven\lib\maven3\boot\plexus-classworlds-2.8.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.0.1\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2024.2.0.1 dependency:tree
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.1.0/maven-antrun-plugin-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.1.0/maven-antrun-plugin-3.1.0.pom (9.1 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/34/maven-plugins-34.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/34/maven-plugins-34.pom (11 kB at 202 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.1.0/maven-antrun-plugin-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.1.0/maven-antrun-plugin-3.1.0.jar (41 kB at 711 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.7.1/maven-assembly-plugin-3.7.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.7.1/maven-assembly-plugin-3.7.1.pom (15 kB at 262 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.7.1/maven-assembly-plugin-3.7.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.7.1/maven-assembly-plugin-3.7.1.jar (240 kB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.7.0/maven-dependency-plugin-3.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.7.0/maven-dependency-plugin-3.7.0.pom (19 kB at 291 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.7.0/maven-dependency-plugin-3.7.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.7.0/maven-dependency-plugin-3.7.0.jar (207 kB at 3.0 MB/s)
[INFO] 
[INFO] ------------------------< com.movies:movie-app >------------------------
[INFO] Building Movie Database Application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dependency:3.7.0:tree (default-cli) @ movie-app ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.12.0/doxia-sink-api-1.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.12.0/doxia-sink-api-1.12.0.pom (1.5 kB at 24 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.12.0/doxia-1.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.12.0/doxia-1.12.0.pom (18 kB at 293 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.12.0/doxia-logging-api-1.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.12.0/doxia-logging-api-1.12.0.pom (1.5 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.pom (7.6 kB at 129 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom (750 B at 11 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom (4.8 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.pom (20 kB at 251 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.14.1/maven-dependency-analyzer-1.14.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.14.1/maven-dependency-analyzer-1.14.1.pom (6.4 kB at 95 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/42/maven-shared-components-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/42/maven-shared-components-42.pom (3.8 kB at 74 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.25.3/assertj-bom-3.25.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.25.3/assertj-bom-3.25.3.pom (3.7 kB at 68 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.pom (2.4 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.pom (7.0 kB at 132 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom (2.8 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom (18 kB at 343 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 736 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom (2.6 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.pom (5.3 kB at 85 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/37/maven-shared-components-37.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/37/maven-shared-components-37.pom (4.9 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/37/maven-parent-37.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/37/maven-parent-37.pom (46 kB at 845 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom (20 kB at 351 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom (11 kB at 194 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom (5.3 kB at 68 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom (5.1 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 98 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 118 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 185 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom (815 B at 11 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom (4.2 kB at 68 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom (17 kB at 289 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 305 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 96 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 147 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom (5.0 kB at 96 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom (4.6 kB at 88 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom (41 kB at 646 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom (13 kB at 166 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom (2.7 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom (12 kB at 111 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.12.0/doxia-sink-api-1.12.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.12.0/doxia-sink-api-1.12.0.jar (12 kB at 247 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.12.0/doxia-logging-api-1.12.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.14.1/maven-dependency-analyzer-1.14.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.jar (251 kB at 4.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.jar (43 kB at 383 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.14.1/maven-dependency-analyzer-1.14.1.jar (42 kB at 303 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.jar (20 kB at 138 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.12.0/doxia-logging-api-1.12.0.jar (12 kB at 81 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.jar (58 kB at 356 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.jar (125 kB at 697 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar (149 kB at 653 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar (4.2 kB at 17 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar (159 kB at 645 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar (168 kB at 635 kB/s)
[INFO] com.movies:movie-app:jar:1.0-SNAPSHOT
[INFO] +- com.h2database:h2:jar:2.2.224:compile
[INFO] \- org.hibernate.orm:hibernate-core:jar:6.4.0.Final:compile
[INFO]    +- jakarta.persistence:jakarta.persistence-api:jar:3.1.0:compile
[INFO]    +- jakarta.transaction:jakarta.transaction-api:jar:2.0.1:compile
[INFO]    +- org.jboss.logging:jboss-logging:jar:3.5.0.Final:runtime
[INFO]    +- org.hibernate.common:hibernate-commons-annotations:jar:6.0.6.Final:runtime
[INFO]    +- io.smallrye:jandex:jar:3.1.2:runtime
[INFO]    +- com.fasterxml:classmate:jar:1.5.1:runtime
[INFO]    +- net.bytebuddy:byte-buddy:jar:1.14.7:runtime
[INFO]    +- jakarta.xml.bind:jakarta.xml.bind-api:jar:4.0.0:runtime
[INFO]    |  \- jakarta.activation:jakarta.activation-api:jar:2.1.0:runtime
[INFO]    +- org.glassfish.jaxb:jaxb-runtime:jar:4.0.2:runtime
[INFO]    |  \- org.glassfish.jaxb:jaxb-core:jar:4.0.2:runtime
[INFO]    |     +- org.eclipse.angus:angus-activation:jar:2.0.0:runtime
[INFO]    |     +- org.glassfish.jaxb:txw2:jar:4.0.2:runtime
[INFO]    |     \- com.sun.istack:istack-commons-runtime:jar:4.1.1:runtime
[INFO]    +- jakarta.inject:jakarta.inject-api:jar:2.0.1:runtime
[INFO]    \- org.antlr:antlr4-runtime:jar:4.13.0:runtime
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.160 s
[INFO] Finished at: 2026-05-22T19:37:09+03:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0

```

---

## Вопрос 1: Прямые зависимости

**Вопрос:** Сколько прямых (direct) зависимостей имеет ваш проект?

**Ваш ответ:** 2: `com.h2database:h2:2.2.224` и `org.hibernate.orm:hibernate-core:6.4.0.Final`

**Объяснение:** Прямые зависимости - это те, которые вы явно добавили в секцию `<dependencies>` в pom.xml.

---

## Вопрос 2: Транзитивные зависимости Hibernate

**Вопрос:** Сколько транзитивных зависимостей добавляет Hibernate Core?

**Ваш ответ:** 16 с учетом вложенных. без них - 11


**Подсказка:** Посчитайте строки под `org.hibernate.orm:hibernate-core:jar:6.4.0.Final` в дереве зависимостей.

---

## Вопрос 3: Транзитивные зависимости

**Вопрос:** Перечислите 3 транзитивных зависимости, которые подтягивает Hibernate.

1. JPA API для работы с ORM - jakarta.persistence:jakarta.persistence-api:3.1.0
2. API для транзакций - jakarta.transaction:jakarta.transaction-api:2.0.1
3. библиотека для логирования - org.jboss.logging:jboss-logging:3.5.0.Final

---

## Примерные ответы (для самопроверки)

<details>
<summary>Нажмите, чтобы увидеть ответы</summary>

### Ответ 1:
2 прямые зависимости: H2 Database и Hibernate Core.

### Ответ 2:
Hibernate Core добавляет около 15-20 транзитивных зависимостей (зависит от версии).

### Ответ 3:
Примеры транзитивных зависимостей:
- jakarta.persistence-api (JPA API)
- jakarta.transaction-api (JTA)
- jakarta.xml.bind-api (JAXB)
- antlr4-runtime (парсер HQL)
- byte-buddy ( bytecode instrumentation)
- jboss-logging

</details>
