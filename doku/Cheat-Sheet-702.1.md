## Cheat-Sheet – 702.1 Container Usage

### Container
- **Starten:** `docker run [OPTIONS] IMAGE [COMMAND]`
- **Laufende anzeigen:** `docker ps`
- **Alle anzeigen:** `docker ps -a`
- **Stoppen:** `docker stop NAME`
- **Starten (gestoppt):** `docker start NAME`
- **Befehl ausführen:** `docker exec -it NAME /bin/bash`

### Images
- **Laden:** `docker pull IMAGE[:TAG]`
- **Anzeigen:** `docker images`
- **Löschen:** `docker rmi IMAGE` oder `docker image rm IMAGE`
- **Speichern/Laden:** `docker save` / `docker load`
- **Aus Container erstellen:** `docker commit CONTAINER IMAGE:TAG`

### Dockerfile
- **FROM:** Basis-Image
- **RUN:** Befehl während Build
- **CMD:** Standardkommando beim Start
- **ENTRYPOINT:** Festes Startkommando
- **COPY/ADD:** Dateien ins Image

### Netzwerke
- **bridge:** Standard NAT
- **host:** Container teilt Host-Netzwerk
- **none:** kein Netzwerk
- **overlay:** Swarm/K8s
- **macvlan:** eigene MAC im LAN

### Logs & Debugging
- `docker logs NAME` – Container-Logs
- `docker inspect NAME` – Metadaten
- `docker events` – Live-Events

