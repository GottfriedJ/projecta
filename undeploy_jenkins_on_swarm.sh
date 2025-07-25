#!/bin/bash

STACK_NAME=jenkins_stack
NETWORK_NAME=jenkins_net

echo "🛑 Stoppe und entferne Stack: $STACK_NAME"

docker stack rm "$STACK_NAME"

echo "⏳ Warte, bis alle Services beendet sind..."
sleep 10

echo "🧹 Entferne Overlay-Netzwerk: $NETWORK_NAME"

# Prüfe, ob Netzwerk existiert
if docker network ls --filter name=^${NETWORK_NAME}$ --format "{{.Name}}" | grep -q "^${NETWORK_NAME}$"; then
  docker network rm "$NETWORK_NAME" && echo "✅ Netzwerk entfernt." || echo "⚠️ Netzwerk konnte nicht entfernt werden (Container könnten noch verbunden sein)."
else
  echo "ℹ️ Netzwerk $NETWORK_NAME existiert nicht."
fi

echo "✅ Deployment gestoppt."
