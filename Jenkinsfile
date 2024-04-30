@Library("shared-library") _
pipeline {
    agent any
    stages {
        stage('Code Build') {
            steps {
            javaBuild()
            } 
        }
        stage('Code Test') {
            steps {
                javaTest()
            }
        } 
        stage('SonarQube Analysis') {	
		sonarqubeUtils.call(
		httpUrl: "
		http://192.158.1.4:9000/api/qualitygates/project_status?projectKey=${Calculator}",
		username: 'sonar',
		password: 'sonar'
		)
	}
    }
}
