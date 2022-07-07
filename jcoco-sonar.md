# JaCoCo

The JaCoCo core coverage plugin will analyse and see how mucho code, how many classes and methods are being cover by the tests that are run, and it will generate reports.

```
<build>
        <pluginManagement>
            <!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
            <plugins>
                <plugin>
                    <groupId>org.jacoco</groupId>
                    <artifactId>jacoco-maven-plugin</artifactId>
                    <version>0.8.7</version>

                    <!-- step 1: initialization step, ready to generate reports-->
                    <executions>
                        <execution>
                            <!-- goals we want to run from this plugin -->
                            <goals>
                                <goal>prepare-agent</goal>
                            </goals>
                        </execution>
                        <execution>
                            <id>generatereport</id>
                            <!-- at which phase we want to run int -->
                            <phase>test</phase>
                            <goals>
                                <goal>report</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </pluginManagement>
</build>
        
```

Now run:

```
mvn clean test
```

or

```
mvn clean verify
```

See in the maven logs that a jacoco task is running.

**Go to ./target/site/jacoco/index.html to display the analysis graphics and report made by Jacoco.**

We can see how much of code is covered with Unit Test

# SonarQube

It is a static code analizer, that generates beautiful dashboards with everything related with our projects, if there are any code smells.

Both are easy to integrate with maven.


Download sonarqube community edition

```
cd /Users/franklinvelasquezfuentes/Downloads/sonarqube-9.5.0.56709/bin/macosx-universal-64

./sonar.sh      // for intructions

./sonar.sh start

./sonar.sh status

./sonar.sh console
```

Go to localhost:9000  , default credentials: admin, admin

Create a settings.xml in your .m2 local repository

Go to Sonarqube dashboard an generate a new user token

Then run :

```
mvn clean verify sonar:sonar -Dsonar.login=squ_27e1abdf24c1cf23e03e4240ee955bb85187d4a1
```