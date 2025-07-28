# Quiz zu Tag 8 – Wiederholung & Troubleshooting

## Fragen
1. Wie debuggt man ein Ansible-Playbook?
2. Was bedeutet Exit-Code 137 in Docker?
3. Was passiert bei `git pull --rebase`?
4. Wie kann man einen Jenkins-Agent debuggen?
5. Was ist der Unterschied zwischen `ansible_os_family` und `ansible_distribution`?
6. Was tun bei `Permission denied (publickey)` beim Git-Push?
7. Wie listet man alle Container mit Exit-Code ≠ 0?
8. Was zeigt `docker logs` an?
9. Wie erkennt man, ob ein Playbook `--check`-fähig ist?
10. Wie lassen sich Umgebungsvariablen in Jenkins übergeben?
11. Woran erkennt man Merge-Konflikte?
12. Wie verhindert man Secrets im Git-Repo?
13. Wie lässt sich ein fehlerhaftes Jenkinsfile testen?
14. Was ist ein Downstream-Job?
15. Was passiert, wenn `notify: restart apache2` ohne Handler?
16. Warum schlägt `docker build` bei fehlender Datei fehl?
17. Wie prüft man, ob ein Port offen ist?
18. Wie prüft man eine Variable in Jinja2?
19. Warum schlägt `docker-compose up` mit Port 80 fehl?
20. Wie findet man heraus, welcher Prozess Port 80 belegt?

## Antworten
1. Mit `-v`, `-vvv`, `ansible-playbook --syntax-check`
2. Container wurde durch SIGKILL beendet
3. Holt Commits und rebased lokale Änderungen darauf
4. Jenkins-Log, Agent-Log, `java -jar agent.jar -jnlpUrl ...`
5. `os_family` ist z. B. Debian, `distribution` ist Ubuntu
6. SSH-Key fehlt oder ist nicht beim Git-Anbieter hinterlegt
7. `docker ps -a --filter "exited!=0"`
8. Die Stdout/Stderr-Ausgabe des Containers
9. Wenn es keine destruktiven Tasks enthält
10. Mit `environment {}` oder `withEnv`
11. Git gibt Konfliktstellen in Dateien an (`<<<<<<< HEAD`)
12. `.gitignore`, Pre-Commit-Hooks, Secrets-Scanner
13. `pipeline-syntax` prüfen, Build mit Test-Repo machen
14. Ein Job, der nach einem anderen ausgeführt wird
15. Der Handler wird nicht gefunden, es passiert nichts
16. `COPY` oder `ADD` kann die Datei nicht finden
17. `ss -tuln`, `netstat`, `nc`, `telnet`, `nmap`
18. `{% if myvar is defined %}...{% endif %}`
19. Port ist evtl. schon durch anderen Dienst belegt
20. `ss -tuln | grep :80`, `lsof -i :80`
