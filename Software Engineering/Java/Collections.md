# Arrays
An array is a contiguous block of memory storing a group of sequentially stored elements of the same type. Arrays in Java are of a fixed size and cannot be resized after declaration. Arrays are declared with square brackets after the type of the array like so:
```java
int[] myInts = new int[]{1, 2, 3, 4};
String[] languages = {"Java", "JavaScript", "SQL"};
int[] intArray = new int[20];
```

Items in an array are referenced via their index in square bracket notation, which begins with `0` for the first element. Arrays also have a `length` property specifying the length of the array. This is helpful when iterating over arrays with a `for` loop:
```java
String[] myArr = {"first", "second", "third"};
for (int i = 0; i < myArr.length; i++) {
  System.out.println(myArr[i]);
}
```

# Collections Framework
The Collections framework in Java is a set of classes and interfaces that implement commonly used data structures. A collection is a single object which acts as a container for other objects. The Collections API is organized in a class hierarchy shown in simplified version below:

<img src = "https://javaconceptoftheday.com/wp-content/uploads/2014/11/CollectionHierarchy.png" width = "600">

The important interfaces in the Collections API are:
* `Iterable` - guarantees the collection can be iterated over
* `List` - an ordered collection
* `Set` - a collection does not contain duplicates
* `Queue` - a collection that operates on a first-in-first-out (FIFO) basis
* `Map` - contains key/value pairs. Does not extend `Iterable`.

# List Interface
A `List` is a collection that is ordered and preserves the order in which elements are inserted into the list. Contrary to sets, duplicate entries are allowed. Also, elements are accessed by their index, which begins with 0 for the first element in the list.

## ArrayList
An `ArrayList` is a concrete class which implements `List`. It is a data structure which contains an array within it, but can resize dynamically. Once it reaches maximum capacity, an `ArrayList` will increase its size by 50% by copying its elements to a new (internal) array. Traversal is fast (constant time) because elements can be randomly accessed via index, just like an array. Insertion or removal of elements is slow, however (linear time, since there is a risk of having to resize the underlying array).

## LinkedList
A `LinkedList` implements both the `List` and `Queue` interfaces, so it has all methods in both interfaces. The data structure is composed of nodes internally, each with a reference to the previous node and the next node - i.e. a doubly-linked list. Because of this structure, insertion or removal of elements is fast (no risk to resize, just change the nearest references), but traversal is slow for an arbitrary index (linear time).

### Vector
`Vector` is an older class which implements `List` - it is essentially a thread-safe implementation of an `ArrayList`.


# Set Interface
`Set` is an interface which defines a data structure which:
* is NOT index driven
* only allows unique elements
* generally DOES NOT preserve the order in which elements were inserted

### HashSet
A `HashSet` implements `Set` and is backed by a `HashMap`. It:
* Guarantees no ordering when iterating
* Allows one `null` value
* Allows fast insertion and traversal
* Does not maintain order in which you insert elements

### TreeSet
A `TreeSet` is a `Set` whose elements maintain sorted order when inserted. Internally, it is backed by a Sorted Tree. Insertion and removal of elements is slow, because the elements must maintain sorted order. It cannot contain any `null` values, since `null` cannot be compared to any object.

## Stack
`Stack` is an older implementation of the stack data structure (last-in-first-out, or LIFO). Generally you should use an `ArrayDeque` for implementing a stack.


## Queue Interface
A `Queue` is a data structure used when elements should be added and removed in a specific order. Unless specified, elements are ordered FIFO (first-in-first-out). Some useful methods declared are:
* `offer()`
* `peek()`
* `poll()`

### ArrayDeque
Pronounced as 'array-deck', this concrete class can be implemented for either the queue or stack data structure. It is an implementation of a pure double-ended queue (elements can be added or removed from either end of the queue). An `ArrayDeque` stores elements in a resizable array internally, and it has a few extra useful methods defined:
* `pop()`
* `push()`
* `peekFirst()`
* `peekLast()`
* `pollFirst()`
* `pollLast()`
* `offerFirst()`
* `offerLast()`

