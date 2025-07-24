# 📅 Tag 5 – Ansible-Grundlagen

## Lernziele

- Funktionsweise von Ansible verstehen
- Inventory-Dateien anlegen
- Module verwenden (`ping`, `command`, `shell`, `copy`, `template`, `apt`, `yum`, etc.)
- Erste Playbooks schreiben
- Ansible in Verbindung mit SSH verwenden
- Ansible-Variablen, Hosts und Gruppen
- Unterschied zwischen ad-hoc und Playbook-Einsatz

---

## 🧠 Theoretische Inhalte

### Was ist Ansible?
Ansible ist ein agentenloses Automatisierungs-Tool, das via SSH Konfigurationen ausrollt und Systeme verwaltet.

### Inventories
Enthalten Informationen über die verwalteten Hosts:

```ini
[webserver]
192.168.1.10
192.168.1.11

[db]
192.168.1.12 ansible_user=postgres



Wichtige Module
- ping: Testet Konnektivität
- command: Führt ein Kommando aus
- shell: Führt Shell-Kommandos aus (mit Pipes etc.)
- copy: Kopiert Dateien auf Remote-Hosts
- template: Nutzt Jinja2-Templating
- apt, yum: Paketverwaltung

Beispiel Ad-Hoc-Befehl:
ansible all -i inventory.ini -m ping
ansible webserver -i inventory.ini -m apt -a "name=nginx state=present"


#Einfaches Playbook
---
- name: Installiere nginx
  hosts: webserver
  become: true
  tasks:
    - name: Install nginx
      apt:
        name: nginx
        state: present


#Templating
jinja2: Hallo, mein Name ist {{ ansible_hostname }}

🛠 Übungen
✅ Test: SSH-Zugang zu Zielhost ohne Passwort (via Key)
✅ Inventory-Datei anlegen mit mindestens zwei Gruppen
✅ Ad-hoc-Befehl: Hostname anzeigen lassen
✅ Playbook schreiben: NGINX installieren
✅ Template einsetzen: HTML-Datei mit Variablen generieren
✅ Playbook laufen lassen und --check-Modus testen
✅ Unterschiede command vs shell nachvollziehen


