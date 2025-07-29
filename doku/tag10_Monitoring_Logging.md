# 📅 Tag 10 – Monitoring & Logging

## 🧠 Lernziele

- Grundkonzepte von Monitoring & Logging verstehen  
- Prometheus und Grafana in Containern starten  
- Logs mit Loki, journald und Docker analysieren  
- Unterschiede und Zusammenspiel von Logs und Metriken erkennen

---

## 📘 Lerninhalte

### 1. Monitoring-Grundlagen
- Unterschied zwischen **Metriken** (Monitoring) und **Logs** (Logging)
- Warum observability wichtig ist (3 Säulen: Logs, Metrics, Traces)

### 2. Prometheus
- Zeitreihenbasierter Monitoring-Dienst
- Architektur: Pull-Modell, Exporter
- Wichtige Konzepte: Targets, Scraping, Labels
- Beispiel: Node Exporter einbinden

```yaml
# prometheus.yml (Ausschnitt)
scrape_configs:
  - job_name: 'node'
    static_configs:
      - targets: ['localhost:9100']
```

### 3. Grafana
- Visualisierung von Prometheus-Metriken
- Dashboards, Panels, Data Sources
- Einrichtung mit Docker

```bash
docker run -d -p 3000:3000 grafana/grafana
```

### 4. Logging mit Loki
- Zeitbasierte Log-Suche
- Integration mit Grafana
- Logstruktur: Streams, Labels, Query-Sprache LogQL

### 5. journald und systemd
- `journalctl`-Basics: Filter, Ausgabeformate
- Logs persistieren und rotieren
- Beispiel: `journalctl -u nginx.service -b`

### 6. Logging mit Docker
- `docker logs`, Logging-Driver
- Mount von `/var/log` in Container
- Weiterleitung an journald oder syslog

### 7. Mini-Projekt (optional)
- Prometheus + Grafana + Loki mit Docker Compose starten  
- Logs eines nginx-Containers anzeigen und in Grafana visualisieren

---

## 🔧 Beispiel: Docker Compose für Prometheus & Grafana

```yaml
version: '3'

services:
  prometheus:
    image: prom/prometheus
    volumes:
      - ./prometheus.yml:/etc/prometheus/prometheus.yml
    ports:
      - "9090:9090"

  grafana:
    image: grafana/grafana
    ports:
      - "3000:3000"
```

