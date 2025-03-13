# DS&A
* What are data structures?
    - Is used to organize, manage and store data
    - Enables efficient access and modification when applied correctly to a specific situation/problem 
* What is a linked list?
    + Linear data structure, in which elements are not stored at contiguous memory locations
    + Elements are linked using pointers 
    + Linked lists are dynamic meaning that they can increase or decrease in size
* What is a single linked list?
    + Defined as all nodes are linked together in a few sequential manner, hence it is also known as a linear linked list
    + Clearly is has the beginning and the end. 
    + Main problem is that we cannot access the predecessor of the node from the current node
* What are some advantages of a singly linked list?
    + Insertions and deletions can be done easily in O(1) time
    + Space is not wasted as we can get space according to our requirements
* what are some disadvantages of a singly linked list?
    + Accessing the preceding node of a current node is not possible as there is no backward traversal
    + If we have to go to a particular element then we have to go through all those elements that come before that element in O(n) time
    + We cannot traverse it starting from the end node, we can only do so from the beginning first node
* What is a double linked list?
    + Similar to a linked list but here each node has an extra pointer that stores the address of the previous node 
    + Internally, the `java.util.LinkedList` is implemented using a Doubly Linked List Data Structure
* What are some advantages to a Doubly Linked List?
    + Allows us to iterate in both directions
    + We can delete a node easily as we have access to its previous node
    + Reversing is easy
* What are some disadvantages to a Doubly Linked List?
    + Compared to a singly linked list, each node stores an extra pointer which consumes extra memory
    + Operations require more time due to the overhead of handling extra pointers as compared to singly-linked lists
* Where would we use Linked Lists/Doubly Linked Lists?
    + Can be used to implement various data structures like hash-tables, stacks, binary trees etc.
    - Can be used to implement functionalities such as undo/redo
    - Used by a thread scheduler in many OS to maintain a list of all running processes
    - Can also be used in games e.g. representing a deck of cards
    - Can be used in any software that requires forward and backward navigation e.g. music players, in web-browsers to move between previously visited and current page etc.
* What is a map?
    - Has a key value pair and allows for fast look up for the value if the key is known
* What are some real world uses for maps?
    - A map of the zip code and cities
    - A map of regions and the countries in each region
* Can maps contain duplicate keys?
    - No, each key can only be mapped to 1 value
* Do maps allow for null keys and null values?
    - Specific implmentations allow it such as HashMap and LinkedHashMap
    - TreeMap does not support null keys and null values
* What is a stack?
    - Linear data type with a predefined capacity or boundary
    - Last In First Out (LIFO) or First In Last Out (FILO) ordering
* What are some benefits of using stacks?
    - Implement functions, parsers, expression evaluation, and some algorithms
    - Great for processing nested structures
* What would be a simple real-world application of a stack?
    - Reversing a string letter by letter
    - Undo and redo function on a computer or text editor
* What is a queue?
    - Linear structure that follows a First In First Out (FIFO) order
    - Queues open from both ends
        - One end for inserting data (enqueue), and the other for removing data (dequeue)
    - Stack is only open from one end
* What is a deque?
    - Elements can be added or removed from either the front or back of the queue
    - Short for double ended queue
* When would we want to use a linked list over an ArrayList?
    + When we have a ton of insertions and deletions
    + Linkedlist insertion/deletion is O(1) while ArrayList insertion/deletion is O(n)
* What is a set?
    - Stores unordered elements 
    - Cannot contain duplicate elements
* What is a Hash Set?
    - Hash set stores the elements by using a mechanism called hashing
    - HashSet contains unique elements only
    - HashSet allows null values
    - HashSet is non-synchronized

## Design patterns
* What are Singleton / Factory design patterns?
  * Singleton - allows for creation of only 1 object. Method for retrieving object returns reference to the same object in memory. Implement via private constructor
  * Factory - abstracts away instantiation logic, usually used in conjunction with singleton pattern


# Threads

* What is multi-threading?
  * Handling multiple threads / paths of execution in your program.
