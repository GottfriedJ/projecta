# LPI 701 – Tag 3: Docker Basics & Images

## Lernziele

- Grundkonzepte von Docker verstehen
- Images und Container unterscheiden
- Mit der Docker CLI arbeiten
- Eigene Images mit Dockerfiles bauen
- Images verwalten und optimieren

---

## 1. Docker-Grundlagen

- **Image** = schreibgeschützte Vorlage für Container (z. B. `ubuntu`, `nginx`)
- **Container** = laufende Instanz eines Images
- **Docker Daemon** = Hintergrunddienst zur Containerverwaltung
- **CLI** = `docker`-Befehle zur Kommunikation mit dem Daemon

---

## 2. Nützliche Docker-Befehle

```bash
docker version         # Version anzeigen
docker info            # Laufzeit-Infos
docker images          # Lokale Images
docker ps              # Laufende Container
docker ps -a           # Alle Container (inkl. gestoppter)
docker pull ubuntu     # Image aus Docker Hub laden
docker run -it ubuntu  # Interaktiver Container (stdin, tty)
docker stop <id>       # Container stoppen
docker rm <id>         # Container löschen
docker rmi <image>     # Image löschen
```

---

## 3. Container vs. Image

| Aspekt        | Image              | Container                    |
|---------------|--------------------|------------------------------|
| Zustand       | Read-only          | Read/Write                   |
| Ort           | Festplatte         | Speicher / Prozess           |
| Lebensdauer   | Persistiert        | Flüchtig (nach Stop/Löschen) |

---

## 4. Interaktiver Container

```bash
docker run -it ubuntu bash
```

- `-i` = interactive (stdin offen halten)
- `-t` = Terminal (TTY)
- Beispiel: `apt update`, `echo Hello`

---

## 5. Container im Hintergrund (Daemon-Mode)

```bash
docker run -d --name demo ubuntu sleep infinity
```

- `-d` = detached
- `--name` = benutzerdefinierter Name
- Zugriff via `docker exec` oder `docker logs`

---

## 6. Dockerfile – Beispiel

```dockerfile
# Basis-Image
FROM ubuntu:20.04

# Abhängigkeiten
RUN apt update && apt install -y curl

# Arbeitsverzeichnis
WORKDIR /app

# Kopieren lokaler Dateien
COPY . .

# Kommando bei Start
CMD ["bash"]
```

**Build & Run:**

```bash
docker build -t my-ubuntu .
docker run -it my-ubuntu
```

---

## 7. CMD vs. ENTRYPOINT

```dockerfile
CMD ["echo", "Hallo"]
# wird durch docker run <args> überschrieben

ENTRYPOINT ["echo"]
CMD ["Hallo"]
# docker run test → echo Hallo
# docker run test Welt → echo Welt
```

---

## 8. Image Layer & Caching

- Jeder `RUN`, `COPY`, `ADD` erzeugt Layer
- Layer werden gecached → schneller Build
- Reihenfolge beachten (z. B. erst `COPY requirements.txt`, dann `pip install`)

---

## 9. Volumes und Datenpersistenz

```bash
docker run -v /host/data:/container/data ubuntu
```

- `/host/data` bleibt auch nach Container-Stopp erhalten
- Ideal für Datenbanken, Konfigs

---

## 10. Logs & Fehleranalyse

```bash
docker logs <id>             # stdout/stderr
docker exec -it <id> bash    # interaktive Shell
docker inspect <id>          # detaillierte Metadaten
```

---

## 11. Cleanup

```bash
docker system prune          # ungenutzte Ressourcen löschen
docker rm $(docker ps -aq)  # alle Container löschen
docker rmi $(docker images -q)  # alle Images löschen
```

---

## Quiz-Vorbereitung

**Fragebeispiele:**

1. Was ist der Unterschied zwischen einem Image und einem Container?
2. Welche Flags benötigt man für einen interaktiven Container?
3. Wie überschreibt man CMD bei einem Containerstart?
4. Was ist ein Volume und wie wird es eingebunden?
5. Wie sieht ein einfaches Dockerfile aus?

---

## Nächste Schritte

- Dockerfile schreiben und testen
- Interaktive Container starten
- Ein Image aus einem Dockerfile bauen