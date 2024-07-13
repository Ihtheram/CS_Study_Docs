# Organized Infosys Playbook
          
## Soft Skills/Non Technical			

### Tell me about yourself (VERY common - you should have a 2-3 sentence answer ready for this. (Where did you graduate? What did you study? What work have you done til now?)	
My name is Ihtheram Chowdhury, I am graduated with a Bachelor of Science Degree in Computer Science and Engineering. During the undergraduate years I have studied different aspects of software, hardware, telecommunication, neworking, web programming, AI, and learned programming languages and some libraries of Java, Python, C also learned SQL Database, and version control with git and github etc. After graduation, I started working at Revature where I am currently working right now, after I trained for few months, started participating on projects using technologies like Java, Spring Boot, React etc.

### How do you handle team conflict?
Handling team conflict effectively involves several key steps:

 1. Acknowledge that there is a disagreement that needs to be addressed. approach the conflict with a positive mindset to identify the root causes of the conflict.
 2. Ensure that team members feel safe to express their thoughts and feelings and encourage all parties to speak openly and listen to each other without interrupting.
 3. Collaborate to find solutions that are acceptable to all parties involved and take concrete steps to implement the agreed-upon solutions.
 8. Check in with the team after implementing the solutions to ensure the conflict has been resolved and to prevent future issues.

It’s important to approach conflict with a positive mindset, seeing it as an opportunity for growth and improvement rather than a setback. Effective communication, empathy, and a willingness to compromise are crucial in resolving team conflicts. Remember, the goal is to strengthen the team and improve collaboration, not to win an argument.
			

### Do you see yourself as leader of a team? (there's no wrong answer to this besides something like "yes I'm better than everyone" or "no I hate people")			
I haven't had the opportunity to lead a team formally, but I really like to step up and help out when I’m working in a team. I believe leadership is about inspiring and helping others to achieve common goals, and I’m looking forward to grow into such a role one day. I'm eager to learn more and take on more responsibilities, I believe that because I work hard and communicate well, I’ll be good at leading a team.

### Tell me something interesting about your schooling.			

### What conflicts/challenges happened in any of your 3 projects?			

### Are you willing to learn different programming languages?			
“Absolutely! I am always eager to expand my skill set and knowledge base. Learning new programming languages not only allows me to stay current with industry trends but also enhances my problem-solving abilities by understanding different approaches to coding. I’m looking forward to the opportunity to learn and grow in this area.”

### Describe what part of your most recent project you worked on and how you went about designing it			

### Describe a moment where you failed?			

### What makes you excited or passionate about software development?
 - It's fun to solve complex problems with coding and make programs work
 - I can turn my own concept into reality
 - We keep learning and keep improving developing skills
 - Doesnt get boring because we keep building new things
 - What I can build may help lots of people which makes me feel great.
 - Working with others and achieve something with team is also satisfying.

### Do you prefer working on the frontend or the backend?			
            
What is your background with IT?
Are you currently working?






## Object-Oriented Programming		

### What is OOP? What are the Pillars of OOP? 
OOP stands for Object-Oriented Programming, which is a programming paradigm that organizes software design around objects, which are instances of classes.
The four pillars of OOP are:
 * Abstraction: This pillar allows to hide complex reality while exposing only the necessary parts.
 * Encapsulation: Encapsulation is the technique of bundling the data (attributes) and the methods (functions) that use the data into a single unit or class.
 * Inheritance: Inheritance is a mechanism where we can to derive a new class from an existing class.
 * Polymorphism: Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. The same method call can behave differently on different instances, depending on their actual class.

### Describe abstraction and polymorphism?			
Abstraction is the process of simplifying complex systems by breaking them down into smaller, more manageable parts. It involves creating abstract classes and interfaces that define common behaviors and can be implemented by multiple classes.

Polymorphism is the ability of an object to take on many forms. It allows objects of different classes to be treated as objects of a common superclass. Polymorphism enables dynamic method dispatch and method overriding.		

