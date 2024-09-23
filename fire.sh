#!/bin/bash

compose_command=$1
detached_compose=$2

${compose_command:="up"}
${detached_compose:=""}

echo "--------------------------------$compose_command docker compose---------------------------------" && \
(docker compose -f ./docker/compose.yml $compose_command $detached_compose )
