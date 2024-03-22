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
    }
    post {
    always {
      junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults : true)
    }
  }
}