### Overloading vs Overriding?			
Overloading is the process of defining multiple methods with the same name but different parameters in the same class. The methods must have different parameter lists (number, type, or order of parameters). Overloading allows a class to have multiple methods with the same name but different behaviors.

Overriding is the process of providing a different implementation for a method in a subclass that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass. Overriding allows a subclass to provide its own implementation of a method inherited from its superclass.






## Java

### Why is Java important?
 * Java is platform independent, every machine has its own JRE and JVM for Java to run, it keeps to the principle of WORA which means write once run anywhere
 * Java has C-language inspired syntax, those who are familiar with C will find it easy to understand and learn Java
 * Java automatically manages memory and takes out garbage data
 * Java API provides an extensive built-in runtime library of functions that the programmers do not have to re-create.
 * Java has Support from the Oracle corporation
 * Java has a rich open-source community

### What is the difference between JDK, JRE & JVM?		
- JDK is a software development environment that includes tools and libraries for developing Java applications. It includes the JRE (Java Runtime Environment) and additional development tools such as the Java compiler (javac), debugger, Java application launcher (java), Java Archiver (jar), Java documentation generator (javadoc).
- JRE is the runtime environment for executing Java applications. It includes the JVM (Java Virtual Machine) and the core libraries required to run Java programs.
- JVM is an abstract machine that executes Java bytecode. It provides a platform-independent runtime environment for Java programs to run on different platforms. 

### What is the JIT compiler?			
JIT stands for Just-In-Time compiler. It is a part of the JVM that dynamically compiles Java bytecode into native machine code at runtime. This improves the performance of Java applications by optimizing the execution of frequently executed code.
	

### Access modifiers in Java
Access modifiers in Java control the visibility and accessibility of classes, methods, variables, and other class members.
 * `public` - accessible from anywhere (other classes, different packages, etc.).
 * `protected` - accessible within same package and in subclasses (even in other packages)
 * No keyword (default)  - accessible only within the same package
 * `private` - accessible only within the same class
		
### Non-access modifiers?			
Non-access modifiers in Java provide additional functionality or behavior to classes, methods, and variables. Some common non-access modifiers are `static`, `final`, `abstract`, and `synchronized`.

### What does the static keyword do?			
The `static` keyword in Java is used to declare a member (variable or method) that belongs to the class itself, rather than to instances of the class. Static members can be accessed directly using the class name, without creating an object of the class.

### Static vs non-static method?

### What does default do in an interface method?			
The `default` keyword in Java is used to define a default implementation for a method in an interface. It allows an interface to provide a default behavior for a method, which can be overridden by implementing classes.

### static vs final
 - `static` relates to class-level behavior, while `final` ensures immutability, prevents inheritance, or restricts reassignment.
 - Static Variables and methods belong to the class itself, not to any specific instance.

 - The final keyword is used to define entities that cannot be changed later:
 - A final class cannot be subclassed. It’s used for security and efficiency reasons.
 - A final method cannot be overridden by subclasses. This ensures crucial methods remain consistent.
 - A final variable can be initialized only once, blank final instance variable must be assigned in every constructor of its class, A blank final static variable must be assigned in a static initializer, Once assigned, a final variable cannot be rebound to reference another object.
 - Static Methods can only access other static data and cannot call non-static methods unless they create an instance of the class.
 - Static Blocks are executed when the class is loaded into memory.
 - Static Nested Classes don’t implicitly reference an instance of the outer class.

### What are the different scopes in java?			
In Java, there are four different scopes:
1. Class/Static scope: Variables and methods declared as `static` belong to the class itself and can be accessed using the class name.
2. Instance scope: Variables and methods declared without the `static` keyword belong to individual instances (objects) of a class.
3. Method scope: Variables declared within a method are only accessible within that method.
4. Block scope: Variables declared within a block of code (within curly braces) are only accessible within that block.

