
# LPI 701 – Tag 4: Jenkins & CI/CD – Quiz

Beantworte die folgenden Fragen. Es können 1–3 Antworten korrekt sein.

---

**Frage 1:** Was ist das Hauptziel von Continuous Integration?

- [ ] Schnelles Deployment auf Produktion
- [x] Frühes Erkennen von Fehlern durch automatisierte Tests
- [ ] Minimierung der Datenbankzugriffe
- [x] Häufige Integration von Code-Änderungen ins Haupt-Repository

---

**Frage 2:** Was ist eine typische Funktion eines Jenkinsfile?

- [x] Definition von Build- und Test-Stufen in einer Pipeline
- [x] Automatisierung von Deployments
- [ ] Verwaltung von Kubernetes-Clustern
- [ ] Erstellen von Linux-Usern

---

**Frage 3:** Wozu dient das Git-Plugin in Jenkins?

- [x] Es erlaubt die Anbindung an Git-Repositories
- [x] Es kann Builds durch Git-Webhooks auslösen
- [ ] Es sichert Jenkins-Backups in Git
- [ ] Es komprimiert Git-Repositories

---

**Frage 4:** Was passiert im folgenden Pipeline-Stage?

```groovy
stage('Test') {
  steps {
    sh 'make test'
  }
}
```

- [x] Führt Tests per Shell-Skript aus
- [ ] Testet das Jenkinsfile auf Syntaxfehler
- [ ] Startet eine Testdatenbank
- [ ] Führt eine grafische Testoberfläche aus

---

**Frage 5:** Was ist die Standardadresse nach Start eines Jenkins-Docker-Containers?

- [x] http://localhost:8080
- [ ] http://localhost:3000
- [ ] http://localhost:5000
- [ ] http://jenkins.local:8080

---

**Frage 6:** Welche Aussagen über Jenkins-Pipelines sind korrekt?

- [x] Sie lassen sich versionieren (z.B. im Git-Repo)
- [x] Sie unterstützen bedingte Ausführung und Parallelisierung
- [ ] Sie können nur mit grafischer UI erstellt werden
- [ ] Sie ersetzen vollständig alle anderen Job-Typen

---

**Frage 7:** Wie heißt das Plugin, das eine modernere UI für Pipelines bietet?

- [ ] PipelineX
- [ ] JenkinsUX
- [x] Blue Ocean
- [ ] DevView

---

**Frage 8:** Was macht `sh 'make'` in einem Jenkinsfile?

- [x] Führt den Befehl `make` in der Shell aus
- [ ] Kompiliert automatisch Java-Code
- [ ] Führt Bash-Tests aus
- [ ] Ruft eine Jenkins-eigene Funktion auf

---

**Frage 9:** Was ist eine "Multibranch Pipeline"?

- [x] Eine Pipeline, die mehrere Git-Branches automatisch verwaltet
- [ ] Ein Feature, das nur mit Blue Ocean funktioniert
- [x] Automatisches Erstellen von Jobs für jeden Branch
- [ ] Ein Jenkins-Plugin für GitLab-Integration

---

**Frage 10:** Welche Tools lassen sich typischerweise in Jenkins integrieren?

- [x] Git
- [x] Docker
- [x] Ansible
- [ ] Microsoft Word
