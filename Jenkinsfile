pipeline{
    agent any
    stages{
        stage("GitHub Checkout")
          steps{
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github', name: 'java', url: 'https://github.com/namsey/java.git']])
          }
    }
}