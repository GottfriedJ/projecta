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
//
        stage('Test maven Run') {
          steps {
            script {
              echo "Maven Version"
               sh 'mvn -version'
            }
          }
        }
        
        stage('Show docker version') {
          steps {
            sh 'docker --version'
          }
       }
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
       stage('Build Image') {
         steps {
           sh 'echo "Build-Ausgabe" > build.txt'
           sh 'echo $(docker build -t my-hello:latest -f Dockerfile_hello .) >> build.txt'
           stash includes: 'build.txt', name: 'build-image-output'
           archiveArtifacts artifacts: 'build.txt', fingerprint: true
        }
      }
 //
      stage('Run Container') {
        steps {
          script {
            try {
                sh 'echo "Start-Ausgabe" > run.txt'
                sh 'docker stop my-hello'
                sh 'docker rm my-hello'
                sh 'docker run --rm --name my-hello . >> run.txt'
            } catch (err) {
                echo "Fehler beim Bauen des Images: ${err}"
                currentBuild.result = 'FAILURE'
                        // Optional: build abbrechen
                error("Abgebrochen wegen Docker-Fehler")
            }
          }
          stash includes: 'run.txt', name: 'start-output'
          archiveArtifacts artifacts: 'run.txt', fingerprint: true
        }
      }

       stage('Analyse 2') {
         steps {
           unstash 'build-output'
           unstash 'build-image-output'
           unstash 'start-output'
           sh 'cat build.txt'
          }
        }

  }
}