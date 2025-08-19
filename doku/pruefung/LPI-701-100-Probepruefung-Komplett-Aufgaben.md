
# LPI-701-100 Probeprüfung – Aufgaben

Dies ist eine vollständige Probeprüfung mit **60 Fragen**, verteilt nach der ungefähren Gewichtung der LPI-701-100-Prüfung:

| Bereich                  | Gewicht | Anzahl Fragen |
| ------------------------ | ------- | ------------- |
| Software Engineering     | 30%     | 18            |
| Container Management     | 27%     | 16            |
| Machine Deployment       | 13%     | 8             |
| Configuration Management | 17%     | 10            |
| Service Operations       | 13%     | 8             |
| **Gesamt**               | 100%    | **60**        |

---

## 1. Software Engineering (18 Fragen)

**Frage 1:**  
Welches Git-Kommando zeigt die Unterschiede zwischen Arbeitsverzeichnis und Staging-Area?  
a) git diff --cached  
b) git diff  
c) git log -p  
d) git status  

**Frage 2:**  
Welches CI/CD-Tool basiert stark auf "Pipelines as Code"?  
a) Jenkins  
b) Nagios  
c) Prometheus  
d) Terraform  

**Frage 3:**  
Welche Aussage zu Unit-Tests ist korrekt?  
a) Testen die Integration mehrerer Module  
b) Testen einzelne Funktionen oder Methoden  
c) Werden nur manuell ausgeführt  
d) Ersetzen Integrationstests  

**Frage 4:**  
Welcher Befehl verwirft die letzten lokalen Änderungen in Git?  
a) git reset --hard  
b) git revert  
c) git clean -fd  
d) git stash apply  

**Frage 5:**  
Welche Eigenschaft beschreibt „idempotent“ in Ansible oder anderen Tools?  
a) Ein Task kann mehrfach ausgeführt werden, ohne das Endergebnis zu verändern  
b) Der Task wird nur einmal ausgeführt  
c) Es gibt keine Seiteneffekte  
d) Der Task benötigt zwingend Root-Rechte  

**Frage 6:**  
Welche Dateien sind typische Artefakte in einer CI/CD-Pipeline?  
a) Quellcode  
b) Build-Outputs (z. B. Binaries, Pakete)  
c) Systemlogs  
d) Testdatenbanken  

**Frage 7:**  
Welcher Git-Befehl kombiniert mehrere Commits in einem interaktiven Workflow?  
a) git squash  
b) git cherry-pick  
c) git rebase -i  
d) git merge --no-ff  

**Frage 8:**  
Welcher Statuscode von HTTP signalisiert „Created“?  
a) 200  
b) 201  
c) 204  
d) 404  

**Frage 9:**  
Welcher Vorteil hat REST gegenüber SOAP?  
a) Binäres Protokoll  
b) Plattformunabhängig, einfache JSON/XML-Nutzung  
c) Mehr Sicherheit  
d) Keine Authentifizierung nötig  

**Frage 10:**  
Welche Art von Tests prüft die Zusammenarbeit mehrerer Komponenten?  
a) Unit-Tests  
b) Integrationstests  
c) Akzeptanztests  
d) Benchmark-Tests  

**Frage 11:**  
Was macht `git cherry-pick`?  
a) Holt Änderungen aus einem Remote-Repository  
b) Wendet einen bestimmten Commit auf den aktuellen Branch an  
c) Entfernt Commits aus der Historie  
d) Zeigt Unterschiede zwischen Branches  

**Frage 12:**  
Welches Format wird üblicherweise für REST-Antworten verwendet?  
a) JSON  
b) CSV  
c) YAML  
d) INI  

**Frage 13:**  
Welcher Git-Befehl zeigt die Historie mit Änderungen an Dateien?  
a) git diff  
b) git log -p  
c) git show HEAD  
d) git blame  

**Frage 14:**  
Wie kann man eine lokale Branch-Referenz auf den Remote-Stand zurücksetzen?  
a) git fetch --hard  
b) git reset --hard origin/branch  
c) git checkout -b branch  
d) git clone --branch branch  

**Frage 15:**  
Welches Build-Tool wird häufig mit Java eingesetzt?  
a) Maven  
b) Gradle  
c) Ant  
d) Alle oben genannten  

**Frage 16:**  
Welche Aussage zu Git Submodules ist korrekt?  
a) Sie werden automatisch bei `git clone` mitgeladen  
b) Müssen mit `git submodule update --init` initialisiert werden  
c) Dienen zum Zwischenspeichern von Commits  
d) Können nicht versioniert werden  

**Frage 17:**  
Welche Art von Test stellt sicher, dass eine Anwendung den Anforderungen des Kunden entspricht?  
a) Integrationstest  
b) Akzeptanztest  
c) Lasttest  
d) Unit-Test  

