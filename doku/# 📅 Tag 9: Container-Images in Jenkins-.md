# 📅 Tag 9: Container-Images in Jenkins-Pipelines integrieren

## 🎯 Ziele des Tages
- Nutzung von Docker in Jenkins-Pipelines
- Images bauen, taggen und ausführen
- Optional: Push in Container-Registry

---

## 🐳 1. Voraussetzungen

- Docker ist auf dem Jenkins-Agent installiert
- Benutzer im Jenkins-Container hat Docker-Rechte
- Pipeline kann `docker`-Befehle ausführen

---

## 🛠️ 2. Einfaches Image bauen und nutzen

### Beispielpipeline:
```groovy
pipeline {
  agent any
  stages {
    stage('Build Image') {
      steps {
        sh 'docker build -t myapp:latest .'
      }
    }
    stage('Run Container') {
      steps {
        sh 'docker run --rm myapp:latest'
      }
    }
  }
}

🏷️ 3. Image taggen & pushen (optional)

stage('Push to Registry') {
  steps {
    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
      sh '''
        echo "$PASS" | docker login -u "$USER" --password-stdin
        docker tag myapp:latest mydockeruser/myapp:latest
        docker push mydockeruser/myapp:latest
      '''
    }
  }
}



🧪 4. Mini-Quiz / Verständnisfragen

Wie wird ein Docker-Image in Jenkins gebaut?
Welche Voraussetzung muss der Jenkins-Agent erfüllen?
Was ist der Unterschied zwischen docker run und docker exec?
Wie überträgt man ein Image in ein zentrales Repository?
Wofür steht --rm bei docker run?