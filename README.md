# Prerequisite
You need to have maven environment (mvn) and port 8090 is available

# Steps

open terminal, cd into the repo then run the following commands
```bash
cd parent
mvn package
cd ..
mvn install:install-file -Dfile=parent\data\target\data-0.0.1-SNAPSHOT.jar -DgroupId=com.sotatek.d5 -DartifactId=data -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
mvn install:install-file -Dfile=parent\common-internal\target\common-internal-0.0.1-SNAPSHOT.jar -DgroupId=com.sotatek.d5 -DartifactId=common-internal -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
cd Australia
mvn spring-boot:run
```
*you can use postman export to test if you have completed the above steps*




