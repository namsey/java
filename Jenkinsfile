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
                script {
                    scannerHome = tool 'sonar-scanner'
                }
                withSonarQubeEnv('Sonarqube Server'){
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }
    }
    
}
