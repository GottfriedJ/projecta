## Cheat-Sheet – Container-Orchestrierung

### Grundkonzepte
- Container-Orchestrierung automatisiert Deployment, Skalierung, Netzwerk und Ausfallsicherheit.
- Haupttools: Kubernetes, Docker Swarm, Nomad, OpenShift.

### Kubernetes Kernkomponenten
| Komponente           | Aufgabe |
|----------------------|---------|
| API-Server           | Zentrale REST-API |
| etcd                 | Schlüssel-Wert-Store |
| Controller-Manager   | Führt Controller aus |
| Scheduler            | Weist Pods Nodes zu |
| kubelet              | Startet Container auf Node |
| kube-proxy           | Service-Netzwerkregeln |

### Wichtige Objekte
- Pod, ReplicaSet, Deployment, StatefulSet, DaemonSet
- Service, Ingress
- ConfigMap, Secret

### Helm
- Paketmanager für Kubernetes, Charts = Templates + Variablen

### Befehle
```bash
kubectl get pods
kubectl describe pod POD
kubectl apply -f file.yaml
kubectl delete -f file.yaml
kubectl rollout status deployment DEPLOY
kubectl rollout undo deployment DEPLOY
kubectl scale deployment DEPLOY --replicas=3
kubectl cordon NODE
kubectl drain NODE --ignore-daemonsets
```

### Docker Swarm Basics
- `docker swarm init`
- `docker service create --name web --replicas 3 nginx`
- `docker service scale web=5`

### Nomad
- Leichtgewichtige Orchestrierung von HashiCorp
- Single-Binary, unterstützt Container & Non-Container-Workloads
