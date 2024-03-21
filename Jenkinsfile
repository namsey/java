pipeline{
    agent any
    stages{
        stage("GitHub Checkout")
          steps{
            checkout scmGit(branches: [[name: 'refs/heads/development']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github', name: 'java', url: 'https://github.com/namsey/java.git']])
          }
    }
}