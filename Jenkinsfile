pipeline{
    agent any
    stages{
        stage('Code Build') {
            steps{
            sh 'mvn clean install'
            } 
        }
        stage('Code Test') {
            steps {
                echo 'mvn --batch-mode -Dmaven.test.failure.ignore=true test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
    
}
