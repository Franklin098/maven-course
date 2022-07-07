# Profiles

### Build Portability

Build portability means that the developer should be able to run the project anywhere without changing any configuration, or just changing a little configuration.

Maven allows build protability using *profiles*.

Database, Webservices, are different across Dev, Test, QA and Production environment.

We can create different profiles, and based on wich profile is currently activated, maven will pick the selected information.


```
src/main/profiles

    dev
        application.properties
    test
        application.properties
    prod
        application.properties
```

* Inside pom.xml:

```
    <profiles>
        <profile>
            <!-- unique id to be used in the maven command -->
            <id>dev</id>
            <properties>
                <!-- match the folder name-->
                <build.profile.id>dev</build.profile.id>
            </properties>
            <build>
                <resources>
                    <resource>
                        <directory>src/main/profiles/dev</directory>
                    </resource>
                </resources>
            </build>
        </profile>
        <profile>
            <!-- unique id to be used in the maven command -->
            <id>test</id>
            <properties>
                <!-- match the folder name-->
                <build.profile.id>test</build.profile.id>
            </properties>
            <build>
                <resources>
                    <resource>
                        <directory>src/main/profiles/test</directory>
                    </resource>
                </resources>
            </build>
        </profile>
        <profile>
            <!-- unique id to be used in the maven command -->
            <id>prod</id>
            <properties>
                <!-- match the folder name-->
                <build.profile.id>prod</build.profile.id>
            </properties>
            <build>
                <resources>
                    <resource>
                        <directory>src/main/profiles/prod</directory>
                    </resource>
                </resources>
            </build>
        </profile>
    </profiles>

```

### Comands to activate a profile

```
"-P" + "environment_id"
```

Examples:

```
mvn install -Pprod

mvn install -Pdev

mvn install -Ptest
```