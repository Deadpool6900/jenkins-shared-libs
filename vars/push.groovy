def call(String credentialsId) {
    echo "Pushing to DockerHub..."
    withCredentials([usernamePassword(
        credentialsId: credentialsId,
        usernameVariable: 'user',
        passwordVariable: 'pass')]) {
        
        sh "echo \$pass | docker login -u \$user --password-stdin"
        sh "docker image tag todo-app:latest \${user}/todo-app:latest"
        sh "docker push \${user}/todo-app:latest"
    }
}
return this