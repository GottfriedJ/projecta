
# 📅 Tag 7: Jenkins – Pipeline aus Git laden & SCM-Verknüpfung

## 🎯 Ziele des Tages
- Ein Jenkinsfile aus einem Git-Repository nutzen
- Verbindung von Jenkins zu GitHub oder GitLab
- Webhooks und automatisches Auslösen von Builds

---

## 🔗 1. Jenkins mit Git verbinden

### Voraussetzungen:
- Öffentliches oder per SSH erreichbares Git-Repo
- Git-Plugin in Jenkins installiert

### GitHub-Zugang via HTTPS:
1. Jenkins → „Neuer Job“ → „Pipeline“
2. Unter „Pipeline“:
   - Definition: „Pipeline script from SCM“
   - SCM: Git
   - Repository URL: z. B. `https://github.com/benutzer/repo.git`
3. Branch-Specifier: `*/main` oder `*/master`

### SSH-Verbindung (optional):
- SSH-Key generieren und in GitHub/GitLab hinterlegen
- Key auch Jenkins zugänglich machen (`~/.ssh/id_rsa`)

---

## 📁 2. Jenkinsfile im Repo nutzen

### Beispielstruktur:
```
repo/
├── Jenkinsfile
├── src/
└── README.md
```

Jenkins sucht automatisch nach der Datei `Jenkinsfile` im Root des Repos.

---

## 🔔 3. Automatischer Build per Webhook

### GitHub:
1. Repository → Settings → Webhooks → Add Webhook
2. Payload URL: `http://<jenkins-url>/github-webhook/`
3. Content-Type: `application/json`
4. Event: „Just the push event“
5. Jenkins-Job → „Build Triggers“ → „GitHub hook trigger“

---

## 🧪 4. Mini-Quiz / Verständnisfragen

1. Woher lädt Jenkins das Jenkinsfile?
2. Wie kann man Jenkins mit einem Git-Repository verbinden?
3. Was ist der Unterschied zwischen „Pipeline script“ und „Pipeline from SCM“?
4. Wie löst ein Webhook einen Build aus?
5. Wozu dienen SSH-Keys in Jenkins?

---

## 🔁 Wiederholung & Ausblick

- Wiederhole: Jenkinsfile aus Git laden, Webhook konfigurieren
- Morgen (Tag 8): **Build-Artefakte erzeugen und archivieren**
