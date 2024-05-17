# Organized Infosys Playbook

This is a consolidated list of Infosys interview questions compiled through the years. I only included content relevant to us (Java Full Stack with React and AWS)			
Remember to try answering with "what why and how" when possible - definition, use case, and implementation 			
ALSO - don't assume this is all they can ask you. Please study up on the entire curriculum. Remember these are just gathered from previous interviews.			
            
## Soft Skills/Non Technical			

### Tell me about yourself (VERY common - you should have a 2-3 sentence answer ready for this. (Where did you graduate? What did you study? What work have you done til now?)	
My name is Ihtheram Chowdhury, I am graduated with a Bachelor of Science Degree in Computer Science and Engineering. During the undergraduate years I have studied different aspects of software, hardware, telecommunication, neworking, web programming, AI, and learned programming languages and some libraries of C, Java, Python, also learned SQL Database, git commands etc. After graduation, I worked as a substitute employee in Paterson Public Schools and also at the same time I was applying for IT jobs through LinkedIn Job postings through which I ended up getting a job offer from Revature where I am currently working. At Revature, after I trained for few months, started working on projects using technologies like Java, Spring Boot, React etc.

### How do you handle team conflict?
Handling team conflict effectively involves several key steps:

 1. Acknowledge that there is a disagreement that needs to be addressed. approach the conflict with a positive mindset to identify the root causes of the conflict.
 2. Ensure that team members feel safe to express their thoughts and feelings and encourage all parties to speak openly and listen to each other without interrupting.
 3. Collaborate to find solutions that are acceptable to all parties involved and take steps to implement the agreed-upon solutions.
 8. Check in with the team after implementing the solutions to ensure the conflict has been resolved and to prevent future issues.

It’s important to approach conflict with a positive mindset, seeing it as an opportunity for growth and improvement rather than a setback. Effective communication, empathy, and a willingness to compromise are crucial in resolving team conflicts. Remember, the goal is to strengthen the team and improve collaboration, not to win an argument.
			

### Do you see yourself as leader of a team? (there's no wrong answer to this besides something like "yes I'm better than everyone" or "no I hate people")			
I have never got the chance to lead a team. But if I ever get a chance to lead, I would lead with perseverance, 


### Tell me something interesting about your schooling.			

### What conflicts/challenges happened in any of your 3 projects?			

### Are you willing to learn different programming languages?			

### Describe what part of your most recent project you worked on and how you went about designing it			

### Describe a moment where you failed?			

### What makes you excited or passionate about software development?			

### Do you prefer working on the frontend or the backend?			
            
## Java			
### What is the difference between JDK, JVM, & JRE?			
### What is the JIT compiler?			
### What is Java Memory ? Describe Stack and Heap.			
### What is OOP? Elaborate on the four pillars			
### What are Wrapper classes?			
### Describe abstraction and polymorphism?			
### "Java basics, access modifiers, threads/runnable, functional interfaces"			
### What is a class and object			
### What is the role of a constructor?			
### abstract classes vs. interfaces			
### Can you implement multiple interfaces in Java? can you extend multiple classes?			
### What does the static keyword do?			
### What does default do in an interface method?			
### What are the different scopes in java?			
### Tell me about access and non-access modifiers?			
### Tell me about the different kinds of exceptions. What are some examples of checked and unchecked exceptions? (AKA compile-time run-time)			
### How do you handle exceptions?			
### How do exceptions and errors differ?			
### How to compare (equate) 2 objects in java?			
### Overloading vs Overriding?			
### Explain each of the part of public static void main(String[] args){}			
### What happens if I don’t make the main method static?			
### Difference between final and finally?			
### What is a singleton?			
### What is the garbage collector? Can you force garbage collection?			
### What is unit testing? How do we do it in Java?			
### Describe the Collections API (List, Set, Queue, how they differ from arrays)			
### Array vs ArrayList?			
### How can I remove duplicate elements from a List? (tricky one with multiple solutions, but I'd just say convert the List into a Set)			
### HashTable vs HashMap?			
### What is an Optional?			
            
SQL			
Tell me about the different SQL sublanguages? Can you name several operations/statements per each sublanguage?			
How can you alter a table without deleting it?			
How do you create a table in SQL?			
How do you define foreign keys?			
How to select all from a DB? 			
How to filter the results of a select? (where clause)			
What does GROUP BY do in SQL?			
Name and describe some SQL joins			
What SQL functions are you aware of?			
            