* In what ways can you create a thread?
  * By extending the `Thread` Class or by implementing the `Runnable` Interface. You must call `Thread`'s `.start()` method to start it as a new thread of execution.
* Lifecycle of a thread
  * When created, in NEW state.
  * When `.start()` is called, it goes to RUNNABLE state.
  * When `.run()` is called, goes to RUNNING state.
  * If `.sleep()` or `.wait()` is called, will go to WAITING.
  * If dependent on another thread to release a lock, it will go to BLOCKED state.
  * When finished executing, will be in TERMINATED state and cannot be restarted.
* What is deadlock?
  * When two or more threads are waiting on locks held by the others, such that no thread can execute
* What is `synchronized` keyword?
  * Only allowing one thread access to the method or variable at a time - enforces thread-safety


# Reflections API

* What is Reflection API?
  * The first component of the Reflection API is the mechanism used to fetch information about a class. This mechanism is built into the class named Class. The special class Class is the universal type for the meta information that describes objects within the Java system. Class loaders in the Java system return objects of type Class. Up until now the three most interesting methods in this class were:
  * `.forName()`, which would load a class of a given name, using the current class loader
  * `.getName()`, which would return the name of the class as a String object,which was useful for identifying object references by their class name
  * `.newInstance()`, which would invoke the null constructor on the class (if it exists) and return you an object instance of that class of object
  * To these three useful methods the Reflection API adds some additional methods to class Class. These are as follows:
  * `getConstructor`, `getConstructors`, `getDeclaredConstructor`
  * `getMethod`, `getMethods`, `getDeclaredMethods`
  * `getField`, `getFields`, `getDeclaredFields`
  * `getSuperclass`
  * `getInterfaces`
  * `getDeclaredClasses`
  

## Logback
* What is an advantage to using a logging library?
  * Allows you to set logging thresholds
* What is logback?
  * Logging library for Java
* What are the logging levels of logback?
  * TRACE, DEBUG, INFO, WARN, ERROR, FATAL

## Java 8
* What are functional interfaces?
  * Functional interfaces only have one method, and can be used in conjuntion with lambdas
* What are lambdas?
  * Like anonymous functions, they allow implementation of functional interfaces directly without creating a class
* What is the Streams API used for? What is the difference between intermediate and terminal operations? Can you provide examples?



## SDLC

### What are the steps in the software development lifecycle?

The software development lifecycle typically consists of the following steps:

1. Requirements Phase: Gathering and documenting the requirements for the software.
2. Analysis Phase: Analyzing the requirements and identifying the scope of the project.
3. Design Phase: Creating a detailed design of the software architecture and components.
4. Development Phase: Writing the code and implementing the software based on the design.
5. Testing Phase: Conducting various tests to ensure the software meets the requirements and functions correctly.
6. Integration and Deployment Phase: Integrating the software with other systems and deploying it to the production environment.
7. Maintenance Phase: Providing ongoing support, bug fixes, and updates to the software.

### What is the difference between Waterfall and Agile methodologies? Explain the benefits and drawbacks of each.

Waterfall methodology is a linear approach where each phase of the software development lifecycle is completed before moving on to the next phase. It is well-suited for projects with stable requirements and a predictable timeline. However, it lacks flexibility and can lead to delays if changes are required.

Agile methodology, on the other hand, is an iterative approach where the development process is divided into short iterations called sprints. It allows for flexibility, adaptability, and continuous improvement. Agile promotes collaboration, customer satisfaction, and faster delivery. However, it requires active involvement from the customer and may not be suitable for projects with fixed deadlines.

### List some of the principles declared in the Agile manifesto.

The Agile manifesto declares the following principles:

1. Individuals and interactions over processes and tools.
2. Working software over comprehensive documentation.
3. Customer collaboration over contract negotiation.
4. Responding to change over following a plan.

These principles emphasize the importance of people, communication, flexibility, and delivering value to the customer.

### What specific Agile frameworks exist? What are the main features of each?

Some specific Agile frameworks include Scrum, Kanban, Lean, and Extreme Programming (XP).

