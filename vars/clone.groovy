def call() {
    cleanWs()
    echo "Fetching code from GitHub..."
    git url: 'https://github.com/Deadpool6900/demo-deployment.git', branch: 'master'
}
return this