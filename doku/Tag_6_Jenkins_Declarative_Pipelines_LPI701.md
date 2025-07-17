
# 📅 Tag 6: Jenkins – Declarative Pipelines

## 🎯 Ziele des Tages
- Unterschied zwischen Freestyle-Jobs und Pipelines verstehen
- Erste deklarative Pipeline schreiben
- Nutzung von Stages, Steps, Agents, Conditions

---

## 🧠 1. Was sind Jenkins Pipelines?

- Pipelines sind "as code" definierte Abläufe für CI/CD
- Versionierbar in Git (meist `Jenkinsfile`)
- Zwei Arten: Declarative vs. Scripted (wir nutzen Declarative)

---

## 🛠️ 2. Aufbau einer declarative Pipeline

### Grundstruktur:
```groovy
pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        echo 'Baue Anwendung...'
      }
    }
    stage('Test') {
      steps {
        echo 'Führe Tests aus...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deployment läuft...'
      }
    }
  }
}
```

---

## 💡 3. Erklärung der Komponenten

- `pipeline`: Einstiegspunkt
- `agent any`: Läuft auf beliebigem verfügbaren Executor
- `stages`: Enthält alle Phasen
- `stage`: Benannter Abschnitt mit `steps`
- `steps`: konkrete Aktionen wie `echo`, `sh`, `git`, `archiveArtifacts`

---

## ⚙️ 4. Job anlegen für declarative Pipeline

### Schritte:
1. Jenkins UI → „Neuer Job“ → „Pipeline“
2. Namen eingeben, z. B. `pipeline-demo`
3. Unter „Pipeline“ → Definition: „Pipeline script“
4. Code aus dem Beispiel einfügen
5. Speichern → „Jetzt bauen“

---

## 🧪 5. Mini-Quiz / Verständnisfragen

1. Was ist ein `Jenkinsfile`?
2. Welche Vorteile hat Pipeline-as-Code?
3. Was macht der Block `agent any`?
4. Welche Struktur hat eine declarative Pipeline?
5. Was ist der Unterschied zu Freestyle-Jobs?

---

## 🔁 Wiederholung & Ausblick

- Wiederhole Aufbau und Syntax von Pipelines
- Morgen (Tag 7): **Pipelines aus Git laden und mit SCM verknüpfen**
