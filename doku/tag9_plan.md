# 🧩 Tag 9 – Terraform, Vagrant & Immutable Infrastructure

## 🎯 Lernziele

- Grundprinzipien von Infrastructure as Code (IaC)
- Einsatz von Terraform zur Bereitstellung von Infrastruktur
- Nutzung von Vagrant zur lokalen VM-Verwaltung
- Verständnis des Konzepts „Immutable Infrastructure“

---

## 📚 Themenübersicht

### ✅ Terraform Basics
- Terraform-Konfiguration (.tf-Dateien)
- Ressourcen & Provider (z. B. `aws`, `local`, `null`)
- `terraform init`, `plan`, `apply`, `destroy`
- State-Datei und ihre Bedeutung

### ✅ Vagrant
- Erstellung und Verwaltung von VMs
- `Vagrantfile` verstehen
- Verwendung mit VirtualBox, libvirt oder VMware
- Unterschied zu Docker

### ✅ Immutable Infrastructure
- Definition: Keine Veränderungen am laufenden System – nur Rebuild
- Vorteile: Wiederholbarkeit, Automatisierung, Sicherheit
- Tool-Stack: Packer + Terraform + Jenkins

---

## 🛠️ Praktische Übungen

1. **Terraform-Projekt aufsetzen** (z.B. eine EC2-Instanz auf AWS starten)
2. **Vagrant VM starten** mit `ubuntu/bionic64`
3. **Unterschied Mutable vs. Immutable beschreiben**
4. **Diskussion**: Warum könnte Immutable für CI/CD besser sein?

---

## 🔁 Wiederholung/Reflexion
- Terraform State verstehen
- „Why not SSH into the server?“ diskutieren
- Wie würde eine Ansible-Rolle auf Immutable angepasst?

