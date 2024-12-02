# Spring

## Spring Bean
* A bean is an object that forms the backbone of a spring application and is managed by the Spring IoC (Inversion of Control) container1.
* The IoC container handles the instantiation, assembly, and management of these beans.
* In simpler terms, a _bean_ is an _object_ that the Spring framework manages automatically.

## IoC (Inversion of Control)
* IoC is a process where an object defines its dependencies without creating them directly.
* Instead, the object delegates the responsibility of constructing its dependencies to an IoC container.
* The IoC container takes care of creating and managing these objects, allowing you to focus on your application’s logic.

Example:
Consider two domain classes: Company and Address.
Normally, we create objects using their constructors:

```
Address address = new Address("High Street", 1000);
Company company = new Company(address);
```

* With Spring beans, we can define these dependencies in a better way using configuration metadata (e.g., XML <bean/> definitions).
* The Spring IoC container will handle the instantiation and wiring of these objects, making it easier to manage dependencies across your application.

## Benefits of Spring Beans:
* Dependency Management: Spring beans allow you to express and manage dependencies between objects.
* Scalability: Managing a large number of objects becomes more manageable.
* Reuse: You can share a single instance of a class across the entire application.
* Lifecycle Management: Spring beans provide hooks for initialization and destruction.
* Autowiring: Beans can be automatically wired together based on their types.
In summary, Spring beans are the building blocks of your application, and the Spring IoC container ensures their proper management and wiring. 