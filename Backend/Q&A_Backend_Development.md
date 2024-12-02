# Spring			
What is Spring? Spring Boot?			
How would you set up a spring boot project?			
What are some annotations you've used?			
What is the purpose of the @Component annotation?			
What are Spring Beans?			
What Bean Scopes are you aware of?			
Describe Spring MVC Controllers?			
How would you handle http calls/mappings using Spring Boot?			
### What is spring data? What are the JPA annotations?		
 - Spring Data simplifies integration with various data storage technologies within spring framework, including relational databases, NoSQL databases, and graph databases.
 - Spring Data abstracts away low-level database-specific queries by inroducing the concept of repositories, which hide the complexity of data access. These repositories offer common CRUD operations and offers to choose modules for repository support. Some Modules are, Spring Data JDBC, Spring Data JPA, Spring Data MongoDB

What does the @entity annotation do			
How do you handle database interactions with spring data?			
What is Autowiring?			
What is spring initializer?		NOTE - if they ask about "component lifecycle methods" they're probably referring to class components. Don't be afraid to say you haven't used them!	

What spring annotations have you used?
### List 3-4 annotations. What is Autowired?
 * @Bean - A bean refers to an object that is instantiated, assembled, and otherwise managed by the Spring IoC (Inversion of Control) container
 * @RestController - Combination of @Controller and @ResponseBody (Makes a class a Bean, and converts all HTTP Responses to JSON). Preferred in Controller classes since it's Convenient!
 * @RequestMapping - Typically placed at the top of a Controller class to denote the base URL
 * @Service - One of the 4 stereotype annotations. Makes a Class a Bean. Typically used in Service classes.
 * @Repository - One of the 4 stereotype annotations. Makes a Class a Bean. Typically used in DAO classes (or DAO Interfaces)
 * @Entity - Indicates that a class is intended to be a DB table. Typically a model class
 * @CrossOrigin - Sets up configurations for Cross Origin Resource Sharing (CORS), which basically means which origins can send requests to our API.

@RequestMapping vs @GetMapping
HTTP verbs
Have you worked with Spring Boot Actuator?
From the frontend, how to get API requests from backend? -> how to get request from backend and render
a table with those items on the frontend?
Have you used @Bean or @Component?
What is dependency injection?
Constructor injection?
### versions of SpringBoot
Spring Boot 2.1.x: This series introduced support for Java 11, which was the latest LTS version of Java at the time. It also brought enhancements to Spring Data and Actuator endpoints1.
Spring Boot 2.2.x: Added support for Java 13 and improved configuration property binding. It also introduced RSocket support, a new protocol for reactive networking1.
Spring Boot 2.3.x: Focused on Docker with features for building Docker images with Cloud Native Buildpacks. It also introduced graceful shutdown and liveness/readiness probes for Kubernetes deployments1.
Spring Boot 2.5.x: This version continued to refine Docker support and introduced a new version of the Spring Native experimental project, which allows compiling Spring applications to native executables using GraalVM1.
Spring Boot 2.6.x: Brought improvements to the Actuator, including new endpoints and features. It also enhanced the application startup performance and introduced support for GraphQL1.
Spring Boot 3.0.x: Marked a major upgrade with the baseline set to Spring Framework 6.0. It introduced native compilation support with GraalVM and many other features aligned with Java 17 LTS2.
Spring Boot 3.1.x: Continued to build on the foundation of the 3.0.x series with updates to the Spring ecosystem components and further refinements1.
Spring Boot 3.2.x: The latest series as of May 2024, which includes version 3.2.5, continues to refine the framework with updates to dependencies and modules1.

### Have you worked with Spring/Spring BOOT?
 - Spring Framework is a powerful, lightweight framework that provides a comprehensive programming and configuration model for modern Java-based enterprise applications. It offers features like Dependency Injection, aspect-oriented programming, and facilities for data access, transaction management, web applications, and much more. It’s designed to be highly modular, allowing you to use only the parts you need.
 - Spring Boot, on the other hand, is built on top of the Spring framework and is designed to simplify the bootstrapping and development of new Spring applications. It favors convention over configuration and is designed to get you up and running as quickly as possible. Spring Boot takes an opinionated view of the Spring platform, which means it comes with pre-selected libraries and settings to minimize configuration work. It also provides embedded server support, so you don’t need to set up a server external		

# SQL

### Tell me about the different SQL sublanguages? Can you name several operations/statements per each sublanguage?			

### How can you alter a table without deleting it?			

### How do you create a table in SQL?			

### How do you define foreign keys?			

### How to select all from a DB? 			

### How to filter the results of a select? (where clause)			

### What does GROUP BY do in SQL?			

### Name and describe some SQL joins			

### What SQL functions are you aware of?	

### "*" in SQL

### What is a foreign key in SQL?

### Have you worked with indexes in SQL?		