# Prerequisite
You need to have maven environment (mvn) and java

# Steps

1. Use the cd command to go to the parent folder
```bash
cd parent
```

2. Build parent
```bash
mvn package
```

3. Installing a jar file created by maven to local repo
```bash
mvn install:install-file  
      -Dfile={path-to-your-parent}\parent\common\target\common-0.0.1-SNAPSHOT.jar 
      -DgroupId=com.sotatek.d5 
      -DartifactId=common 
      -Dversion=0.0.1-SNAPSHOT 
      -Dpackaging=jar 
      -DgeneratePom=true
```
   *Replace: {path-to-your-parent}*

4. Build Australia project
```bash
cd Australia
mvn package
```

5. Run Australia project
```bash
cd Australia/target
java -jar australia-1.0.0-SNAPSHOT.jar
```




