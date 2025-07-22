# LPI 701 – Tag 3: Docker Basics & Images – Quiz

Beantworte jede Frage. Es können **eine oder mehrere** Antworten korrekt sein.

---

### **Frage 1:** Was bewirkt der Befehl `docker build -t myimage .`?
- [ ] Startet einen Container mit dem Namen `myimage`
- [ ] Erstellt ein Docker-Image basierend auf dem Dockerfile im aktuellen Verzeichnis
- [ ] Weist dem erstellten Image den Tag `myimage` zu
- [ ] Lädt ein fertiges Image aus dem Docker Hub

---

### **Frage 2:** Wofür wird die Datei `Dockerfile` verwendet?
- [ ] Zum Konfigurieren des Docker Daemons
- [ ] Zum Erstellen reproduzierbarer Container-Images
- [ ] Zum Definieren von Befehlen, die beim Bauen des Images ausgeführt werden
- [ ] Zum Speichern von Container-Daten

---

### **Frage 3:** Was ist der Unterschied zwischen `CMD` und `ENTRYPOINT` im Dockerfile?
- [ ] `ENTRYPOINT` definiert den Hauptbefehl, der immer ausgeführt wird
- [ ] `CMD` definiert Standardargumente, die überschrieben werden können
- [ ] `CMD` wird immer ausgeführt, `ENTRYPOINT` nur bei `docker exec`
- [ ] Beide sind gleichwertig

---

### **Frage 4:** Welcher Befehl listet alle lokal vorhandenen Images auf?
- [ ] `docker images`
- [ ] `docker ls`
- [ ] `docker ps`
- [ ] `docker image fetch`

---

### **Frage 5:** Welche Aussage zu Docker-Schichten (Layers) ist korrekt?
- [ ] Jede Zeile im Dockerfile erzeugt eine neue Schicht
- [ ] Schichten werden nur bei `docker run` erzeugt
- [ ] Schichten können durch Caching den Build-Prozess beschleunigen
- [ ] Schichten gelten nur für `docker-compose`

---

### **Frage 6:** Was bewirkt `docker run -it ubuntu bash`?
- [ ] Startet einen interaktiven Container mit einem Terminal
- [ ] Führt `/bin/bash` im Container aus
- [ ] Baut ein neues Image mit bash
- [ ] Führt `bash` im Hostsystem aus

---

### **Frage 7:** Was passiert beim Ausführen von `docker pull alpine`?
- [ ] Das Image `alpine` wird aus dem Docker Hub heruntergeladen
- [ ] Es wird ein neuer Container mit Alpine gestartet
- [ ] Das lokale Image wird gelöscht
- [ ] Der Docker-Daemon wird neu gestartet

---

### **Frage 8:** Wie kann man ein laufendes Image in ein neues Image umwandeln?
- [ ] `docker commit`
- [ ] `docker save`
- [ ] `docker run --save`
- [ ] `docker capture`

---

### **Frage 9:** Welche Datei wird beim Ausführen von `docker build` standardmäßig verwendet?
- [ ] `Dockerfile`
- [ ] `.dockerignore`
- [ ] `docker-compose.yml`
- [ ] `Makefile`

---

### **Frage 10:** Was enthält `.dockerignore`?
- [ ] Eine Liste von Pfaden, die beim Kopieren in das Image ignoriert werden sollen
- [ ] Einen geheimen Docker-Zugriffstoken
- [ ] Die Konfiguration für Netzwerke
- [ ] Alle Layer-IDs des Image Caches

---

## ✅ Lösungen
1. ✅ 2, 3  
2. ✅ 2, 3  
3. ✅ 1, 2  
4. ✅ 1  
5. ✅ 1, 3  
6. ✅ 1, 2  
7. ✅ 1  
8. ✅ 1  
9. ✅ 1  
10. ✅ 1