
# LPI 701 – Tag 4: Jenkins & CI/CD Basics

## Lernziele

- Verständnis von Continuous Integration (CI) und Continuous Delivery (CD)
- Grundkonzepte von Jenkins
- Aufbau einfacher Jenkins-Pipelines
- Integration von Git, Docker und anderen Tools in Jenkins
- Automatisierung von Build-, Test- und Deployment-Prozessen

---

## 1. Continuous Integration und Delivery (CI/CD)

**Continuous Integration (CI):**
- Entwickler pushen regelmäßig Code zu einem zentralen Repository.
- Jeder Push triggert automatisierte Builds und Tests.
- Ziel: Fehler frühzeitig erkennen und beheben.

**Continuous Delivery (CD):**
- Automatisierter Release-Prozess bis zum Produktivsystem.
- Ziel: Code in produktionsnahem Zustand jederzeit auslieferbar.

---

## 2. Jenkins Grundlagen

- Webbasierte CI/CD-Plattform, primär in Java entwickelt.
- Unterstützt deklarative (Jenkinsfile) und klassische Jobkonfigurationen.
- Master-Agent-Architektur.

**Installation:**

```bash
docker run -d --name jenkins -p 8080:8080 jenkins/jenkins:lts
```

**Erstzugang:** Unlock mit Initial-Admin-Passwort aus `/var/jenkins_home/secrets/initialAdminPassword`

---

## 3. Jenkins Job-Typen

- **Freestyle-Job:** Klassischer, GUI-basierter Job
- **Pipeline-Job:** Basierend auf einem Jenkinsfile (declarative vs scripted)
- **Multibranch-Pipeline:** Automatische Jobs pro Branch
- **Folder / Organisation Folder:** Verwaltung komplexer Projekte

---

## 4. Beispiel: Deklarative Pipeline

```groovy
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'make'
      }
    }
    stage('Test') {
      steps {
        sh 'make test'
      }
    }
    stage('Deploy') {
      steps {
        sh './deploy.sh'
      }
    }
  }
}
```

---

## 5. Wichtige Jenkins-Plugins

- **Git Plugin:** SCM-Integration
- **Docker Plugin:** Docker-Agenten / Container verwenden
- **Pipeline Plugin:** für deklarative Jenkinsfiles
- **Blue Ocean:** moderne UI für Pipelines

---

## 6. Praxisübungen

- [ ] Lokalen Jenkins-Container starten
- [ ] Ein einfaches Jenkinsfile in ein Git-Repo legen
- [ ] Job mit Git SCM-Trigger einrichten
- [ ] Build-, Test- und Deploy-Job erstellen

---

## 7. Nützliche CLI-Befehle (optional)

```bash
# Build starten
curl -X POST http://localhost:8080/job/dein-job/build --user user:token

# Job-Status
curl http://localhost:8080/job/dein-job/lastBuild/api/json --user user:token
```
