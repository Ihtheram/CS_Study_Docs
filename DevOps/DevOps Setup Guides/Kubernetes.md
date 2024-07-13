# Kubernetes

https://kubernetes.io/docs/tasks/tools/

## Kubectl Setup
https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/#install-kubectl-binary-with-curl-on-windows

1. Download Kubectl:
`curl.exe -LO "https://dl.k8s.io/release/v1.30.0/bin/windows/amd64/kubectl.exe"`
2. Validate the binary (optional):
    - Download Kubectl Checksum
    `curl.exe -LO "https://dl.k8s.io/v1.30.0/bin/windows/amd64/kubectl.exe.sha256"`
        - Using Command Prompt to manually compare CertUtil's output to the checksum file downloaded:
        `CertUtil -hashfile kubectl.exe SHA256`
        - Using PowerShell to automate the verification using the -eq operator to get a True or False result:
        `$(Get-FileHash -Algorithm SHA256 .\kubectl.exe).Hash -eq $(Get-Content .\kubectl.exe.sha256)`
3. Append or prepend the kubectl binary folder to your PATH environment variable.
4. Test to ensure the version of kubectl is the same as downloaded:
  `kubectl version` or
  `kubectl version --client`
  Or use this for detailed view of version:
  `kubectl version --client --output=yaml`

## Minikube Setup
* Download: 
https://minikube.sigs.k8s.io/docs/start/?arch=%2Fwindows%2Fx86-64%2Fstable%2F.exe+download
* Start:
  - `minikube start`
* Check Docker Environment:
   `minikube docker-env`
* REM To point your shell to minikube's docker-daemon:
    `REM @FOR /f "tokens=*" %i IN ('minikube -p minikube docker-env --shell cmd') DO @%i`
    [Check if it has generated a default image `docker images`]


## Operational Commands

* Build Image (from generated images)):
  `docker build -t [REPOSITORY]:[TAG] .`

* Deploy Image:
  `kubectl create deployment [give-a-name] --image=[REPOSITORY]:[TAG] --port=[port]`

* View Deployments:
  `kubectl get deployment`

* Delete Deployment:
  `kubectl delete deployment [deployment-name]`

* View description of a deployment:
  `kubectl describe deployment [deployment-name]`

* View Pods:
  `kubectl get pods`

* View logs of a Pod:
  `kubectl logs [pod-name]`

* Expose Service:
  `kubectl expose deployment [deployment-name] --type=[typeOfNode]`
  Example:
  `kubectl expose deployment [deployment-name] --type=NodePort`

* View Service:
  `kubectl get service`


* View Service URL:
  `minikube service [service-name] --url`

* View Dashboard:
  `minikube dashboard`