**Frage 18:**  
Welcher Befehl zeigt an, welche Commits noch nicht gepusht wurden?  
a) git log origin..HEAD  
b) git status --unpushed  
c) git diff --cached  
d) git show remote  

---

## 2. Container Management (16 Fragen)

**Frage 19:**  
Welcher Befehl zeigt alle laufenden Container an?  
a) docker ps  
b) docker images  
c) docker exec  
d) docker inspect  

**Frage 20:**  
Welche Kubernetes-Ressource stellt sicher, dass immer eine feste Anzahl an Pods läuft?  
a) Deployment  
b) StatefulSet  
c) ReplicaSet  
d) DaemonSet  

**Frage 21:**  
Welcher Docker-Befehl erstellt ein Image aus einem Dockerfile?  
a) docker build  
b) docker create  
c) docker run  
d) docker commit  

**Frage 22:**  
Welches Tool wird häufig für Container-Orchestrierung genutzt?  
a) Kubernetes  
b) Podman  
c) Ansible  
d) Terraform  

**Frage 23:**  
Welches Kubernetes-Objekt ist zuständig für das Load-Balancing von Pods?  
a) Deployment  
b) ReplicaSet  
c) Service  
d) ConfigMap  

**Frage 24:**  
Welcher Befehl startet einen Container im Hintergrund?  
a) docker run -d  
b) docker start -f  
c) docker exec -d  
d) docker up -d  

**Frage 25:**  
Wie kann man ein Volume an einen Container anhängen?  
a) docker run -v /host:/container  
b) docker attach volume  
c) docker cp /host /container  
d) docker mount volume  

**Frage 26:**  
Welche Aussage zu Kubernetes Namespaces ist korrekt?  
a) Dienen der logischen Trennung von Ressourcen  
b) Erhöhen die Sicherheit im Kernel  
c) Werden nur für Storage verwendet  
d) Müssen für jeden Pod definiert werden  

**Frage 27:**  
Welcher Docker-Befehl entfernt gestoppte Container?  
a) docker clean  
b) docker rm  
c) docker prune  
d) docker stop --remove  

**Frage 28:**  
Welche Ressource speichert Konfiguration in Kubernetes?  
a) Secret  
b) ConfigMap  
c) Volume  
d) Service  

**Frage 29:**  
Welcher Befehl zeigt Logs eines Containers an?  
a) docker log  
b) docker inspect logs  
c) docker logs <id>  
d) docker cat <id>  

**Frage 30:**  
Welcher Kubernetes-Typ garantiert, dass ein Pod auf jedem Node läuft?  
a) Deployment  
b) StatefulSet  
c) ReplicaSet  
d) DaemonSet  

**Frage 31:**  
Welche Aussage zu StatefulSets ist korrekt?  
a) Sie garantieren identische Namen für Pods  
b) Sie verwalten zustandsbehaftete Anwendungen  
c) Sie sind nur für stateless Apps geeignet  
d) Sie ersetzen Deployments vollständig  

**Frage 32:**  
Was macht `docker exec -it container bash`?  
a) Startet einen neuen Container mit Bash  
b) Öffnet ein interaktives Bash-Terminal in einem Container  
c) Baut ein Image mit Bash-Support  
d) Fügt ein Volume hinzu  

**Frage 33:**  
Welcher Kubernetes-Befehl zeigt laufende Pods an?  
a) kubectl get pods  
b) kubectl show pods  
c) kubectl describe cluster  
d) kubectl list pods  

**Frage 34:**  
Welche Komponente in Kubernetes plant Pods auf Nodes?  
a) etcd  
b) kubelet  
c) scheduler  
d) controller-manager  

---

## 3. Machine Deployment (8 Fragen)

**Frage 35:**  
Welches Tool wird häufig für Infrastruktur als Code (IaC) genutzt?  
a) Terraform  
b) Docker  
c) Ansible  
d) Git  

**Frage 36:**  
Welche Cloud-Init Direktive definiert Benutzer, die beim ersten Booten erstellt werden sollen?  
a) users:  
b) write_files:  
c) packages:  
d) runcmd:  

**Frage 37:**  
Welches Virtualisierungs-Tool nutzt Vagrant standardmäßig?  
a) VMware  
b) VirtualBox  
c) Hyper-V  
d) KVM  

**Frage 38:**  
Welche Eigenschaft hat ein „Immutable Server“-Konzept?  
a) Server werden nachträglich angepasst  
b) Änderungen werden per SSH eingespielt  
c) Server werden neu provisioniert statt angepasst  
d) Konfiguration erfolgt manuell  

**Frage 39:**  
Welcher Befehl listet VMs bei VirtualBox?  
a) VBoxManage list vms  
b) vagrant status list  
c) virsh list --all  
d) vmctl status  

