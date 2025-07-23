# LPI 701 – Tag 4: Docker Compose & Container Management

## Lernziele

- Verständnis von `docker-compose` und seinen Vorteilen
- Erstellen und Starten mehrerer Container mit Compose
- Container-Management (Logs, Netzwerke, Volumes, Neustartstrategien)
- Wichtige Kommandos zum Verwalten laufender Container

---

## 1. Einführung in Docker Compose

Docker Compose erlaubt es, Multi-Container-Anwendungen zu definieren und gemeinsam zu starten – typischerweise über eine `docker-compose.yml`.

**Beispiel:**

```yaml
version: "3.8"
services:
  web:
    image: nginx
    ports:
      - "8080:80"
  db:
    image: postgres
    environment:
      POSTGRES_PASSWORD: example
```

**Kommandos:**

```bash
docker-compose up        # startet alle Services
docker-compose down      # stoppt und entfernt Container, Netzwerke, Volumes
docker-compose ps        # zeigt aktive Container
docker-compose logs      # zeigt Logs aller Services
```

---

## 2. Volumes, Netzwerke und Umgebungen

- **Volumes**: persistente Daten
  ```yaml
  volumes:
    - dbdata:/var/lib/postgresql/data
  ```

- **Netzwerke**: automatische Namensauflösung zwischen Services

- **.env-Datei**: Konfiguration über Umgebungsvariablen

---

## 3. Container Management ohne Compose

- `docker ps`, `docker logs`, `docker exec`, `docker stop`, `docker start`
- `docker inspect <container>`: Details zu Netzwerk, Mounts etc.
- `docker network ls` / `docker volume ls`

**Neustartstrategien:**

```bash
--restart=always
--restart=on-failure
```

---

## 4. Best Practices

- Container sollten zustandslos sein
- Persistenz über Volumes
- Monitoring über Logs
- Trennung von Build- und Laufzeitumgebungen

---

## 5. Übungen

1. Erstelle eine `docker-compose.yml` mit nginx + redis
2. Starte die Umgebung mit `docker-compose up`
3. Prüfe mit `docker-compose ps` und `logs`
4. Erzeuge ein Volume und inspiziere es mit `docker volume inspect`
