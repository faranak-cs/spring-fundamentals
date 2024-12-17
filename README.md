# Java with Maven & Spring Boot
Introduction to Java with Maven and Spring Boot

## SDK commands
- Install SDKMAN
```
curl -s "https://get.sdkman.io" | bash
```

- Use the following command to see the list of Java versions
```
sdk list java
```

- Use the following command to install Java
```
sdk install java version
```

- Use the following command to select the Java version for the project:
```
sdk use java version
```

- See current version:
```
sdk current java
```

- Set default version:
```
sdk default java version
```

## Maven commands
- Compile the code:
```
mvn clean compile
```

- Compile, test (all) and package the project:
```
mvn clean install
```

- Compile, test (unit tests), package and skip ITs:
```
 mvn clean install -DskipITs
```

- Run the ITs using Failsafe plugin:
> It will not fail the build if ITs are failed
```
 mvn failsafe:integration-test
```

- Verify the results using Failsafe plugin:
> It will fail the build if ITs are failed in the reports
```
mvn failsafe:verify
```


- Generate report for code coverage using JaCoCo plugin:
```
mvn jacoco:report
```

- Build and verify the results:
```
mvn clean verify
```

- Run unit tests:
```
mvn clean test install -B -U -e -Dmaven.repo.local=path -DskipITs
```

## JUnit
- 4
```
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```
- 5
```
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.3</version>
    <scope>test</scope>
</dependency>
```


## Component Diagram
![dependency_injection](https://github.com/user-attachments/assets/39a22df7-9da1-4906-b305-68b240795feb)


## Version
| Library      | Version |
| -----------      | ----------- |
| IntelliJ IDEA CE | 2024.1.4    |
| Java             | 17.0.11-tem |
| Maven            | 3.9.8  |
| Spring Boot      | 3.3.1  |
| Spring Framework | 6.1.10 |

## Useful links
- https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