| Operation | Throws Exception | Returns null |
| --------- | ---------------- | ------------ |
| Insert    | `boolean add(E e)`|`boolean offer(E e)`|
| Remove    | `E remove()` | `E poll()` |
| Examine   | `E element()`| `E peek()`|


# Collections Class
The [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) class - not to be confused with the Collection interface - defines many `static` helper methods which operate on any given collection. Use this class for help with sorting, searching, reversing, or performing other operations on collections.


## Java			
### What is the difference between JDK, JVM, & JRE?			
JDK stands for Java Development Kit, which is a software development environment used for developing Java applications. It includes the Java compiler, runtime environment, and other tools.

JVM stands for Java Virtual Machine, which is an abstract machine that executes Java bytecode. It provides a runtime environment for Java programs to run on different platforms.

JRE stands for Java Runtime Environment, which is a subset of the JDK. It includes the JVM and other libraries required to run Java applications.

### What is the JIT compiler?			
JIT stands for Just-In-Time compiler. It is a part of the JVM that dynamically compiles Java bytecode into native machine code at runtime. This improves the performance of Java applications by optimizing the execution of frequently executed code.

### What is Java Memory ? Describe Stack and Heap.			
Java Memory refers to the memory used by a Java program during its execution. It is divided into two main areas: the stack and the heap.

The stack is used for storing method frames, local variables, and method calls. It is a LIFO (Last-In-First-Out) data structure and is used for managing method invocations and local variables.

The heap is used for storing objects and dynamically allocated memory. It is a region of memory shared by all threads in a Java program and is managed by the JVM's garbage collector.

### What is OOP? Elaborate on the four pillars			
OOP stands for Object-Oriented Programming. It is a programming paradigm that organizes software design around objects, which are instances of classes. The four pillars of OOP are:

1. Encapsulation: It is the process of hiding the internal details of an object and providing a public interface for interacting with the object. It helps in achieving data abstraction and data security.

2. Inheritance: It is the process of creating new classes by inheriting properties and behaviors from existing classes. It promotes code reuse and allows for the creation of hierarchical relationships between classes.

3. Polymorphism: It is the ability of an object to take on many forms. It allows objects of different classes to be treated as objects of a common superclass. Polymorphism enables dynamic method dispatch and method overriding.

4. Abstraction: It is the process of simplifying complex systems by breaking them down into smaller, more manageable parts. It allows for the creation of abstract classes and interfaces, which define common behaviors and can be implemented by multiple classes.

### What are Wrapper classes?			
Wrapper classes in Java are classes that encapsulate primitive data types and provide utility methods for working with them. They allow primitive data types to be treated as objects. For example, the `Integer` wrapper class encapsulates the `int` primitive type.

### Describe abstraction and polymorphism?			
Abstraction is the process of simplifying complex systems by breaking them down into smaller, more manageable parts. It involves creating abstract classes and interfaces that define common behaviors and can be implemented by multiple classes.

Polymorphism is the ability of an object to take on many forms. It allows objects of different classes to be treated as objects of a common superclass. Polymorphism enables dynamic method dispatch and method overriding.

### "Java basics, access modifiers, threads/runnable, functional interfaces"			
Java basics refer to the fundamental concepts and syntax of the Java programming language, such as variables, data types, control structures, and object-oriented programming.

Access modifiers in Java are keywords that determine the accessibility of classes, methods, and variables. They include `public`, `private`, `protected`, and `default` (no modifier).

Threads and Runnable are used for concurrent programming in Java. Threads represent individual execution paths, and Runnable is a functional interface used for defining the code that a thread will execute.

Functional interfaces in Java are interfaces that have a single abstract method. They are used for implementing functional programming concepts, such as lambda expressions and method references.

### What is a class and object			
In Java, a class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.

