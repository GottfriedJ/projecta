🧩 Quiz zu Kubernetes (LPI-701-Stil)
Hinweis: Jede Frage hat 1–3 richtige Antworten. Antworten am Ende.

1. Welche Komponenten gehören zum Kubernetes Control Plane?
   A. kube-scheduler
   B. kubelet
   C. etcd
   D. kube-proxy
   E. controller-manager

2. Was ist ein Pod in Kubernetes?
   A. Ein Container-Orchestrierungs-Tool
   B. Die kleinste deploybare Einheit
   C. Eine Gruppe von einem oder mehreren Containern
   D. Eine Netzwerkkomponente
   E. Eine Datenbank-Instanz

3. Welche Aussagen zu kubectl apply sind korrekt?
   A. Nutzt deklarative Konfiguration
   B. Ändert direkt den Container-Inhalt
   C. Kann mit YAML-Dateien arbeiten
   D. Wird für imperative Kommandos genutzt
   E. Funktioniert nur mit Pods

4. Welche Ressourcen können Secrets in Kubernetes referenzieren?
   A. Deployments
   B. ConfigMaps
   C. Volumes
   D. Pods
   E. Services

5. Welche der folgenden YAML-Schlüssel sind gültig in einem Deployment?
   A. replicas
   B. containers
   C. selector
   D. metadata
   E. nodeName

6. Was bewirkt kubectl expose?
   A. Erstellt ein neues Deployment
   B. Erstellt einen Service zu einem bestehenden Pod/Deployment
   C. Skaliert eine Anwendung
   D. Öffnet ein Volume
   E. Bindet eine ConfigMap ein

7. Welche Service-Typen gibt es in Kubernetes?
   A. NodePort
   B. LoadBalancer
   C. ClusterIP
   D. ExternalIP
   E. InternalDNS

8. Welche Möglichkeiten gibt es, ein Container-Image zu definieren?
   A. Über kubectl run
   B. In der Deployment-YAML unter spec.template.spec.containers.image
   C. Über ein ConfigMap-Volume
   D. Direkt per docker pull
   E. Durch Helm-Charts

9. Welche Befehle zeigen den Status eines Pods an?
   A. kubectl get pods
   B. kubectl status pod <name>
   C. kubectl describe pod <name>
   D. kubectl logs <name>
   E. kubectl run status

10. Welche Vorteile bietet ein Deployment-Objekt?
    A. Rollbacks
    B. Versionierung von Docker-Images
    C. Rolling Updates
    D. Manuelle Containerstarts
    E. Replikation

✅ Lösungen
✅ A, C, E

✅ B, C

✅ A, C

✅ A, C, D

✅ A, C, D

✅ B

✅ A, B, C

✅ A, B, E

✅ A, C, D

✅ A, C, E

