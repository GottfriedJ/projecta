# LPI 701 – Quiz Tag 4: Docker Compose & Container Management

## 10 Fragen im LPI-Stil (max. 3 Antworten korrekt)

---

**Frage 1:**  
Was ist der Zweck von `docker-compose`?  
- [ ] Es ersetzt den Docker-Daemon  
- [ ] Es verwaltet Multi-Container-Anwendungen  
- [ ] Es nutzt eine YAML-Datei zur Definition  
- [ ] Es kann Container mit einem einzigen Befehl starten  

---

**Frage 2:**  
Welche Befehle stoppen und entfernen alle durch Compose gestarteten Container?  
- [ ] `docker stop all`  
- [ ] `docker-compose down`  
- [ ] `docker rm -f`  
- [ ] `docker-compose stop && docker-compose rm`  

---

**Frage 3:**  
Welche Vorteile bieten benannte Volumes in Compose?  
- [ ] Persistenz über Neustarts hinweg  
- [ ] Wiederverwendbarkeit in mehreren Services  
- [ ] Automatische Backup-Erstellung  
- [ ] Verwendung nur mit root-Rechten möglich  

---

**Frage 4:**  
Was bewirkt `--restart=always` beim Container-Start?  
- [ ] Container startet automatisch nach Reboot  
- [ ] Container wird nie neu gestartet  
- [ ] Container wird nach Absturz neu gestartet  
- [ ] Container startet nur manuell  

---

**Frage 5:**  
Welche Datei wird standardmäßig von `docker-compose` verwendet?  
- [ ] `docker-compose.yml`  
- [ ] `Dockerfile`  
- [ ] `compose.json`  
- [ ] `.env` (ergänzend, nicht zwingend)  

---

**Frage 6:**  
Welche Aussagen über `docker network` sind korrekt?  
- [ ] Container können über Namen kommunizieren  
- [ ] Container benötigen eigene IP-Adressen  
- [ ] Docker erstellt Standardnetzwerke automatisch  
- [ ] `docker-compose` nutzt kein Netzwerk  

---

**Frage 7:**  
Was zeigt `docker-compose logs`?  
- [ ] Logs aller Services  
- [ ] Zeitstempel der Logzeilen  
- [ ] Nur Build-Logs  
- [ ] Netzwerklogs  

---

**Frage 8:**  
Wie prüft man Details zu einem Volume?  
- [ ] `docker volume check`  
- [ ] `docker volume inspect <volumename>`  
- [ ] `docker inspect volume`  
- [ ] `docker volume ls` zur Anzeige der Namen  

---

**Frage 9:**  
Welche Möglichkeiten bestehen zur Laufzeit in einen Container zu schauen?  
- [ ] `docker logs <container>`  
- [ ] `docker exec -it <container> /bin/bash`  
- [ ] `docker run`  
- [ ] `docker start`  

---

**Frage 10:**  
Welche Vorteile bietet `docker-compose` im Vergleich zu einzelnen `docker`-Befehlen?  
- [ ] Bessere Übersicht bei mehreren Containern  
- [ ] Einfaches Hoch- und Runterfahren von Umgebungen  
- [ ] Erhöht die Sicherheit automatisch  
- [ ] Ersetzt den Dockerfile  
