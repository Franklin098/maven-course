### maven coordinates

```
  <groupId>com.franklin</groupId>
  <artifactId>hellomaven</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
```

maven build name:

groupId:artifactId:packaging:version

### mvn install

compiling, running the test and packing the project

It creates a /target folder, there we can see the .class compile files, the .jar file wich is the executable
and it is named with the version specified in the pom file

### java -cp target/hellomaven-1.0-SNAPSHOT.jar com.franklin.App

run the executable java file

java -cp  <executable> <package.className>

# Key Concepts of Maven : Plugins and Goals

## Plugin

A Maven Plugin is a collection of 1 or more goals

<PluginId>:<GoalId>
archetype:generate <--- the 'generate' goal of the 'archetype' plugin
install:install <--- the 'install' goal of the 'install' plugin

The goal can be a specific task that we can run independently or that can be part of a build:
compile <--- compile java classes and tests
test <--- run tests
package <--- to a .jar file

we can pass parameters


 We can override default goal behaviours using the .pom file

 if we run 'surfire:test' maven will run all the previous taks needed before it, like process-resources, compile

 
## Maven Repositories

mvn install 

It install dependencies from the default maven rempository http://repo.maven.apache.org/maven2

The packages are store in the remote repository using the Maven Coordinates

You can also add your on premises custom repository

> Maven also creates a Local Repository in the developers machine, it pulls the dependencies jar 1 time, and then
use them again using the developers local repository

go to ~/.m2   it is you local maven repository, you can find the dependencies installed

When you compile your own maven project, it also creates a copy of the resources in the repository



