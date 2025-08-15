# Ansible Cheat‑Sheet: Variablen‑Präzedenz (Priorität) 🧭

**Ziel:** Schnell verstehen, *welcher* Wert gewinnt, wenn dieselbe Variable an mehreren Stellen definiert ist.

---

## TL;DR — Reihenfolge (niedrig → hoch)

> **Letzteres gewinnt**: Je „näher“ am Task/Play und je expliziter, desto höher die Priorität.

1. **Role Defaults** (`roles/<role>/defaults/main.yml`)  
2. Inventory **group vars** (`group_vars/all`, `group_vars/<group>`)  
3. Inventory **host vars** (`host_vars/<host>`)  
4. **Host Facts** (gathered) & **cached set_fact**  
5. **Play vars** / `vars_prompt` / `vars_files`  
6. **Role Vars** (`roles/<role>/vars/main.yml`)  
7. **Block vars** → **Task vars**  
8. **include_vars**, **registered vars** & `set_fact` (nicht gecached)  
9. **Role params** (Variablen beim Rollenaufruf)  
10. **include params**  
11. **Extra Vars** (`-e ...`) **gewinnt immer**

Quelle & vollständige Liste mit Feinkörnigkeit (22 Stufen) in der offiziellen Doku. citeturn1view0

---

## „Große Vier“ (Praxisregel)

- **Role Defaults** → niedrigste Priorität, gut für **tunable Defaults**.  
- **Inventory** (`group_vars`/`host_vars`) → Site-/Host‑spezifische Werte.  
- **Role Vars** → **hoch**; für **konstante, nicht tunbare** Rollendaten.  
- **Extra Vars (`-e`)** → **oberste** Ebene für zwingende Overrides.  
(Details & Reihenfolge: offizielle Doku. citeturn1view0)

---

## Rollen: Defaults vs. Vars vs. Params

| Ort                              | Typische Nutzung                                      | Priorität |
|----------------------------------|--------------------------------------------------------|-----------|
| `roles/x/defaults/main.yml`      | Standardwerte, die *leicht überschreibbar* sein sollen | niedrig   |
| `roles/x/vars/main.yml`          | Feste, rolleninterna Werte (nicht tunbar)             | hoch      |
| **Rollen‑Parameter** beim Aufruf | Pro Einsatz der Rolle gezielt überschreiben            | sehr hoch |

**Beispiel – gezielt pro Aufruf überschreiben:**
```yaml
- hosts: web
  roles:
    - role: nginx
      vars:
        listen_port: 8080        # überschreibt defaults (nicht aber extra-vars)
```
Role‑ und Include‑Parameter sind weit oben in der Präzedenz, nur `-e` ist stärker. citeturn1view0

---

## Inventory‑Variablen (Merging & Überschreiben)

- **Host vars > Group vars** (host-spezifisch gewinnt).  
- Mehrere Gruppen: Die **zuletzt geladene** überschreibt vorherige Werte (Default: `hash_behavior=replace`).  
- Gemeinsame Site‑Defaults sinnvoll in `group_vars/all`. citeturn1view0

**Strukturbeispiel:**
```
inventory/
├─ group_vars/
│  ├─ all.yml            # siteweite Defaults
│  └─ web.yml            # gilt für Gruppe 'web'
└─ host_vars/
   └─ web1.yml           # überschreibt 'web' für Host web1
```

---

## `set_fact`, Registered Vars & Facts

- `set_fact` erzeugt **host‑lokale** Variablen; im selben Play **hoch** priorisiert, aber **unter** Role/Include‑Params & `-e`.  
- Mit `set_fact: cacheable: true` werden Werte faktisch zu **Facts** (gleiche Ebene wie gathered facts). citeturn1view0

**Beispiel:**
```yaml
- set_fact:
    ds_version: "2.4"
    cacheable: true   # → wie Host Facts in der Präzedenz
```

---

## Block‑ & Task‑Variablen

- **Block‑Variablen** gelten für alle Tasks im Block.  
- **Task‑Variablen** gelten nur für den einzelnen Task und stehen **über** Block‑Variablen. citeturn1view0

```yaml
- block:
    - name: nutzt block-var
      vars: { mode: "0644" }   # task-var überschreibt block-var
      copy:
        src: app.conf
        dest: /etc/app/app.conf
        mode: "{{ mode }}"
  vars:
    mode: "0600"               # block-var (niedriger als task-var)
```

---

## `include_vars`, `vars_files` und `vars_prompt`

- **Play‑lokale** Quellen; in der Hierarchie **über** Inventory/Host Facts, aber **unter** Role Vars & Task Vars.  
- `include_vars` lädt Variablen **zur Laufzeit**, `vars_files` beim **Parsing**. citeturn1view0

---

## Helmregel: Wo lege ich welchen Wert ab?

- **Tunable Standardwerte** → `roles/<role>/defaults/main.yml`  
- **Standort-/Gruppen‑Spezifisches** → `group_vars/<group>.yml`  
- **Host‑Spezifisches/Secrets** → `host_vars/<host>.yml` (ggf. Vault)  
- **Harte Rolleninterne Konstanten** → `roles/<role>/vars/main.yml`  
- **Einmalige Overrides je Lauf** → `-e` (Extra Vars)  
- **Gezielter Rollen‑Override pro Verwendung** → Rollen‑Parameter im `roles:`‑Block

---

## Häufige Stolpersteine

- **Role Vars überschreiben Inventory** → keine tunbaren Einstellungen dort ablegen.  
- `default()` vs. leere Werte: `{{ var | default('x') }}` greift nur bei **undefiniert**, für **undefiniert oder leer** → `{{ var | default('x', true) }}`.  
- Mehrere Gruppen definieren dieselbe Variable → **Lade-Reihenfolge** entscheidet (last wins), außer man nutzt `hash_behavior=merge`. citeturn1view0

---

## Debug & Diagnose

```bash
# Aufgelöstes Inventory anzeigen
ansible-inventory -i inventories/prod --list | jq '.'

# Welche ansible.cfg wird genutzt?
ansible-config dump | grep CONFIG_FILE -n
ansible --version

# Zur Laufzeit prüfen, welcher Wert „gewinnt“
ansible -m debug -a 'var=myvar' all -i inventories/prod
```

---

### Referenz
- **Offizielle Präzedenz‑Liste (detailliert, 22 Stufen)**: *Using variables → Understanding variable precedence* (Ansible Community Docs). citeturn1view0