# LPI-701-100 Full Practice Exam Answers

### 1. Welche der folgenden Aussagen zu Docker-Containern sind korrekt? (2 richtige Antworten)
**Correct Answers:** c, a
**Explanation:** Docker-Container sind isolierte Umgebungen, die den Kernel des Host-Systems gemeinsam nutzen. Sie enthalten nur die Anwendung und ihre Abhängigkeiten, aber nicht das vollständige Betriebssystem.

### 2. Welche der folgenden Aussagen über Git sind korrekt? (3 richtige Antworten)
**Correct Answers:** b, d, e
**Explanation:** `git fetch` holt nur Änderungen vom Remote-Repository, ohne sie zu integrieren. `git pull` holt Änderungen und integriert sie in den aktuellen Branch. `git diff` zeigt Änderungen zwischen dem Arbeitsverzeichnis und dem Staging-Bereich (nicht direkt zwischen Arbeitsverzeichnis und letztem Commit).

### 3. Welche der folgenden Optionen sind Komponenten eines CI/CD-Workflows? (3 richtige Antworten)
**Correct Answers:** a, c, d
**Explanation:** Automatisierte Tests, statische Code-Analyse und Deployment sind essentielle Teile eines CI/CD-Workflows. Containerisierung ist eine unterstützende Infrastrukturmaßnahme und nicht direkt ein Teil des Workflows.

### 4. Welche der folgenden Aussagen zu Kubernetes-Pods sind korrekt? (2 richtige Antworten)
**Correct Answers:** b, c
**Explanation:** Ein Pod kann mehrere Container enthalten, die denselben Netzwerk-Namespace teilen. Pods sind die kleinste Bereitstellungseinheit in Kubernetes und können auf einem Node oder in einem Deployment ausgeführt werden.

### 5. Welche der folgenden Methoden verwendet man zur Verwaltung von geheimen Daten in Kubernetes? (2 richtige Antworten)
**Correct Answers:** c, d
**Explanation:** In Kubernetes werden geheime Daten durch `Secrets` verwaltet. Man kann sie auch über die Kubernetes API ansprechen.

### 6. Was ist ein Vorteil von Infrastruktur als Code (IaC)? (1 richtige Antwort)
**Correct Answers:** c
**Explanation:** IaC ermöglicht die Versionierung und Wiederholbarkeit der Infrastruktur. Es fördert automatisierte und reproduzierbare Umgebungen.

### 7. Welche der folgenden Optionen sind Vorteile von Immutable Infrastructure? (2 richtige Antworten)
**Correct Answers:** a, c
**Explanation:** Immutable Infrastructure bedeutet, dass Serverumgebungen konstant bleiben und bei Änderungen durch neue Instanzen ersetzt werden, statt durch Upgrades.

### 8. Welches der folgenden Tools wird für die Verwaltung von Configuration Management in einer DevOps-Umgebung verwendet? (2 richtige Antworten)
**Correct Answers:** c, e
**Explanation:** Ansible wird für Configuration Management verwendet. GitLab CI bietet CI/CD-Integrationen, die auch Konfigurationsmanagementprozesse unterstützen können.

### 9. Welche der folgenden Aussagen über REST-APIs sind korrekt? (3 richtige Antworten)
**Correct Answers:** a, c, b
**Explanation:** REST-APIs sind zustandslos und basieren auf HTTP-Methoden. Sie verwenden häufig JSON, aber auch andere Formate sind möglich. Sie sind nicht auf lokale Netzwerke beschränkt.

### 10. Welche der folgenden Aufgaben gehören zur Automatisierung der Infrastruktur im Kontext von DevOps? (2 richtige Antworten)
**Correct Answers:** b, d
**Explanation:** Terraform wird zur Provisionierung von Cloud-Ressourcen verwendet und Ansible zur Verwaltung und Automatisierung der Serverkonfiguration.