### Explain each part of public static void main(String[] args){}			
- `public`: It is an access modifier that allows the main method to be accessed from outside the class.
- `static`: It is a keyword that allows the main method to be called without creating an object of the class.
- `void`: It is the return type of the main method, indicating that the method does not return any value.
- `main`: It is the name of the method. It is the entry point for the Java program and is called when the program starts.
- `String[] args`: It is the parameter of the main method, which allows command-line arguments to be passed to the program.

### What happens if I don’t make the main method static?			
If the main method is not declared as `static`, the Java program will compile successfully but will throw a runtime error when executed. The main method must be declared as `static` because it is called by the JVM before any objects are created.

### Difference between final and finally?			
`final` is a keyword in Java that can be applied to variables, methods, and classes. When applied to a variable, it indicates that the variable's value cannot be changed. When applied to a method, it indicates that the method cannot be overridden. When applied to a class, it indicates that the class cannot be subclassed.

`finally` is a block in Java that is used in exception handling. It is used to define a block of code that will be executed regardless of whether an exception is thrown or not. The `finally` block is typically used to release resources or perform cleanup operations.

### What is a class and object			
In Java, a class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.

An object is an instance of a class. It represents a specific entity or concept in the real world. Objects have state (values of their attributes) and behavior (methods that define what they can do).

### How to compare (equate) 2 objects in java?			
In Java, the `equals()` method is used to compare two objects for equality. By default, the `equals()` method compares the memory addresses of the objects (reference equality). However, it is common to override the `equals()` method in custom classes to define a custom equality comparison based on the object's attributes.

### What is the role of a constructor?			
A constructor is a special method in a class that is used for initializing objects. It is called automatically when an object is created using the `new` keyword. The role of a constructor is to set the initial state of an object by assigning values to its attributes.

### abstract classes vs. interfaces
 * An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods.
 * A class can inherit only one abstract class using `extends` keyword, but multiple interfaces using `implements` keyword, seperated by commas.
 * Abstract classes can contain fields and instance variables with initial values, interfaces cannot contain fields or instance variables.
 * Abstract class can contain both abstract and non-abstract methods, interface can only contain abstract methods and constants
    - a class that extends an abstract class can inherit the implementation of its non-abstract methods, whereas interfaces cannot as they cannot have non-abstract methods.
 * When a class extends an abstract class, it must provide implementations for only the abstract methods but not necessarily for the non-abstract methods, but a class that implements an interface must provide an implementation for all of its methods since they're all abstract methods.
 * abstract class is typically used as a base class for a group of related classes, interface is implemented by unrelated classes.


```
abstract class MotorVehicle {
    int fuel;

    int getFuel() {
        return this.fuel;
    }

    abstract void run();
}

class Car extends MotorVehicle {
    void run() {
        System.out.println("Wrroooooooom");
    }
}
```
```
interface MotorVehicle {
    void run();
    int getFuel();
}

class Car implements MotorVehicle {
    int fuel;

    public void run() {
        System.out.println("Wrroooooooom");
    }

    public int getFuel() {
        return this.fuel;
    }
}
```

### Can you implement multiple interfaces in Java?
Yes, in Java, a class can implement multiple interfaces. This allows the class to inherit the abstract methods defined in each interface and provide its own implementation.

### can you extend multiple classes in Java?		
No, a class cannot extend multiple classes in Java. Java does not support multiple inheritance of classes. However, a class can extend one class and implement multiple interfaces.

### What is an Enum?

### What are Wrapper classes?			
Wrapper classes in Java are classes that encapsulate primitive data types and provide utility methods for working with them. They allow primitive data types to be treated as objects. For example, the `Integer` wrapper class encapsulates the `int` primitive type.

### Describe the Collections API (List, Set, Queue, how they differ from arrays)			
The Collections API in Java is a set of classes and interfaces that implement commonly used data structures. It provides a way to store, manipulate, and retrieve collections of objects.

