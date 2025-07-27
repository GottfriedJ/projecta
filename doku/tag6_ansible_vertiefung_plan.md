# 🧠 Tag 6 – Ansible Vertiefung (LPI 701-100)

## Ziel
Du verstehst komplexere Aspekte von Ansible, kannst Rollen strukturieren, Jinja2-Templates einsetzen und Aufgaben modular aufbauen.

---

## 📚 Lerninhalte (ca. 3–4 Stunden)

### 1. 📂 Rollen in Ansible
- Struktur: `roles/<rolle>/{tasks, handlers, templates, files, defaults, vars, meta}`
- Verwendung:
  ```yaml
  roles:
    - webserver
  ```
- Unterschied `vars/` vs `defaults/`

---

### 2. 🧱 Modularisierung und Wiederverwendung
- `import_tasks`, `include_tasks`, `import_playbook`
- Dynamisch vs. statisch

---

### 3. 🎭 Jinja2-Templates
- Syntax: `{{ variable }}`
- Filter: `{{ var | default('foo') }}`
- Bedingungen:
  ```jinja2
  {% if ansible_os_family == 'Debian' %}
  ...
  {% endif %}
  ```

---

### 4. 📜 Ansible-Facts
- Zugriff über `ansible_facts`, z.B.:
  ```yaml
  ansible_facts['distribution']
  ```
- Fakten explizit sammeln mit `setup`

---

### 5. 🔐 Vaults & Secrets
- Vault-Datei erstellen:
  ```bash
  ansible-vault create secrets.yml
  ```
- Verwendung:
  ```yaml
  vars_files:
    - secrets.yml
  ```

---

### 6. 🔁 Loops, `when`, `register`
- Beispiel:
  ```yaml
  with_items: "{{ packages }}"
  when: ansible_os_family == 'RedHat'
  register: result
  ```

---

### 7. 🧪 Testing / Syntaxprüfung
- Syntax-Check:
  ```bash
  ansible-playbook --syntax-check playbook.yml
  ```
- Dry-Run:
  ```bash
  ansible-playbook playbook.yml --check
  ```

---

## 🧩 Optional: Übung

Erstelle eine Rolle `webserver`, die:
- Apache auf Debian installiert
- ein Jinja2-Template für die `index.html` nutzt
- den Service neustartet, wenn sich die Konfiguration ändert