
# 📅 Tag 8: Build-Artefakte erzeugen und archivieren mit Jenkins

## 🎯 Ziele des Tages
- Verstehen, was Build-Artefakte sind
- Artefakte im Jenkins-Job erzeugen
- Nutzung von `archiveArtifacts` und `stash/unstash`

---

## 📦 1. Was sind Build-Artefakte?

- Dateien, die im Build-Prozess entstehen und weiterverwendet werden:
  - JARs, WARs, Binaries, Docker-Images, Reports, Logs
- Können im nächsten Job-Schritt oder Deployment gebraucht werden

---

## 🛠️ 2. Artefakte in Jenkins erzeugen

Beispiel: Erzeuge eine Textdatei im Workspace
```groovy
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "Build-Ausgabe" > build.txt'
      }
    }
  }
}
```

---

## 🗃️ 3. Artefakte archivieren

### Beispiel mit `archiveArtifacts`:
```groovy
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "Build-Ausgabe" > build.txt'
        archiveArtifacts artifacts: 'build.txt', fingerprint: true
      }
    }
  }
}
```

- `fingerprint: true` = Nachverfolgbarkeit im Build-Historien-Verlauf

---

## 🔁 4. Zwischenstufen: stash & unstash

Erlaubt Übergabe von Dateien zwischen Stages:

```groovy
stage('Compile') {
  steps {
    sh 'echo Ergebnis > result.txt'
    stash includes: 'result.txt', name: 'build-output'
  }
}
stage('Analyse') {
  steps {
    unstash 'build-output'
    sh 'cat result.txt'
  }
}
```

---

## 🧪 5. Mini-Quiz / Verständnisfragen

1. Was sind Build-Artefakte?
2. Wofür verwendet man `archiveArtifacts`?
3. Wie kann man Artefakte zwischen Stages weitergeben?
4. Was bewirkt die Option `fingerprint: true`?
5. Wo findet man archivierte Artefakte in Jenkins?

---

## 🔁 Wiederholung & Ausblick

- Verstanden: Artefakterzeugung, Archivierung, Weitergabe
- Nächstes Thema (Tag 9): **Testing & Quality Gates in Jenkins**
