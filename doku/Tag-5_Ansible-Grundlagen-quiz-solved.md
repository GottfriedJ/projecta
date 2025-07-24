📝 Quiz – Tag 5: Ansible-Grundlagen
1. Welche Aussage trifft auf Ansible zu?
 x Es benötigt keinen Agenten auf dem Zielsystem

   Es verwendet standardmäßig einen zentralen Server-Agent

 x Es verwendet SSH zur Verbindung mit den Zielsystemen

   Es wird auf jedem Zielsystem installiert

2. Welche der folgenden Module werden für Dateiverwaltung verwendet?
 x copy

 x template

   apt

   yum

3. Was ist die Funktion des --check-Modus?
 Führt das Playbook vollständig aus

 Prüft nur die Syntax

 x Simuliert die Ausführung ohne Änderungen

 Führt nur das erste Task aus

4. Welches Modul solltest du NICHT verwenden, wenn Pipes (|) in einem Shell-Befehl vorkommen?
 x command

 shell

 raw

 template

5. Welche Vorteile bietet Jinja2 im Kontext von Ansible?
 x Variablen können in Konfigurationsdateien verwendet werden

 x Templates lassen sich dynamisch erzeugen

   Es ersetzt YAML vollständig

   Es verhindert den Einsatz von Variablen

6. Welche Datei ist typisch für eine statische Host-Definition in Ansible?
 x inventory.ini

   ansible.cfg

   hosts.yaml

   playbook.yml

7. Wozu dient become: true?
   Ansible-Logging aktivieren

 x Aufgaben mit Root-Rechten ausführen

   Das Playbook wird lokal ausgeführt

   Ansible aktualisiert sich selbst

8. Welche Datei ist standardmäßig die Ansible-Konfiguration?
   ansible_playbook.cfg

 x ansible.cfg

   inventory.yml

   main.yml

9. Was passiert, wenn ein Host nicht erreichbar ist?
 x Die Ausführung auf diesem Host schlägt fehl

 x Andere Hosts werden weiterhin verarbeitet

   Alle Hosts werden übersprungen

   Der Befehl wird auf einem zufälligen Host wiederholt

10. Welche dieser Playbook-Komponenten ist keine Top-Level-Direktive?
   name

   hosts

   tasks

 x script