**Frage 40:**  
Welche Aussage zu Cloud-Init ist korrekt?  
a) Kann nur auf AWS genutzt werden  
b) Läuft beim ersten Boot-Prozess einer VM  
c) Wird ausschließlich für Container genutzt  
d) Ist ein Ansible-Modul  

**Frage 41:**  
Welcher Vagrant-Befehl startet eine VM?  
a) vagrant run  
b) vagrant up  
c) vagrant start  
d) vagrant boot  

**Frage 42:**  
Welche Datei definiert eine Vagrant-Umgebung?  
a) Vagrantfile  
b) vagrant.yml  
c) vm.conf  
d) VBoxfile  

---

## 4. Configuration Management (10 Fragen)

**Frage 43:**  
Welches Ansible-Modul installiert Pakete distributionsunabhängig?  
a) apt  
b) yum  
c) package  
d) dnf  

**Frage 44:**  
Wie führt man einen Dry-Run in Ansible aus?  
a) ansible-playbook play.yml --dry-run  
b) ansible-playbook play.yml --test  
c) ansible-playbook play.yml --check  
d) ansible-playbook play.yml --syntax-check  

**Frage 45:**  
Welcher Ansible-Befehl zeigt verfügbare Hosts an?  
a) ansible-inventory --list  
b) ansible hosts --all  
c) ansible-playbook --list  
d) ansible show inventory  

**Frage 46:**  
Welche Ansible-Variable hat die höchste Priorität?  
a) Rollen-Defaults  
b) Inventory-Variablen  
c) Extra-Variablen (-e)  
d) Variablen in Playbooks  

**Frage 47:**  
Welche Aussage zu Ansible ist korrekt?  
a) Benötigt zwingend einen Agenten auf Zielsystemen  
b) Arbeitet agentlos per SSH  
c) Funktioniert nur mit Red Hat  
d) Nutzt ausschließlich Windows-Systeme  

**Frage 48:**  
Welches Ansible-Modul bearbeitet INI-Dateien?  
a) ini_file  
b) file  
c) config_file  
d) lineinfile  

**Frage 49:**  
Welche YAML-Syntax ist korrekt?  
a) key = value  
b) key: value  
c) key -> value  
d) key(value)  

**Frage 50:**  
Welcher Ansible-Befehl verschlüsselt Dateien?  
a) ansible encrypt  
b) ansible-vault encrypt  
c) ansible-vault lock  
d) ansible lock  

**Frage 51:**  
Welches Ansible-Modul führt Shell-Befehle aus?  
a) shell  
b) command  
c) script  
d) Alle oben genannten  

**Frage 52:**  
Welche Datei enthält üblicherweise die Inventar-Informationen?  
a) /etc/ansible/hosts  
b) ansible.conf  
c) inventory.yaml  
d) playbook.yml  

---

## 5. Service Operations (8 Fragen)

**Frage 53:**  
Welcher Befehl zeigt Systemd-Logs der Priorität "warning" bis "emerg"?  
a) journalctl -p warning..emerg  
b) journalctl --priority=warning  
c) dmesg --level=warning..emerg  
d) systemctl status -p warning  

**Frage 54:**  
Welches Monitoring-Tool nutzt "exporter"-Konzepte zur Metriksammlung?  
a) Nagios  
b) Prometheus  
c) Jenkins  
d) Grafana  

**Frage 55:**  
Welches Tool dient zur Visualisierung von Metriken?  
a) Grafana  
b) Prometheus  
c) Nagios  
d) Kibana  

**Frage 56:**  
Welches Tool sammelt Logfiles zentralisiert?  
a) Filebeat  
b) Logstash  
c) Fluentd  
d) Alle oben genannten  

**Frage 57:**  
Welches Kommando zeigt offene Netzwerkports unter Linux an?  
a) netstat -tulpen  
b) ss -tuln  
c) lsof -i  
d) Alle oben genannten  

**Frage 58:**  
Welche Aussage zu „Pushgateway“ in Prometheus ist korrekt?  
a) Dient zum Pushen kurzlebiger Jobs  
b) Ersetzt Prometheus vollständig  
c) Ist ein Visualisierungstool  
d) Wird für Datenbanken genutzt  

**Frage 59:**  
Welcher Befehl zeigt den Status eines Systemd-Dienstes an?  
a) systemctl status <service>  
b) systemctl show <service>  
c) service <service> status  
d) Alle oben genannten  

**Frage 60:**  
Welche Bedrohung gehört nicht zu den OWASP Top 10?  
a) SQL-Injection  
b) Cross-Site Scripting  
c) Man-in-the-Middle  
d) Broken Authentication  

---

## Ende der Aufgaben
