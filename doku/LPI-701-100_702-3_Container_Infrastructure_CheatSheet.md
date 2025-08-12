# LPI 701-100 Cheat-Sheet – 702.3 Container Infrastructure

## 📌 702.3 – Container Infrastructure (Gewicht: 4)

### 1. **Grundprinzip**
- **Container-Infrastruktur** = Alle Komponenten, die nötig sind, um Container in einem Cluster zu betreiben, zu verbinden, zu speichern und zu orchestrieren.
- Zentral: **Kubernetes** (K8s) oder andere Orchestrierungssysteme.

---

### 2. **Kubernetes-Architektur**
| Komponente        | Aufgabe |
|-------------------|---------|
| **kube-apiserver** | Zentrales API-Interface, über das alle Komponenten sprechen |
| **etcd**           | Key-Value-Store für Clusterzustand & Konfiguration |
| **kube-scheduler** | Weist Pods Nodes zu |
| **controller-manager** | Steuert verschiedene Controller (Replica, Endpoint, Namespace usw.) |
| **kubelet**        | Agent auf jedem Node, verwaltet Container auf diesem Node |
| **kube-proxy**     | Netzwerkrouting & Service-Weiterleitung |
| **Container Runtime** | z. B. containerd, CRI-O, Docker |

---

### 3. **Pod & Workload-Typen**
| Workload | Einsatzgebiet |
|----------|---------------|
| **Pod** | Kleinste deploybare Einheit, enthält Container |
| **ReplicaSet** | Stellt feste Anzahl identischer Pods sicher (stateless) |
| **Deployment** | Verwaltet ReplicaSets, Updates, Rollbacks |
| **StatefulSet** | Stateful Apps mit stabilen IDs & Volumes |
| **DaemonSet** | Genau 1 Pod pro Node |
| **Job** | Einmalige Tasks |
| **CronJob** | Wiederkehrende Tasks nach Zeitplan |

---

### 4. **Netzwerkmodell**
- **K8s-Netzwerkgrundregeln**:
  1. Jeder Pod hat eigene IP.
  2. Pods können ohne NAT direkt miteinander kommunizieren.
  3. Nodes können Pods direkt erreichen.
- Umsetzung über **CNI** (Container Network Interface).
- **Bekannte CNI-Plugins**:
  - **Calico** → Layer 3 Routing, Network Policies
  - **Flannel** → Einfaches Overlay-Netz
  - **Weave Net**, **Cilium** (BPF-basiert)
- **Ingress Controller** (z. B. Nginx, Traefik) → HTTP/S Routing von außen ins Cluster.

---

### 5. **Storage**
- **Volumes** (flüchtig oder persistent)
- **PersistentVolume (PV)** + **PersistentVolumeClaim (PVC)**
- **StorageClass** → Dynamische Bereitstellung
- Typische Backend-Systeme: NFS, Ceph, AWS EBS, CSI-Plugins

---

### 6. **Service-Typen**
| Typ          | Beschreibung |
|--------------|--------------|
| **ClusterIP** | Intern erreichbar (Standard) |
| **NodePort** | Port auf jedem Node freigegeben |
| **LoadBalancer** | Externe IP via Cloud-Provider |
| **ExternalName** | DNS-Name statt IP |

---

### 7. **Sicherheit**
- **Namespaces** → Isolation von Ressourcen  
- **RBAC** (Role-Based Access Control) → Rechteverwaltung  
- **Network Policies** → Definieren, welche Pods miteinander sprechen dürfen  
- **Secrets** & **ConfigMaps** → Konfigurations- und Geheimnisverwaltung  

---

### 8. **Monitoring & Logging**
- **Metrics Server** (CPU/RAM Nutzung)  
- **Prometheus + Alertmanager** → Monitoring & Alerts  
- **Grafana** → Visualisierung  
- **ELK / EFK Stack** → Logging  

---

### 9. **Typische Prüfungsbefehle**
```bash
# Pods anzeigen
kubectl get pods
kubectl get pods -o wide

# Details zu Pod
kubectl describe pod <name>

# Deployment erstellen
kubectl create deployment nginx --image=nginx

# Scale Deployment
kubectl scale deployment nginx --replicas=5

# Service erstellen
kubectl expose deployment nginx --type=NodePort --port=80

# Netzwerk-Plugins anzeigen (Cluster-spezifisch)
kubectl get pods -n kube-system
```

---

### 10. **Merke für Prüfung**
- **ReplicaSet** ≠ **DaemonSet**  
- **StatefulSet** für persistente Daten  
- **CNI** ist der Standard für Netzwerke, nicht „Overlay“  
- **Ingress** = HTTP/S Routing, **Service** = stabile IP im Cluster  
- Kubernetes definiert **Netzwerkmodell**, nicht die konkrete Implementierung
