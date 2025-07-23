📅 Tag 4 – Docker Compose & Container Management
🎯 Lernziele
Docker-Volumes und Netzwerke verstehen und anwenden

Multi-Container-Anwendungen mit docker-compose verwalten

Eigene Images bauen (inkl. Multi-Stage Builds, Buildx)

Container rootless betreiben

Umgang mit privaten Registries

📚 Lerninhalte
1. Docker Volumes und Netzwerke
Unterschied zwischen bind mounts und Volumes

Docker-Netzwerktypen: bridge, host, none, overlay

docker volume und docker network Befehle

2. docker-compose
Struktur einer docker-compose.yml

docker compose up/down

depends_on, volumes, networks

Umgebungsvariablen mit .env

3. Docker Registries
Push/Pull mit Docker Hub oder privater Registry

docker login, docker tag, docker push

4. Multi-Stage Builds & Buildx
Optimierte Images mit mehreren Stages

docker buildx für verschiedene Plattformen und Caching

5. Rootless Docker
Vorteile & Einschränkungen

Einrichtung und Nutzung

🛠 Übungen
Dockerfile schreiben & lokal bauen

Basis: alpine oder python

CMD oder ENTRYPOINT mit Startbefehl

Image in private Registry pushen

z. B. registry:2 lokal starten, mit Login/Tag/Push arbeiten

Multi-Service-Anwendung mit Compose

Beispiel: Web-Frontend + Redis

docker-compose.yml schreiben und starten

Multi-Stage-Build

Beispiel: Java oder Go-Programm mit Build- und Runtime-Stages