- List: A List is an ordered collection that allows duplicate elements. Elements in a List can be accessed by their index.

- Set: A Set is a collection that does not allow duplicate elements. It does not guarantee the order of elements.

- Queue: A Queue is a collection used for adding and removing elements in a specific order. It follows the FIFO (First-In-First-Out) principle.

Arrays, on the other hand, are fixed-size data structures that can store elements of the same type. Unlike collections, arrays cannot be resized after declaration.

### Array vs ArrayList?			
An array is a fixed-size data structure that can store elements of the same type. It has a fixed length and cannot be resized after declaration. Elements in an array can be accessed by their index.

An ArrayList is a dynamic data structure that can store elements of the same type. It can resize itself dynamically to accommodate new elements. Elements in an ArrayList can be accessed by their index, similar to an array.

### How can I remove duplicate elements from a List? (tricky one with multiple solutions, but I'd just say convert the List into a Set)			
One way to remove duplicate elements from a List is to convert the List into a Set. Since a Set does not allow duplicate elements, converting the List into a Set will automatically remove the duplicates.

### HashTable vs HashMap?	

### What is a singleton?			
A singleton is a design pattern in Java that restricts the instantiation of a class to a single object. It ensures that only one instance of the class exists throughout the application and provides a global point of access to that instance. The singleton pattern is often used for classes that control access to shared resources or manage global state.

### What is an Optional?	

### Functional Interfaces	
Functional interfaces in Java are interfaces that have a single abstract method. They are used for implementing functional programming concepts, such as lambda expressions and method references.

### Lambda expressions
Lambda expressions and streams are powerful features introduced in Java 8 that enhance the functionality and readability of Java code.

Lambda expressions allow you to write concise and functional code by providing a way to represent anonymous functions. They are particularly useful when working with functional interfaces, which are interfaces that have only one abstract method. Lambda expressions can be used to implement the abstract method of a functional interface in a more compact and expressive way.

### Streams
Streams, on the other hand, provide a declarative way to process collections of data without modifying the source data and are lazily executed. They allow you to perform operations such as filtering, mapping, and reducing on a collection in a concise and efficient manner. Streams can greatly simplify the code required to perform common data processing tasks.

Streams are divided into intermediate and terminal operations:
 - intermediate operations include map, filter, distinct, sorted, limit, and skip
 - terminal operations include forEach, collect, reduce, count, min, max, anyMatch, allMatch, and noneMatch
    - Reduction operations take a sequence of elements and combine them into a single result. Stream classes have the reduce() and collect() methods for this purpose
    - Collectors are used to accumulate stream elements into a result container such as a List, Set, Map, or custom data structure. Common collectors include toList, toSet, toMap, joining, groupingBy, and partitioningBy

### Filter a list of objects using Streams
Here's an example of using lambda expressions and streams to filter and map a list of integers:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

List<Integer> evenSquares = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .map(n -> n * n)
                                   .collect(Collectors.toList());

In this example, the stream() method is called on the numbers list to create a stream. The filter() method is then used to keep only the even numbers, and the map() method is used to square each number. Finally, the collect() method is used to collect the results into a new list.

### What is Java Memory ? Describe Stack and Heap.			
Java Memory refers to the memory used by a Java program during its execution. It is divided into two main areas: the stack and the heap.

The stack is used for storing method frames, local variables, and method calls. It is a LIFO (Last-In-First-Out) data structure and is used for managing method invocations and local variables.

The heap is used for storing objects and dynamically allocated memory. It is a region of memory shared by all threads in a Java program and is managed by the JVM's garbage collector.

### What is the garbage collector? Can you force garbage collection?			
The garbage collector in Java is a part of the JVM that automatically manages the memory used by objects. It identifies objects that are no longer reachable and frees up the memory occupied by those objects.

