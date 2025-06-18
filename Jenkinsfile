pipeline {
    agent any

    stages {
        stage('Test Java Zugriff') {
            steps {
                script {
                    echo "Teste Java-Verfügbarkeit neuu..."
                    sh 'java -version'
                }
            }
        }

        stage('Test maven Run') {
            steps {
                script {
                    echo "Maven Version"
                    sh 'mvn -version'
                }
            }
        }
    }
}
