# 🧪 Tag 6 – Ansible Quiz

## Multiple Choice (nur eine Antwort richtig)

---

**Frage 1**  
Was ist der Hauptunterschied zwischen `vars/` und `defaults/` in einer Rolle?

- [ ] A) `vars/` wird dynamisch geladen, `defaults/` statisch  
- [ ] B) `defaults/` hat niedrigere Priorität bei Variablenauflösung  
- [ ] C) `vars/` wird später geladen als `defaults/`  
- [ ] D) `defaults/` überschreibt `vars/`

---

**Frage 2**  
Wie binden Sie die Rolle `nginx` in ein Playbook ein?

- [ ] A) `tasks: - role: nginx`  
- [ ] B) `roles: - nginx`  
- [ ] C) `include_role: nginx`  
- [ ] D) `- import_role: name=nginx`

---

**Frage 3**  
Wie geben Sie in einem Template einen Standardwert für eine Variable an?

- [ ] A) `{{ variable := 'default' }}`  
- [ ] B) `{{ variable | default('default') }}`  
- [ ] C) `{{ default(variable, 'default') }}`  
- [ ] D) `{{ variable ? 'default' }}`

---

**Frage 4**  
Welche Aussage zu `import_tasks` ist korrekt?

- [ ] A) Aufgaben werden zur Laufzeit eingebunden  
- [ ] B) Es ist identisch zu `include_tasks`  
- [ ] C) Aufgaben werden vor dem Playbook-Start eingelesen  
- [ ] D) Es erlaubt keine Bedingungen

---

**Frage 5**  
Wie greift man auf die Distribution des Zielsystems über Facts zu?

- [ ] A) `{{ ansible_distribution }}`  
- [ ] B) `{{ facts.distribution }}`  
- [ ] C) `{{ hostvars['distribution'] }}`  
- [ ] D) `{{ setup['distribution'] }}`

---

**Frage 6**  
Was passiert bei `ansible-playbook playbook.yml --check`?

- [ ] A) Syntaktische Prüfung  
- [ ] B) Ausführung ohne Veränderungen  
- [ ] C) Ausgabe in der Shell  
- [ ] D) Validierung des Inventars

---

**Frage 7**  
Welches Format verwendet `ansible-vault` standardmäßig?

- [ ] A) XML  
- [ ] B) JSON  
- [ ] C) YAML  
- [ ] D) INI

---

**Frage 8**  
Wozu dient `register`?

- [ ] A) Zum Speichern von Playbook-Ergebnissen  
- [ ] B) Zum Wiederverwenden von Rollen  
- [ ] C) Zum Starten von Services  
- [ ] D) Zum Definieren von Hostvariablen

---

**Frage 9**  
Welches Modul sammelt Facts?

- [ ] A) `facts`  
- [ ] B) `collect`  
- [ ] C) `setup`  
- [ ] D) `register`

---

**Frage 10**  
Was passiert bei `when: ansible_os_family == "Debian"` wenn das nicht zutrifft?

- [ ] A) Task wird übersprungen  
- [ ] B) Task schlägt fehl  
- [ ] C) Playbook bricht ab  
- [ ] D) Task wird trotzdem ausgeführt