In Java, you cannot force garbage collection explicitly. The JVM decides when to run the garbage collector based on factors such as available memory and CPU usage. However, you can suggest the JVM to run the garbage collector using the `System.gc()` method, but it does not guarantee immediate garbage collection.

### Threads/Runnable			
Threads and Runnable are used for concurrent programming in Java. Threads represent individual execution paths, and Runnable is a functional interface used for defining the code that a thread will execute.

### Tell me about the different kinds of exceptions. What are some examples of checked and unchecked exceptions? (AKA compile-time run-time)			
In Java, exceptions are categorized into two types: checked exceptions and unchecked exceptions.

Checked exceptions are exceptions that must be declared in the method signature or handled using a try-catch block. Examples of checked exceptions include `IOException`, `SQLException`, and `ClassNotFoundException`.

Unchecked exceptions, also known as runtime exceptions, do not need to be declared or caught explicitly. They are usually caused by programming errors or unexpected conditions. Examples of unchecked exceptions include `NullPointerException`, `ArrayIndexOutOfBoundsException`, and `ArithmeticException`.

### How do you handle exceptions?			
Exceptions in Java can be handled using try-catch blocks. The code that may throw an exception is placed inside the try block, and the catch block is used to catch and handle the exception. Multiple catch blocks can be used to handle different types of exceptions.

Alternatively, exceptions can be propagated to the calling method using the `throws` keyword, indicating that the method may throw an exception and the calling method should handle it.

### How do exceptions and errors differ?			
In Java, exceptions and errors are both subclasses of the `Throwable` class, but they represent different types of problems.

Exceptions are typically caused by the application's code and can be caught and handled. They are recoverable and do not necessarily indicate a severe problem. Examples of exceptions include `IOException` and `NullPointerException`.

Errors, on the other hand, are typically caused by the environment or system and are usually unrecoverable. They indicate serious problems that cannot be handled by the application. Examples of errors include `OutOfMemoryError` and `StackOverflowError`.

### What is unit testing? How do we do it in Java?			
Unit testing is a software testing technique where individual units (methods or functions) of a program are tested to ensure that they work correctly. It helps in identifying bugs and verifying the behavior of individual units in isolation.

In Java, unit testing is commonly done using a testing framework such as JUnit. JUnit provides annotations and assertions for writing test cases. Test cases are written as methods that test specific units of code, and assertions are used to verify the expected behavior of the code.

### How do you create a unit test with JUnit?

### versions of and java 
As of 2024, the most commonly used Java versions and their notable features are:

Java 8: This version is widely used due to its introduction of lambda expressions, streams, and the new Date-Time API. It remains popular in many legacy systems1.
Java 11: As a Long-Term Support (LTS) version, Java 11 is favored for its new features like the HttpClient API, local-variable syntax for lambda parameters, and the launch of single-file source-code programs1.
Java 17: Another LTS version, Java 17 is known for pattern matching for switch (preview), sealed classes, and the new macOS rendering pipeline. It’s often chosen for new projects due to its stability and performance improvements1.
Java 21: The latest LTS version as of 2023, Java 21 introduced string templates (preview), sequenced collections, generational ZGC, and virtual threads, among other features1.
Java 22: The most recent release, Java 22, brought in region pinning for G1, statements before super (…), foreign function & memory API, and implicitly declared classes and instance main methods (second preview)








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





# HTTP			
What is HTTP?			
What is an API?			
What are https status codes? Example of different types of http status codes?			
What are https verbs? Example of different types of http status verbs?			
What is postman used for?			
            
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