- Scrum: It is a popular framework that divides the development process into sprints, with defined roles and ceremonies such as sprint planning, daily standup, sprint review, and retrospective.
- Kanban: It visualizes the workflow and limits work in progress, focusing on continuous delivery and optimizing flow.
- Lean: It aims to eliminate waste and maximize value by continuously improving the process.
- XP: It emphasizes close collaboration, frequent feedback, and practices like pair programming and test-driven development.

Each framework has its own set of practices and principles, but they all share the common goal of delivering high-quality software in an iterative and incremental manner.

### What is the Scrum process? Explain each of the Scrum ceremonies.

The Scrum process is an Agile framework that follows the iterative and incremental approach. It consists of the following ceremonies:

1. Sprint Planning: The team plans the work to be done in the upcoming sprint, including selecting user stories and estimating effort.
2. Daily Standup/Scrum: A short daily meeting where team members share progress, discuss any obstacles, and plan their work for the day.
3. Sprint Review: The team presents the completed work to stakeholders and gathers feedback for future iterations.
4. Sprint Retrospective: The team reflects on the sprint, identifies areas for improvement, and plans actions to enhance the process.

These ceremonies promote transparency, collaboration, and continuous improvement within the Scrum team.

### How long is a typical sprint?

A typical sprint in Scrum usually lasts between 2 to 4 weeks. The duration of the sprint is determined based on factors such as the complexity of the project, team capacity, and the organization's needs. Shorter sprints allow for more frequent feedback and adaptation, while longer sprints provide more time for development and testing.

### What is a "standup" and what should you report about your work?

A "standup" is a daily meeting in Scrum where team members provide a brief update on their work. It is called a standup because participants are encouraged to stand to keep the meeting short and focused. During the standup, each team member typically answers three questions:

1. What did I accomplish since the last standup?
2. What am I planning to work on today?
3. Are there any obstacles or challenges that are impeding my progress?

The purpose of the standup is to promote transparency, alignment, and collaboration within the team.

### What is the role of a "Scrum master" in a project? What about the "Product owner"?

The Scrum master is a role in Scrum responsible for facilitating the Scrum process and ensuring that the team adheres to Scrum principles and practices. The Scrum master acts as a servant-leader, removing obstacles, facilitating meetings, and promoting continuous improvement.

The Product owner is a role in Scrum representing the stakeholders and customers. The product owner is responsible for defining and prioritizing the product backlog, ensuring that the team is building the right product, and maximizing the value delivered to the customers.

### Explain the following metrics/charts: sprint velocity, burndown chart.

- Sprint Velocity: Sprint velocity is a metric in Scrum that measures the amount of work a team can complete in a sprint. It is usually measured in story points or other units of effort. Sprint velocity helps the team to plan future sprints and track their progress over time.

- Burndown Chart: A burndown chart is a visual representation of the remaining work in a sprint or project. It shows the progress of completing the work over time. The chart typically plots the amount of work remaining on the vertical axis and the time on the horizontal axis. It helps the team to track their progress and identify any deviations from the planned timeline.

### What is a Scrum board? Have you used any software tools for your team's Scrum board?

A Scrum board is a visual representation of the team's work in Scrum. It typically consists of columns representing different stages of the workflow, such as "To Do," "In Progress," and "Done." Each work item, usually represented by sticky notes or cards, is moved across the board as it progresses through the workflow.

There are various software tools available for managing Scrum boards, such as Jira, Trello, and Azure DevOps. These tools provide digital boards that can be accessed and updated by team members remotely, facilitating collaboration and tracking progress.

### Name some technologies teams can use to keep track of progress on different projects, tasks, and due dates.

Teams can use project management tools and collaboration platforms to keep track of progress on different projects, tasks, and due dates. Some popular technologies include:

- Project management software: Jira, Asana, Monday.com
- Collaboration platforms: Microsoft Teams, Slack, Google Workspace
- Task tracking tools: Trello, Todoist, Microsoft Planner
- Gantt chart tools: Microsoft Project, TeamGantt, Smartsheet

These technologies provide features like task assignment, progress tracking, deadline reminders, and communication channels to help teams stay organized and monitor their progress effectively.
