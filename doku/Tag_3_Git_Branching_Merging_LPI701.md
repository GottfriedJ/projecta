
# 📅 Tag 3: Git – Branching & Merging

## 🎯 Ziele des Tages
- Git-Branching verstehen und praktisch anwenden  
- Unterschied zwischen `merge` und `rebase` verstehen  
- Konflikte erkennen und lösen  
- Einsatz von `stash`, `tag`, `log --graph`

---

## 🧠 1. Was sind Branches in Git?

Ein Branch ist ein Zeiger auf einen bestimmten Commit.  
Standard-Branch: `main` oder `master`.

### Nützliche Befehle:
```bash
git branch                     # Zeigt lokale Branches
git branch neuer-zweig         # Erstellt neuen Branch
git checkout neuer-zweig       # Wechselt zum Branch
git checkout -b neuer-zweig    # Erstellen & wechseln in einem Schritt
```

---

## 🔀 2. Branches zusammenführen: Merge & Rebase

### `git merge`
Fügt Änderungen eines Branches in einen anderen ein:
```bash
git checkout main
git merge feature-xyz
```

### `git rebase`
Setzt Commits auf einen neuen Ausgangspunkt:
```bash
git checkout feature-xyz
git rebase main
```

### Unterschiede:
| Merge                         | Rebase                        |
|------------------------------|-------------------------------|
| Erhält Verzweigungen         | Macht Historie linear         |
| Erzeugt Merge-Commits        | Kein Merge-Commit             |
| Besser bei mehreren Entwicklern | Besser für private Historien  |

---

## ⚔️ 3. Konflikte beim Merge oder Rebase

Beispiel für einen Konflikt:
```text
<<<<<<< HEAD
alte Zeile
=======
neue Zeile
>>>>>>> feature-xyz
```

### Lösung:
1. Datei manuell bearbeiten
2. Änderungen mit `git add` markieren
3. Mit `git commit` (bei merge) oder `git rebase --continue` fortfahren

---

## 🧰 4. Nützliche Befehle für Branching

```bash
git stash            # Speichert uncommitted Änderungen temporär
git stash pop        # Holt die letzten gestashten Änderungen zurück
git tag v1.0         # Erstellt einen Tag (z. B. für Releases)
git log --graph      # Zeigt Commit-Historie mit Verzweigungen
```

---

## 🧪 5. Mini-Quiz / Verständnisfragen

1. Wie erstellt man einen neuen Branch?
2. Was ist der Unterschied zwischen `merge` und `rebase`?
3. Wie geht man mit einem Merge-Konflikt um?
4. Wofür dient `git stash`?
5. Wie zeigt man die Commit-Historie als Baum an?

---

## 🔁 Wiederholung & Ausblick

- Wiederhole Branch-Kommandos: `branch`, `checkout`, `merge`, `rebase`
- Nächstes Thema: **Git – Fortgeschrittene Techniken (Hooks, reflog, cherry-pick)**
