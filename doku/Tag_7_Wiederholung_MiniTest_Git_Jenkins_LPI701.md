
# 📅 Tag 7: Wiederholung + Mini-Test (Git & Jenkins)

## 🎯 Ziel des Tages
- Rückblick auf die ersten 7 Tage
- Wiederholung wichtiger Befehle und Konzepte
- Mini-Test mit Lösungen zur Selbstkontrolle

---

## 🔁 1. Git – Kurzzusammenfassung

### Grundlegende Befehle:
```bash
git init
git add <datei>
git commit -m "Nachricht"
git status
git log
```

### Branching & Merging:
```bash
git checkout -b feature-x
git merge main
git rebase main
```

### Konflikte & Spezialbefehle:
```bash
git stash
git cherry-pick <hash>
git reflog
```

---

## 🔁 2. Jenkins – Kurzzusammenfassung

### CI/CD:
- Continuous Integration = Automatisiertes Testen & Bauen
- Continuous Delivery = Manuelle Freigabe
- Continuous Deployment = Automatische Auslieferung

### Job-Typen:
- Freestyle Job
- Pipeline Job (mit Jenkinsfile)

### Pipeline-Definition:
```groovy
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Bauen...'
      }
    }
  }
}
```

---

## 🧪 3. Mini-Test: 10 Fragen

### 📌 Git

1. Was ist der Unterschied zwischen `git merge` und `git rebase`?
2. Wie zeigt man den Verlauf aller HEAD-Änderungen?
3. Wozu dient `git stash`?
4. Wie wendest du gezielt einen einzelnen Commit auf einen anderen Branch an?
5. Wie kannst du versehentlich gelöschte Commits wiederfinden?

### 📌 Jenkins

6. Was ist ein Jenkinsfile?
7. Welche Vorteile hat eine deklarative Pipeline gegenüber einem Freestyle-Job?
8. Wie verknüpft man Jenkins mit einem Git-Repository?
9. Wie kann man einen automatischen Build bei Push auslösen?
10. Was macht `agent any` in einem Jenkinsfile?

---

## ✅ 4. Lösungsvorschläge

1. Merge erhält Verzweigungen, Rebase macht Historie linear  
2. Mit `git reflog`  
3. Zwischenspeichern von Änderungen  
4. Mit `git cherry-pick <commit>`  
5. Ebenfalls `git reflog`  
6. Eine Datei, die eine Pipeline beschreibt  
7. Versionierbarkeit, Wiederholbarkeit, mehr Kontrolle  
8. Per „Pipeline from SCM“ mit Git-URL  
9. Mit einem GitHub Webhook + Trigger im Job  
10. Jenkins nutzt beliebigen freien Executor

---

## 🏁 Weiter geht's morgen mit Tag 8: Build-Artefakte erzeugen und archivieren
