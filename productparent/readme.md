# Multimodule Maven Project

### In Parent Pom:

```
    <groupId>com.franklin.product</groupId>
    <artifactId>productparent</artifactId>
    <version>1.0</version>
    <packaging>pom</packaging>
    <name>productparent</name>
```

Parent POM files should always have <packaging>pom</packaging>, not jar nor war

Then add the children as modules:

```
     <modules>
        <module>productservices</module>
        <module>productweb</module>
    </modules>
```

### Change the child POMS

In the child pom, update to use the parent in the Artifact Coordinates section:

- Product Service:

Before:

```
    <groupId>com.franklin.product</groupId>
    <artifactId>productservice</artifactId>
    <version>1.0-SNAPSHOT</version>
```

After:

```
    <parent>
        <groupId>com.franklin.product</groupId>
        <artifactId>productparent</artifactId>
        <version>1.0</version>
    </parent>

    <artifactId>productservice</artifactId> 
```

- Product Web:

Before:

```
    <groupId>com.franklin.product</groupId>
    <artifactId>productweb</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>
```

After:

```
    <parent>
        <groupId>com.franklin.product</groupId>
        <artifactId>productparent</artifactId>
        <version>1.0</version>
    </parent>
    <packaging>war</packaging>
    <artifactId>productweb</artifactId> 
```

### To Run the hole project from the Parent Module:

cd to parent directory

```
mvn clean install
```

It will build all the projects

### Add a sibiling project as a dependency 

```
<dependencies>
    <dependency>
        <groupId>com.franklin.product</groupId>
        <artifactId>productservice</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

# Manage Dependencies

When we have multiple prujects in our organization, we want to ensure that all these projects are using the same dependencies versions.

E.g: if one project is using junit 3, other 4, and other 5.... it will end up with lots of inconsistency and can be a mess.

We want to make sure that as organization we are using the same version.

Maven makes it sumple simple with us using the Parent pom.xml

* Parent pom.xml (before):

```
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

* Parent pom.xml (after):

```
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.11</version>
                <scope>test</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

```

After our junit dependency becames a *managed dependency*, meaning we do not have to define de version of it in every child project.

* Child projects pom.xml (after, we can delete the version):

```
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

If we define the version again, then it overrides the parent version, wich is not a common practice

# Plugin Managment

Similar idea of dependency management, but we plugins we want touse in our projects

* Parent pom.xml:

```
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.8.0</version>
                    <configuration>
                        <source>1.8</source>
                        <target>1.8</target>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
```