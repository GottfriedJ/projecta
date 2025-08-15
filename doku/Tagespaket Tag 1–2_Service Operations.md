# Tagespaket Tag 1–2: Service Operations (LPI-701-100)

## Lernziele
- Die wichtigsten Kommandos und Konzepte rund um systemd, Logging, Service-Monitoring und Troubleshooting sicher beherrschen.
- Typische Prüfungsaufgaben und Problemstellungen im Bereich Service Operations lösen können.

---

## 1. Grundlagen Service Operations

### Themenüberblick:
- **systemd**: Steuerung und Überwachung von Systemdiensten (Units, Targets, Timer, Service-Dateien)
- **Logging & Journal**: Nutzung von `journalctl`, Logfilterung, Protokolldateien verstehen
- **Netzwerkdienste**: Starten, Stoppen, Status abfragen, Fehler analysieren
- **Monitoring**: Tools wie `top`, `htop`, `systemctl`, `ss`, `netstat`
- **Fehlerbehebung**: Logs lesen, Systemstatus prüfen, Recovery-Optionen
- **Sicherungs- & Recovery-Strategien**: Snapshots, Backups, Restore

---

## 2. Hands-on-Übungen

### A. systemd & Services
- Starte, stoppe und überprüfe den Status des Dienstes `sshd`:
  ```sh
  sudo systemctl start sshd
  sudo systemctl status sshd
  sudo systemctl stop sshd