HTTP			
What is HTTP?			
What is an API?			
What are https status codes? Example of different types of http status codes?			
What are https verbs? Example of different types of http status verbs?			
What is postman used for?			
            
Spring			
What is Spring? Spring Boot?			
How would you set up a spring boot project?			
What are some annotations you've used?			
What is the purpose of the @Component annotation?			
What are Spring Beans?			
What Bean Scopes are you aware of?			
Describe Spring MVC Controllers?			
How would you handle http calls/mappings using Spring Boot?			
What is spring data? What are the JPA annotations?			
What does the @entity annotation do			
How do you handle database interactions with spring data?			
What is Autowiring?			
What is spring initializer?		NOTE - if they ask about "component lifecycle methods" they're probably referring to class components. Don't be afraid to say you haven't used them!	
            
React/Frontend			
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
            
Cloud/SDLC			
What Agile processes have you used?			
What is retrospective in Agile?			
What AWS services have you used?			
How do you host projects on AWS?			
Briefly describe Iaas, Paas, Saas and describe one of them more in-depth.			
            
Git			
What is your experience with GitHub?			
basic commands (pushing to repo, pulling from repo)			
What is a branch?			
How to merge a branch?			


### Abstract class vs interface
 - An abstract class is a class that cannot be instantiated, an interface is a collection of abstract methods that can be implemented by any class.
 - a class can only extend one abstract class, but it can implement multiple interfaces.
 - Abstract classes can contain fields and instance variables with initial values, interfaces cannot contain fields or instance variables.
 - abstract class can contain both abstract and non-abstract methods, interface can only contain abstract methods and constants
 - a class that extends an abstract class can inherit the implementation of its non-abstract methods, 
whereas interfaces cannot as they cannot have non-abstract methods.
 - When a class inherits from an abstract class, it must provide implementations for all abstract methods a class that implements an interface must provide an implementation for all of its methods since they're all abstract methods.
 - abstract class is typically used as a base class for a group of related classes, interface is implemented by unrelated classes.
 - Abstract classes can contain fields and instance variables with initial values, interfaces cannot contain fields or instance variables.
 - abstract class can contain both abstract and non-abstract methods, interface can only contain abstract methods and constants
 

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

### Lambda expressions and streams

Lambda expressions and streams are powerful features introduced in Java 8 that enhance the functionality and readability of Java code.

Lambda expressions allow you to write concise and functional code by providing a way to represent anonymous functions. They are particularly useful when working with functional interfaces, which are interfaces that have only one abstract method. Lambda expressions can be used to implement the abstract method of a functional interface in a more compact and expressive way.


Streams, on the other hand, provide a declarative way to process collections of data without modifying the source data and are lazily executed. They allow you to perform operations such as filtering, mapping, and reducing on a collection in a concise and efficient manner. Streams can greatly simplify the code required to perform common data processing tasks.

Streams are divided into intermediate and terminal operations:
 - intermediate operations include map, filter, distinct, sorted, limit, and skip
 - terminal operations include forEach, collect, reduce, count, min, max, anyMatch, allMatch, and noneMatch
    - Reduction operations take a sequence of elements and combine them into a single result. Stream classes have the reduce() and collect() methods for this purpose
    - Collectors are used to accumulate stream elements into a result container such as a List, Set, Map, or custom data structure. Common collectors include toList, toSet, toMap, joining, groupingBy, and partitioningBy

Here's an example of using lambda expressions and streams to filter and map a list of integers:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

List<Integer> evenSquares = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .map(n -> n * n)
                                   .collect(Collectors.toList());

In this example, the stream() method is called on the numbers list to create a stream. The filter() method is then used to keep only the even numbers, and the map() method is used to square each number. Finally, the collect() method is used to collect the results into a new list.

Lambda expressions and streams are powerful tools that can greatly simplify and enhance your Java code. They are worth exploring and mastering to improve your programming skills.

### Database basics

### Spring Data
 - simplifies integration with various data storage technologies within spring framework, including relational databases, NoSQL databases, and graph databases.
 - abstracts away low-level database-specific queries by inroducing the concept of repositories, which hide the complexity of data access. These repositories offer common CRUD operations and offers to choose modules for repository support. Some Modules are, Spring Data JDBC, Spring Data JPA, Spring Data MongoDB


### AWS cloud services

### Different types of design pattern
### what is partial class
### access modifiers in Java
Access modifiers in Java control the visibility and accessibility of classes, methods, variables, and other class members.
 * `public` - accessible from anywhere (other classes, different packages, etc.).
 * `protected` - accessible within same package and in subclasses (even in other packages)
 * No keyword (default)  - accessible only within the same package
 * `private` - accessible only within the same class
 

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

