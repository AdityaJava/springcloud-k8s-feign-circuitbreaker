# Make sure we have given path in deployment.yaml to image on dockerhub like below
image: aditydud/k8s-service-b:latest

# Create spring boot jar
Goto --> Tasks --> build --> bootjar

# Build Docker image for service-a
docker build -t k8s-service-a:latest .

# Push docker image to dockerhub
docker tag k8s-service-a:latest aditydud/k8s-service-a:latest
docker push aditydud/k8s-service-a:latest

# Deploy service-a to Kubernetes
kubectl apply -f ./kubernetes/deployment.yaml
kubectl apply -f ./kubernetes/service.yaml
