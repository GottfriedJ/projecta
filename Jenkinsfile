pipeline {
    agent any

    stages {
        stage('Test Java Zugriff') {
            steps {
                script {
                    echo "Teste Java-Verfügbarkeit superduperneu :-)"
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
        //
 
//    
        stage('Compile') {
          steps {
          sh 'echo Ergebnis > result.txt'
          stash includes: 'result.txt', name: 'build-output'
        }
    }
//    
       stage('Analyse') {
         steps {
          unstash 'build-output'
          sh 'cat result.txt'
         }
       }
//
      stage('Build') {
        steps {
          sh 'echo "Build-Ausgabe" > build.txt'
          archiveArtifacts artifacts: 'build.txt', fingerprint: true
        }
      }
    
  }
}