An object is an instance of a class. It represents a specific entity or concept in the real world. Objects have state (values of their attributes) and behavior (methods that define what they can do).

### What is the role of a constructor?			
A constructor is a special method in a class that is used for initializing objects. It is called automatically when an object is created using the `new` keyword. The role of a constructor is to set the initial state of an object by assigning values to its attributes.

### abstract classes vs. interfaces			
Abstract classes and interfaces are both used for defining common behaviors that can be implemented by multiple classes. However, there are some differences between them:

- An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods.
- A class can extend only one abstract class, but it can implement multiple interfaces.
- An abstract class can have instance variables, while an interface cannot.
- An abstract class can provide default implementations for its methods, while an interface cannot.

### Can you implement multiple interfaces in Java? can you extend multiple classes?			
Yes, in Java, a class can implement multiple interfaces. This allows the class to inherit the abstract methods defined in each interface and provide its own implementation.

No, a class cannot extend multiple classes in Java. Java does not support multiple inheritance of classes. However, a class can extend one class and implement multiple interfaces.

### What does the static keyword do?			
The `static` keyword in Java is used to declare a member (variable or method) that belongs to the class itself, rather than to instances of the class. Static members can be accessed directly using the class name, without creating an object of the class.

### What does default do in an interface method?			
The `default` keyword in Java is used to define a default implementation for a method in an interface. It allows an interface to provide a default behavior for a method, which can be overridden by implementing classes.

### What are the different scopes in java?			
In Java, there are four different scopes:

1. Class/Static scope: Variables and methods declared as `static` belong to the class itself and can be accessed using the class name.

2. Instance scope: Variables and methods declared without the `static` keyword belong to individual instances (objects) of a class.

3. Method scope: Variables declared within a method are only accessible within that method.

4. Block scope: Variables declared within a block of code (within curly braces) are only accessible within that block.

### Tell me about access and non-access modifiers?			
Access modifiers in Java control the accessibility of classes, methods, and variables. They include `public`, `private`, `protected`, and `default` (no modifier).

Non-access modifiers in Java provide additional functionality or behavior to classes, methods, and variables. Some common non-access modifiers are `static`, `final`, `abstract`, and `synchronized`.

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

### How to compare (equate) 2 objects in java?			
In Java, the `equals()` method is used to compare two objects for equality. By default, the `equals()` method compares the memory addresses of the objects (reference equality). However, it is common to override the `equals()` method in custom classes to define a custom equality comparison based on the object's attributes.

### Overloading vs Overriding?			
Overloading is the process of defining multiple methods with the same name but different parameters in the same class. The methods must have different parameter lists (number, type, or order of parameters). Overloading allows a class to have multiple methods with the same name but different behaviors.

Overriding is the process of providing a different implementation for a method in a subclass that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass. Overriding allows a subclass to provide its own implementation of a method inherited from its superclass.

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

### What is a singleton?			
A singleton is a design pattern in Java that restricts the instantiation of a class to a single object. It ensures that only one instance of the class exists throughout the application and provides a global point of access to that instance. The singleton pattern is often used for classes that control access to shared resources or manage global state.

### What is the garbage collector? Can you force garbage collection?			
The garbage collector in Java is a part of the JVM that automatically manages the memory used by objects. It identifies objects that are no longer reachable and frees up the memory occupied by those objects.

In Java, you cannot force garbage collection explicitly. The JVM decides when to run the garbage collector based on factors such as available memory and CPU usage. However, you can suggest the JVM to run the garbage collector using the `System.gc()` method, but it does not guarantee immediate garbage collection.

### What is unit testing? How do we do it in Java?			
Unit testing is a software testing technique where individual units (methods or functions) of a program are tested to ensure that they work correctly. It helps in identifying bugs and verifying the behavior of individual units in isolation.

In Java, unit testing is commonly done using a testing framework such as JUnit. JUnit provides annotations and assertions for writing test cases. Test cases are written as methods that test specific units of code, and assertions are used to verify the expected behavior of the code.

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



