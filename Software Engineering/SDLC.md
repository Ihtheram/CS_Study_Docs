# SDLC (Software Development Lifecycle):

The Software Development Life Cycle (SDLC) encompasses all the phases involved in creating and maintaining software.

## SDLC Phases
SDLC Follows these 7 general steps: Planning, Analysis, Design, Development, Testing, Integration, Deployment, Maintenance.

Here’s a comprehensive list of all possible phases:

1. **Planning**: Define the project's scope, objectives, and feasibility.
2. **Requirement Gathering and Analysis**: Collect and analyze user and stakeholder requirements.
3. **Feasibility Study**: Assess the technical, operational, and financial feasibility of the project.
4. **System Design**: Create the architecture and design of the software system.
5. **Development**: Write the code and build the software.
6. **Testing**: Verify that the software meets requirements and is free of defects.
7. **Integration**: Combine different modules or systems and ensure they work together.
8. **Deployment**: Release the software to the production environment or end-users.
9. **Operations**: Monitor the software in its live environment to ensure smooth functioning.
10. **Maintenance**: Update, improve, and fix issues in the software post-deployment.
11. **Retirement**: Decommission the software when it is no longer needed or viable.

These phases may vary slightly depending on the methodology (e.g., Agile, Waterfall) or the specific project requirements, but this list captures all the potential stages. Let me know if you'd like to explore any of these in detail!

There are are two main approaches to SDLC currently:

-   Waterfall
-   Agile

## Waterfall

Waterfall is a linear approach, as you finish one stop you move onto the next, there is no going back

<img src = "https://www.ntaskmanager.com/wp-content/uploads/2019/08/waterfall-project-management-step-down-model.jpg" width = "600" height = "100%">

## Typical Timeline of Waterfall:

-   Requirements: 2-4 weeks
-   Planning: 2-4 weeks
-   Design: 1-4 months
-   Implementation: 6-12 months+
-   Testing: 6 months, but actually ongoing
-   Deployment: 1-3 weeks
-   Maintenance: lifetime of the application

Advantages of Waterfall

-   Easy to manage workflow
-   Well suited for small teams, or short term projects, that will not require and requirement changes
-   Generally results in faster delivery of product
-   Process and results can easily documented
-   Easy to adapt to shifting teams since the steps are clearly laid out

Disadvantages of Waterfall:

-   Very inflexible and inefficient
-   Not ideal for large teams projects
-   Testing does not begin until development is complete

## Agile

Agile is an iterative approach, go through every step of the SDLC in 2 - 4 week sprints

Agile is becoming the more widely accepted and utilized method of SDLC because of its core values

-   Individuals and Interactions over processes and tools
-   Working Software over comprehensive documentation
-   Customer collaboration over contract negotiation
-   Responding to change over following a plan

## Advantages vs Disadvantages

Advantages of Agile:

-   Client colaboration is generally regarded as positive
-   Agile team cultures tend to stay more self-organized and motivated
-   Overall quality of results is usually higher due to the iterative approach
-   Less risk in development process due incremental nature of development

Disadavantanges of Agile:

-   Not as useful for small development project
-   Higher costs associated with the Agile workflow
-   Development time can bloat if managed poorly, or requirements are not clear
-   Requires more experienced memebers during the planning and management of projects

# Agile/Scrum Concepts

Scrum is the simplest Agile framework, it enforces ceremonies lead by a lead who ensures the team is following Scrum practices

## Key Roles

-   Product Owner: holds authority over project, a representative of the client/customer
-   Scrum Master: the person who mediates all the meetings, and goes between client and team

## Scrum Artifacts

-   Project Backlog: holds all the current requirements for the project
-   Sprint Backlog: requirements that are to be completed in the current sprint
-   User Story: an individual feature/requirement
-   Epic: a group of related features that is broken down into multiple user stories
-   Sprint: a brief period of development, (between 2 and 4 weeks). which generally cumulates in a release of realated features
-   Velocity: the sum of story points of all the user stories completed that week

## Story Pointing

Story pointing is the process of assigning points to each user story or requirements. a user story allows teams to keep track of the progress (velocity) of their sprint/project, and create burndown charts

Burndown Charts: chart the amount of story points that been completed each day, vs the number of points remaining

<img src= "https://thumbor.forbes.com/thumbor/fit-in/x/https://www.forbes.com/advisor/wp-content/uploads/2021/11/unnamed-4-e1637221767381.png">

When assigning story points, it should be a team discussion, that includes consideration of Risk, Complexity, and Repetition of the user story

It is also recommended to use a number fib sequence:

-   1: "trivial"
-   2: "easy"
-   3: "medium"
-   5: "difficult"

## Scrum Ceremonies:

meetings used during the life cylce of the sprint in a project

Sprint Planning:

-   Include the entire dev team, scrum master, product owner
-   Happen before every sprint
-   Determine the scope, goals, and metrics of the sprint

Daily Standup/Scrum:

-   This is a daily meeting lead by the scrum master
-   Takes aprox. 15 minutes
-   Everyone tells what they are working on, what they are stuck on, and their goals for the day

Sprint Review:

-   Everyone is invited to this meeting
-   Review what the team accomplished at the end of a sprint
-   Gain feedback

Sprint Retrospective:

-   Scrum master reviews the metric, and assess any ineffiencies
-   Plan to make improvemtents as a team


### What Agile processes have you used?			
### What is retrospective in Agile?			
### What AWS services have you used?			
### How do you host projects on AWS?			
### Briefly describe Iaas, Paas, Saas and describe one of them more in-depth.

# SDLC

### What Agile processes have you used?

I have used an Agile processes which are Scrum and Kanban.

### What is retrospective in Agile?

Retrospective in Agile is a meeting held at the end of each sprint or iteration where the team reflects on what went well, what could be improved, and what actions can be taken to enhance the team's performance in the future.

# Cloud

### What AWS services have you used?

I have used a wide range of AWS services including EC2 (Elastic Compute Cloud), S3 (Simple Storage Service), RDS (Relational Database Service), Lambda, and CloudFormation, among others.

### How do you host projects on AWS?

To host projects on AWS, you can use services like EC2 for virtual machine instances, S3 for static file hosting, and Elastic Beanstalk for deploying and managing applications. You can also use AWS Lambda for serverless computing and AWS Elastic Beanstalk for platform-as-a-service (PaaS) hosting.

### Briefly describe IaaS, PaaS, SaaS and describe one of them more in-depth.

IaaS (Infrastructure-as-a-Service) provides virtualized computing resources such as virtual machines, storage, and networking infrastructure. It allows users to manage and control the underlying infrastructure while focusing on their applications.

PaaS (Platform-as-a-Service) provides a platform for developing, testing, and deploying applications without the need to manage the underlying infrastructure. It offers a higher level of abstraction and automates many aspects of application deployment and management.

SaaS (Software-as-a-Service) delivers software applications over the internet on a subscription basis. Users can access and use the software without the need for installation or maintenance.

One example of a PaaS service is AWS Elastic Beanstalk. It simplifies the deployment and management of applications by providing a platform that automatically handles the underlying infrastructure, including capacity provisioning, load balancing, and automatic scaling.

