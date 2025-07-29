
# 🧩 Quiz – Monitoring & Logging (LPI-701-Stil)

**Hinweis:** Pro Frage 1–3 richtige Antworten. Lösungen unten.

---

**1. Welche Aussagen über Prometheus sind korrekt?**  
A. Prometheus nutzt ein Push-Modell  
B. Targets werden regelmäßig "gescraped"  
C. Prometheus speichert Logs  
D. Exporter liefern Metriken  

**2. Was gehört zur Prometheus-Architektur?**  
A. Grafana  
B. Alertmanager  
C. Exporter  
D. Fluentd  
E. Scrape-Konfiguration  

**3. Was ist ein typischer Zweck von Grafana?**  
A. Systemdienste starten  
B. Metriken visualisieren  
C. Container starten  
D. Dashboards bereitstellen  
E. Logs rotieren  

**4. Welche Funktionen bietet Loki?**  
A. Indexfreie Speicherung von Logs  
B. Suche per LogQL  
C. Monitoring von Container-CPU  
D. Integration in Grafana  
E. Automatisches Log-Rotating  

**5. Welche journalctl-Optionen sind gültig?**  
A. `-u nginx.service`  
B. `--lines=100`  
C. `--since "1 hour ago"`  
D. `--container=xyz`  
E. `--purge-logs`

**6. Wie können Docker-Container-Logs eingesehen werden?**  
A. `docker inspect`  
B. `docker logs <container>`  
C. `journalctl -u docker.service`  
D. `docker logctl`  
E. `docker compose logs`

**7. Was kann in Grafana als Data Source verwendet werden?**  
A. PostgreSQL  
B. Prometheus  
C. Loki  
D. systemd-journald  
E. JSON-Dateien

**8. Welche Aussagen zu Metriken sind korrekt?**  
A. Sie sind strukturierte Zeitreihen  
B. Sie enthalten unstrukturierte Textdaten  
C. Werden typischerweise aggregiert  
D. Sind schwerer zu analysieren als Logs  
E. Sie helfen bei der Performanceüberwachung

**9. Was ist ein Exporter bei Prometheus?**  
A. Ein Log-Parser  
B. Ein Dienst, der Metriken bereitstellt  
C. Z. B. node_exporter oder blackbox_exporter  
D. Ein Visualisierungstool  
E. Ein Alertmanager-Modul

**10. Wie kann man Container-Logs zentral sammeln?**  
A. Docker Logging Driver auf journald setzen  
B. Mit `rsyslog` sammeln  
C. Über Sidecar-Container nach Loki senden  
D. Nur über `docker logs`  
E. In `/etc/docker/logrotate.conf` definieren

---

## ✅ Lösungen

1. ✅ B, D  
2. ✅ B, C, E  
3. ✅ B, D  
4. ✅ A, B, D  
5. ✅ A, B, C, D  
6. ✅ B, C, E  
7. ✅ A, B, C  
8. ✅ A, C, E  
9. ✅ B, C  
10. ✅ A, B, C