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
           sh 'docker build -t my-hello -f Dockerfile_hello . >> build.txt'
           stash includes: 'build.txt', name: 'build-image-output'
           archiveArtifacts artifacts: 'build.txt', fingerprint: true
        }
      }
 //
      stage('Run Container') {
        steps {
          sh 'echo "Start-Ausgabe" > run.txt'
          sh 'docker run -d --rm -name my-hello my-hello . >> run.txt'
          stash includes: 'run.txt', name: 'start-output'
          archiveArtifacts artifacts: 'run.txt', fingerprint: true
        }
      }

       stage('Analyse 2') {
         steps {
     //      unstash 'build-output'
           unstash 'build-image-output'
           unstash 'start-output'
           sh 'cat build.txt'
          }
        }

  }
}