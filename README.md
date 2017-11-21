Spring Boot k8s demo
=======

1. Download a Spring Boot Seed project with Web support from https://start.spring.io/
2. Create a Dockerfile
3. Build a jar deliverable running mvn clean package
4. Build the image running docker build -t adidas/demo .
5. Run the container running docker --name"'demo' -d --rm -p 8080:8080 adidas/demo

k8s
--

1. Create a Pod file
2. Create a Deployment file
3. Create a Service file
4. Create a ingress file
5. Create a secret file