### functional interface
### overloading vs overriding
### explain mv architecture
MV architecture is a software architectural pattern primarily used in web development. The term has several variants, such as Model-View-Controller (MVC), Model-View-Presenter (MVP), and Model-View-ViewModel (MVVM)
 * Model is the business logic and data layer of the application, responsible for handling the application state, including computations and database interactions.
 * View is the presentation layer, mainly responsible for how the user interface is displayed, including the structure and layout.
 * Controller/Presenter/ViewModel: This component varies depending on the specific MV* pattern used. It defines how the Model and View interact with each other, especially when there are changes in the data due to user interactions.
For example, in the MVC pattern:
 1. The View displays the user interface.
 2. When a user interacts with the interface, the View sends the event to the Controller.
 3. The Controller processes this input, updates the Model, and then instructs the View to change accordingly

### versions of and java 
As of 2024, the most commonly used Java versions and their notable features are:

Java 8: This version is widely used due to its introduction of lambda expressions, streams, and the new Date-Time API. It remains popular in many legacy systems1.
Java 11: As a Long-Term Support (LTS) version, Java 11 is favored for its new features like the HttpClient API, local-variable syntax for lambda parameters, and the launch of single-file source-code programs1.
Java 17: Another LTS version, Java 17 is known for pattern matching for switch (preview), sealed classes, and the new macOS rendering pipeline. It’s often chosen for new projects due to its stability and performance improvements1.
Java 21: The latest LTS version as of 2023, Java 21 introduced string templates (preview), sequenced collections, generational ZGC, and virtual threads, among other features1.
Java 22: The most recent release, Java 22, brought in region pinning for G1, statements before super (…), foreign function & memory API, and implicitly declared classes and instance main methods (second preview)

### versions of SpringBoot
Spring Boot 2.1.x: This series introduced support for Java 11, which was the latest LTS version of Java at the time. It also brought enhancements to Spring Data and Actuator endpoints1.
Spring Boot 2.2.x: Added support for Java 13 and improved configuration property binding. It also introduced RSocket support, a new protocol for reactive networking1.
Spring Boot 2.3.x: Focused on Docker with features for building Docker images with Cloud Native Buildpacks. It also introduced graceful shutdown and liveness/readiness probes for Kubernetes deployments1.
Spring Boot 2.5.x: This version continued to refine Docker support and introduced a new version of the Spring Native experimental project, which allows compiling Spring applications to native executables using GraalVM1.
Spring Boot 2.6.x: Brought improvements to the Actuator, including new endpoints and features. It also enhanced the application startup performance and introduced support for GraphQL1.
Spring Boot 3.0.x: Marked a major upgrade with the baseline set to Spring Framework 6.0. It introduced native compilation support with GraalVM and many other features aligned with Java 17 LTS2.
Spring Boot 3.1.x: Continued to build on the foundation of the 3.0.x series with updates to the Spring ecosystem components and further refinements1.
Spring Boot 3.2.x: The latest series as of May 2024, which includes version 3.2.5, continues to refine the framework with updates to dependencies and modules1.


### Explain latest project you did.



tell me about yourself
What spring annotations have you used?
@RequestMapping vs @GetMapping
HTTP verbs
Have you worked with Spring Boot Actuator?
From the frontend, how to get API requests from backend? -> how to get request from backend and render
a table with those items on the frontend?
Have you used @Bean or @Component?
What is dependency injection?
Constructor injection?
List vs Set vs Array?
How to handle exceptions?
Finally keyword?
Static vs non-static method?
Access modifiers (public, private, protected)
He gave an example scenario and asked how I would implement handle exceptions
How did you use Postman to check for user authentication (JWT tokens)?
How do you create a unit test with JUnit?
"*" in SQL
What is a foreign key in SQL?
Have you worked with indexes in SQL?
Coding question in IDE about filtering a list of objects using Streams

I tried to put the topics I remember off the top of my head. They might have asked some "have you used x?" that I forgot about already. Just say no and they won't press you further.

What is your background with IT?
Are you currently working?
Why is Java important?
Pillars of OOP? Specifically asked Inheritance
What are Collections?
What is an Enum?
How did you deploy your project?
How is React compared to Angular? What is React?
Have you worked with Spring/Spring BOOT?
List 3-4 annotations. What is Autowired?
Structure/Deployment/Description of recent project?
MicroServices?
DevOps of recent project?