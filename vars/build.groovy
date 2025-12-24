def call() {
    echo "Starting Docker Build..."
    sh "docker build -t todo-app:latest ."
}
return this