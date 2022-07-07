# Problems with Traditial Spring (before SpringbBoot)

We can use many different libraries and modules from Spring like:

* core (dependency injection)
* mvc (rest and web)
* dao (data access layer)
* orm (like Hibernate)

To use these modules we can use xml or annotations based configurations

These configurations get hard to mantain, we also need to make sure that all modules are available with all their dependencies, and we alsoo need to take care that the libraries are compatible.

Spring Boot help us to automate all of these task:

    Module Availability, Version Compatible, Deployment

# Spring Boot Features

Features that helps to solve some issues of Spring traditional approach

### Auto Configuration :

Spring boot automatically configure everything we need for our application, we don't have to use xml, annotation-based or java configuration anymore.

For example if we use MVC, Spring Boot automatically configures the DispatcherServerlet and do all the request mapping for us, we do not have to use any xml or annotation.

If we use some ORM like Hibernate, we do not longer need to configure the DataSource or even the TransactionManager, Spring Boots automatically configure this.

### Module Availability and Version Compatible:

Spring Boot Starters help us with that.

Every spring boot project has a parent project or maven dependency: spring-boot-starter-parent, it has all the project configuration an version compatibility for many libraries that we need.

We have many starters for differnt kind of projects, like:  spring-boot-starter-web

spring-boot-starter-data-jpa helps to configure projets that needs to work with data, it autoconfigures all the compatible dependencies needed.

### Embedded Servlet Container

By default it is Tomcat, but we can also switch to Jetty and Undertow. No longer external deployment, we can simple run our application in an embedded server.

### Spring Boot Actuators

Helth checks for our application for free:

Autoconfig -> display all autoconfiguration report
Mappings -> all the http request mappings
Info
Health -> app health condition, is the database down?
Metrics 

All these are restful endpoints that we have for free to see reports and data
