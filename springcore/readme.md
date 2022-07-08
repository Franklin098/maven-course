# Spring Boot Core


 The parent poom for every Spring Boot project is spring-boot-starter-parent

 It is a BOM, an special pom fime, Bill Of Materials, where every version of the necessesary dependencies are defined.

 ```
    <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.7.1</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
 ```

 In the pom.xml you can see only a few dependencies, but just with few lines you already export a lot of different dependencies, if you loog at your dependencies binaries you'll see far more libraries that have been added to your project, with just few lines of configuration. That's the power of Spring Boot.

```
<!- With these few lines you pull automatically a lot of different libraries-->
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

The parent tag is only for setting the version information, the libraries are added by the few lines in the <dependencies> section.


@SpringBootApplication is a top level anotation, it contains more annotations in its inside, you can use the cursor to see the other annotations.

Important anotations contained in @SpringBootApplication

```
@SpringBootConfiguration
@EnableAutoConfiguration   // automatically do configuration
@ComponentScan // scan classes with @Component, @Service and create beans of those annotations automatically
```

If we use MySQL library, Spring Boot will automatically scan the dependencies and create a DataSource.

If we use SpringWeb, then Spring Boot automatically configurates the serverlets.

So we do not need to do more xml or code-based configuration.


@SpringBootTest tells Spring Boot to search for a class marked with @SpringBootApplication and use that class to create a Spring Application Context, a container with all the beans, so we can start testing the application.


```
@Repository // to define beans that handle database code
public class PaymentDAOImpl implements PaymentDAO {

}

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired // for dependency injection, spring search for an implementation of this interface
    private PaymentDAO dao;

    public PaymentDAO getDao() {
        return dao;
    }

    public void setDao(PaymentDAO dao) {
        this.dao = dao;
    }
}


```


Test if dependency injection is working