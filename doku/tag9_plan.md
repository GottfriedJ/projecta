📅 Tag 9 – Kubernetes Grundlagen (Plan)

🧠 Lernziele
Kubernetes-Architektur verstehen
Pods, Deployments und Services anwenden
Umgang mit kubectl
YAML-Definitionen lesen & schreiben
Volumes & ConfigMaps kennenlernen

📘 Lerninhalte
1. Einführung in Kubernetes
Was ist Kubernetes?
Architektur: Master, Nodes, etcd, Scheduler, Controller Manager
Container-Orchestrierung

2. Wichtige Konzepte
Pod: Kleinste deploybare Einheit
Deployment: Verwaltung von Replikaten & Rollouts
Service: Netzwerk-Zugriff auf Pods
Namespace, Label, Selector, ReplicaSet

3. Arbeiten mit kubectl
kubectl get, apply, describe, delete
Ressourcen aus YAML erstellen
Logs und Status prüfen

4. Konfigurationsressourcen
ConfigMap und Secret
Volumes (emptyDir, hostPath)
Environment-Variablen für Container

5. Beispielübung
Deployment einer einfachen NGINX-Anwendung mit Service
Skalierung und Update demonstrieren

🔧 Praxisbeispiele
kubectl create deployment web --image=nginx
kubectl expose deployment web --port=80 --type=NodePort
kubectl scale deployment web --replicas=3
kubectl get all

