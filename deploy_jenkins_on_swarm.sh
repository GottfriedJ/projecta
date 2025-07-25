#!/bin/bash

STACK_NAME=jenkins_stack
NETWORK_NAME=jenkins_net
COMPOSE_FILE=docker-compose-swarm_dind.yml

echo "🚀 Starte Deployment für Stack: $STACK_NAME"

# Prüfe, ob Swarm aktiv ist
if ! docker info | grep -q "Swarm: active"; then
  echo "🌀 Docker-Swarm ist nicht aktiv. Starte Swarm..."
  docker swarm init
else
  echo "✅ Docker-Swarm ist aktiv."
fi

# Prüfe, ob Overlay-Netzwerk existiert
if ! docker network ls --filter name=^${NETWORK_NAME}$ --format "{{.Name}}" | grep -q "^${NETWORK_NAME}$"; then
  echo "🌐 Erstelle Overlay-Netzwerk: $NETWORK_NAME"
  docker network create --driver overlay "$NETWORK_NAME"
else
  echo "🌐 Overlay-Netzwerk $NETWORK_NAME existiert bereits."
fi

# Stack deployen
echo "📦 Deploye Stack $STACK_NAME mit $COMPOSE_FILE"
docker stack deploy -c "$COMPOSE_FILE" "$STACK_NAME"
