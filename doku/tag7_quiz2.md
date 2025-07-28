Frage 1:
Welche der folgenden Befehle führen ein Playbook aus?

A. ansible-run myplay.yml
B. ansible-playbook myplay.yml
C. ansible -m playbook myplay.yml
D. ansible-playbook -i inventory.ini myplay.yml

Frage 2:
Was bewirkt der Parameter --check bei ansible-playbook?

A. Führt das Playbook aus, ohne Änderungen vorzunehmen
B. Deaktiviert alle Handler
C. Prüft nur die Syntax des Playbooks
D. Simuliert die Ausführung („Dry Run“)

Frage 3:
Welche Module können zum Kopieren von Dateien verwendet werden?

A. copy
B. fetch
C. template
D. lineinfile
E. file

Frage 4:
Welche Aussagen zu Rollen sind korrekt?

A. Rollen müssen in site.yml eingebunden werden
B. Rollen besitzen einen vordefinierten Verzeichnisbaum
C. Rollen können nur mit include_role eingebunden werden
D. Rollen unterstützen eigene Variablen und Handler

Frage 5:
Welche dieser Variablenquellen überschreiben Werte aus defaults/main.yml?

A. Variablen in der Kommandozeile (-e)
B. Variablen in vars/main.yml der Rolle
C. Facts
D. Variablen in group_vars/

Frage 6:
Was trifft auf gather_facts: false zu?

A. Deaktiviert das Sammeln von Fakten beim Start
B. Verhindert die Ausführung aller Tasks
C. Ist die Standardeinstellung
D. Beschleunigt die Ausführung, wenn keine Facts benötigt werden

Frage 7:
Welche der folgenden sind gültige Ansible-Facts?

A. ansible_hostname
B. ansible_os_family
C. inventory_hostname
D. ansible_distribution
E. ansible_ip

Frage 8:
Welche Dateien können verwendet werden, um Host-spezifische Variablen zu definieren?

A. host_vars/HOSTNAME.yml
B. group_vars/HOSTNAME.yml
C. inventory.ini
D. hosts.yml

Frage 9:
Welche Statements zur Verwendung von Jinja2 in Templates sind korrekt?

A. {% if ... %} ist eine Steueranweisung
B. {{ ... }} gibt den Wert einer Variablen aus
C. {# ... #} kommentiert den Code aus
D. << ... >> wird für Schleifen verwendet

Frage 10:
Was macht das notify-Attribut in einem Task?

A. Startet einen Task neu
B. Ruft einen Handler auf
C. Muss immer mit when kombiniert werden
D. Wird bei changed: true ausgelöst

🟩 Antworten
1. B, D
2. A, D
3. A, B, C
4. B, D
5. A, B, D
6. A, D
7. A, B, D
8. A, C
9. A, B, C
10. B, D

