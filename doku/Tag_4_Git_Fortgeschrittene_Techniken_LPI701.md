
# 📅 Tag 4: Git – Fortgeschrittene Techniken

## 🎯 Ziele des Tages
- reflog verstehen und anwenden
- git cherry-pick gezielt einsetzen
- git hooks kennenlernen und konfigurieren

---

## 🧠 1. Git reflog: Unsichtbare Retter

### Was ist reflog?
- Git merkt sich ALLE Bewegungen von HEAD
- Ermöglicht das Wiederfinden "verschwundener" Commits
- Nützlich nach versehentlichem `reset`, `rebase`, `commit --amend`

### Beispiel:
```bash
git reflog                   # Zeigt alle HEAD-Aktionen
git checkout HEAD@{1}       # Zu vorheriger Position zurückkehren
```

---

## 🔍 2. git cherry-pick: Einzelne Commits übernehmen

### Was macht `cherry-pick`?
- Übernimmt EINEN Commit von einem Branch in einen anderen
- Ohne den gesamten Branch zu mergen

### Beispiel:
```bash
git checkout main
git cherry-pick abc1234       # Commit-ID gezielt übernehmen
```

### Hinweis:
- Kann Merge-Konflikte erzeugen
- Praktisch bei Hotfixes oder gezieltem Backporting

---

## 🔧 3. Git Hooks: Automatisierung in Git

### Was sind Hooks?
- Shell-Skripte, die automatisch bei bestimmten Git-Ereignissen ausgeführt werden
- Lokale Automatisierung, z. B. Code-Style-Prüfung, Tests, Formatierung

### Wo liegen Hooks?
- Verzeichnis: `.git/hooks/`
- Standardmäßig Beispiele wie `pre-commit.sample`

### Aktivierung:
```bash
cd .git/hooks
cp pre-commit.sample pre-commit
chmod +x pre-commit
```

### Eigene Hooks schreiben:
```bash
#!/bin/sh
echo "Pre-Commit Hook aktiv"
exit 0
```

---

## 🧪 4. Mini-Quiz / Verständnisfragen

1. Wofür verwendet man `git reflog`?
2. Was bewirkt `git cherry-pick`?
3. Welche Risiken hat `cherry-pick`?
4. Wo liegen die Git Hooks?
5. Wie aktiviert man einen `pre-commit` Hook?

---

## 🔁 Wiederholung & Ausblick

- Wiederhole `reflog`, `cherry-pick`, `hooks`
- Nächstes Thema (Tag 5): **Jenkins Grundlagen & CI/CD-Prinzipien**
