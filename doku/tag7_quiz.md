# Quiz zu Tag 7 – Jenkins und CI/CD

## Fragen
1. Was ist ein Jenkins-Agent?
2. Welche Dateiendung hat ein Jenkinsfile?
3. Wozu dient das Plugin "Pipeline"?
4. Wie kann ein Build automatisiert getriggert werden?
5. Was ist ein Multibranch-Projekt?
6. Wo werden Jenkins-Credentials gespeichert?
7. Wie übergibt man ein Secret in einem Jenkinsfile?
8. Was bewirkt `post { always { ... }}` in einer Pipeline?
9. Wie kann man Jenkins in Docker starten?
10. Welche Rolle spielen Labels bei Agenten?
11. Wie kann Jenkins mit GitHub kommunizieren?
12. Was macht der `checkout scm` Schritt?
13. Was ist der Unterschied zwischen Freestyle- und Pipeline-Job?
14. Was ist ein Shared Library?
15. Wie kann man Jenkins erweitern?
16. Was passiert bei einem roten Build?
17. Wie kann man einen Jenkins-Build manuell starten?
18. Welche Vorteile hat Infrastructure as Code in Jenkins?
19. Wofür steht CI/CD?
20. Wie sichert man Jenkins-Konfigurationen?

## Antworten
1. Eine ausführende Instanz (Master oder Worker)
2. Keine, es heißt genau `Jenkinsfile`
3. Es ermöglicht deklarative Pipelines
4. z.B. SCM-Webhook, Zeitplan, Upstream-Projekt
5. Ein Projekt mit dynamischen Branch-Jobs
6. In der globalen Jenkins-Konfiguration (unter „Credentials“)
7. Mit `credentials()` oder Umgebungsvariablen
8. Der Block wird immer ausgeführt, egal ob Erfolg oder Fehler
9. `docker run -p 8080:8080 jenkins/jenkins:lts`
10. Labels definieren, wo ein Job ausgeführt werden darf
11. Über Webhooks, Polling, Jenkins-Plugins (z.B. GitHub)
12. Holt den Quellcode des aktuellen Branches
13. Pipeline ist Code, Freestyle ist GUI-basiert
14. Gemeinsame Groovy-Funktionen für Pipelines
15. Über Plugins
16. Der letzte Build ist fehlgeschlagen
17. Über GUI oder REST-API
18. Versionierbarkeit, Wiederholbarkeit
19. Continuous Integration / Continuous Delivery
20. Durch Backup des JENKINS_HOME
