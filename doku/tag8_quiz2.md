Frage 1:
Welche Aussagen über inventory_hostname sind korrekt?

A. Es ist der Hostname des Systems laut uname -n
B. Es ist der Name aus dem Inventory
C. Es ist immer gleich wie ansible_hostname
D. Wird automatisch aus dem DNS des Hosts gelesen

Frage 2:
Welche Parameter sind beim Modul file gültig?

A. path
B. state
C. owner
D. lines
E. mode

Frage 3:
Welche state-Werte sind im file-Modul erlaubt?

A. absent
B. present
C. directory
D. touched
E. file

Frage 4:
Welche Module eignen sich zur Manipulation von Konfigurationsdateien im INI-Format?

A. template
B. ini_file
C. lineinfile
D. copy
E. blockinfile

Frage 5:
Was bewirkt ein handler in Ansible?

A. Er wird automatisch bei jedem Task ausgeführt
B. Er wird nur bei Änderungen durch einen notify-Aufruf getriggert
C. Er kann mehrere Tasks enthalten
D. Er ersetzt reguläre Tasks im Playbook

Frage 6:
Welche Features bieten Ansible-Rollen?

A. Wiederverwendbarkeit von Code
B. Automatisches Installieren von Collections
C. Trennung von Variablen, Tasks, Templates
D. Versionsverwaltung in der Rolle selbst

Frage 7:
Welche der folgenden Schlüsselwörter gehören zur Ansible-Syntax?

A. when
B. become
C. runas
D. loop
E. do

Frage 8:
Welche der folgenden Tasks erzeugt eine Datei mit bestimmten Rechten?

A.

yaml
Kopieren
Bearbeiten
- name: Create a file  
  file: path=/tmp/demo.txt state=touch mode='0644'
  B.

yaml
Kopieren
Bearbeiten
- name: Create with wrong module  
  command: touch /tmp/demo.txt mode=0644
  C.

yaml
Kopieren
Bearbeiten
- name: Ensure file exists  
  file: path=/tmp/demo.txt state=file mode=644
  D.

yaml
Kopieren
Bearbeiten
- name: Template to file  
  template: src=a.j2 dest=/tmp/a.conf mode='0644'
  Frage 9:
  Welche der folgenden Bedingungen sind korrekt?

A. when: ansible_os_family == "Debian"
B. when: ansible_distribution == "Ubuntu"
C. when: inventory_hostname in groups['web']
D. when: item = 'value'

Frage 10:
Was trifft auf Variablen im Template zu?

A. Doppelte geschweifte Klammern sind Pflicht ({{ ... }})
B. Variablen können Bedingungen enthalten
C. Variablenzugriff funktioniert nur im YAML
D. ansible_facts sind im Template nutzbar

🟩 Antworten
1. B
2. A, B, C, E
3. A, C, D, E
4. B, C, E
5. B, C
6. A, C
7. A, B, D
8. A, C, D
9. A, B, C
10. A, B, D

