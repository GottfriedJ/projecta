FROM jenkins/jenkins:lts-jdk17
# if we want to install via apt
USER root
ARG DOCKER_HOST_GID=666
#grep daemon /etc/group
#daemon:*:1:root
#_darwindaemon:*:284:_darwindaemon
RUN apt-get update && apt-get install -y maven && \
    apt-get install -y docker.io && \
    if getent group docker; then groupdel docker; fi && \
        groupadd -g ${DOCKER_HOST_GID} docker && \
        usermod -aG docker jenkins

# Die GID der 'daemon'-Gruppe auf Ihrem macOS Host (meistens 1)
# Ersetzen Sie '$' durch die tatsächliche GID, die Sie mit 'grep daemon /etc/group' gefunden haben.

# drop back to the regular jenkins user - good practice
USER jenkins