# React/Frontend			
What is the difference between XML , HTML & HTML5?			
Explain what you know about HTML and CCS?			
What does HTML stand for?			
What is a promise?			
What is the advantage of using React as opposed to using plain Javascript			
Tell me about the virtual DOM.			
What is TSX? (they may ask about JSX, just remind them we used React Typescript and TSX, not JSX)			
What are components in React?			
How do you create a component in React?			
What is "export" in React?			
What is props and state?			
Can you send props from child to parent?			
How does Routing work in React? How did you you create routes?			
What is the component lifecycle in react? (class component question)			
Describe the function component hooks you've used			
What is axios? What have you used it for?			
How can I render a list of elements in React?			
How can I conditionally render content in React?	
### How is React compared to Angular? What is React?


## Security / Authentication
How did you use Postman to check for user authentication (JWT tokens)?
            
# Cloud/SDLC			
What Agile processes have you used?			
What is retrospective in Agile?			
What AWS services have you used?			
How do you host projects on AWS?			
Briefly describe Iaas, Paas, Saas and describe one of them more in-depth.			
### explain mv architecture
MV architecture is a software architectural pattern primarily used in web development. The term has several variants, such as Model-View-Controller (MVC), Model-View-Presenter (MVP), and Model-View-ViewModel (MVVM)
 * Model is the business logic and data layer of the application, responsible for handling the application state, including computations and database interactions.
 * View is the presentation layer, mainly responsible for how the user interface is displayed, including the structure and layout.
 * Controller/Presenter/ViewModel: This component varies depending on the specific MV* pattern used. It defines how the Model and View interact with each other, especially when there are changes in the data due to user interactions.
For example, in the MVC pattern:
 1. The View displays the user interface.
 2. When a user interacts with the interface, the View sends the event to the Controller.
 3. The Controller processes this input, updates the Model, and then instructs the View to change accordingly

### What are MicroServices?
Microservices architecture, is an approach to building applications as a suite of small, independent services, each running in its own process and communicating with lightweight mechanisms, often an HTTP resource API. They are built around business capabilities and independently deployable by fully automated deployment machinery. They are Loosely Coupled, Highly Maintainable and Testable, Scalable, 

### How did you deploy your project?
Structure/Deployment/Description of recent project?

### DevOps of recent project?

### Different types of design pattern
### what is partial class
### Explain latest project you did.

# Git			
### What is your experience with GitHub?		
GitHub is a web-based platform used for version control and collaboration. It allows developers to host and manage their Git repositories. It provides features such as issue tracking, pull requests, and project management tools.

### State basic commands (pushing to repo, pulling from repo).
Basic commands for pushing to a repository in Git are:

git add . (to stage all changes)
git commit -m "commit message" (to commit the changes)
git push origin branchname (to push the changes to the remote repository)
Basic commands for pulling from a repository in Git are:

git pull origin branchname (to fetch and merge the changes from the remote repository)

### What is a branch?			
A branch in Git is a lightweight movable pointer to a commit. It allows developers to work on different features or bug fixes in parallel without affecting the main branch. Branches can be created, switched between, and merged back into the main branch.

### How to merge a branch?
To merge a branch into the main branch, you can use the command git merge branchname. This command should be run from the branch you want to merge into (usually the main branch). It combines the changes from the specified branch into the current branch.	




______________________________________________________________________________________________


## Soft Skill
How do you fight for an idea you have over someone else’s idea?

## Software Development
What are the SDLC Phases?
What are the difference between Waterfall and Agile?
Do know know about agile tool?
What is maintenance phase?
In what environment do you develop?
How do you log (stack trace)
Where did you implement REST API?

## OOP
Explain what OOP is?
What are the OOP principles?

## Java
Why use Java? What is the JIT? What does the JIT do?
What is Static?
How would you swap 2 int variables without a 3rd variable (Math)
Strings, why is a string immutable, what are Strings?
Collections
Exception handling
Throws vs Throw
How is Java memory Structured?
Say I want to have a sorted data set of students which collection would you use (tree set)
Multithreading, what would cause a blockage?

## DB
Relational Database vs. NoSQL databases.
SQL Function vs stored procedure
How do you insert into table?

## AI
Where did you implement AI?
What is AI?
