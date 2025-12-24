def call() {
    echo "Deploying with Docker Compose..."
    sh "docker-compose down || true"
    sh "docker-compose up -d"
}
return this