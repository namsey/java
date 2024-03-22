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
                echo 'code test success...'
            }
        }
    }
}
