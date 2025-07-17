
# 📅 Tag 8: Docker – Grundlagen

## 🎯 Ziele des Tages
- Verstehen, was Container und Images sind
- Unterschied zwischen Image und Container
- Docker-Grundkommandos anwenden
- Einfache Dockerfiles lesen und schreiben

---

## 📦 1. Was ist Docker?

- Container-Plattform zur Isolierung von Anwendungen
- Images enthalten alles für den Lauf: Code, Libs, Tools, Config
- Container = laufendes Image

---

## 📁 2. Wichtige Docker-Kommandos

```bash
docker run hello-world          # Einfachstes Beispiel
docker ps                       # Zeigt laufende Container
docker ps -a                    # Zeigt alle Container
docker exec -it <id> bash       # Interaktives Kommando im Container
docker logs <id>                # Logs des Containers ansehen
docker stop <id>                # Container stoppen
docker rm <id>                  # Container löschen
```

---

## 🧱 3. Dockerfile – Image bauen

### Beispiel:
```Dockerfile
FROM alpine
CMD ["echo", "Hello from Docker"]
```

### Image bauen:
```bash
docker build -t hello-demo .
docker run hello-demo
```

---

## 🛠️ 4. Praktische Übung

1. Schreibe ein Dockerfile, das `python3` nutzt und `print("Hallo Welt")` ausführt
2. Baue das Image
3. Führe den Container aus
4. Beobachte Logs mit `docker logs`

---

## 🧪 5. Mini-Quiz / Verständnisfragen

1. Was ist der Unterschied zwischen Image und Container?
2. Wozu dient `docker ps -a`?
3. Wie führt man ein Bash-Kommando im Container aus?
4. Wie sieht ein einfaches Dockerfile aus?
5. Was macht `docker build`?

---

## 🔁 Wiederholung & Ausblick

- Docker Grundkonzepte und Befehle verstanden
- Nächstes Thema (Tag 9): **Container-Images in Jenkins-Pipelines integrieren**
