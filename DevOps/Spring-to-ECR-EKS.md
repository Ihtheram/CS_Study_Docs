# Steps to Deploy Spring App to ECR EKS
1. Create spring boot application
2. Write <finalName>[finalName]</finalName> in pom.xml
3. Build project and generate artifact or packages
4. Create Dockerfile and add
    ```
    FROM openjdk:[version]
    EXPOSE 8080
    ADD target/[finalName].jar [finalName].jar
    ENTRYPOINT ["java", "-jar", "/[finalName].jar"]
    ```
5. Create image inside docker
    `docker build -t [give-image-a-name] .`
6. Inside AWS create repository inside ECR service.
7. Click on push repository and run all those 4 steps inside your powershell.
8. Create EKS cluster in AWS either via UI or CMD
    `eksctl create cluster --name [give-a-cluster-name] --version [version] --node=[number-of-node] --node-type=t2.small --region us-east-1`
9. Start minikube as local service
10. Create app-deployment.yaml file with deploment and service and add ECR repository image URL inside yaml file
11. Run yaml file using Kubectl
    `kubectl apply -f app-deployment.yaml`
12. Check deployment, service and pod
    `kubectl get deployment`
    `kubectl get service`
    `kubectl get pods`
13. Go to AWS cluster and check application will be there.