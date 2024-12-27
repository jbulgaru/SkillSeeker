#!/bin/bash

compose_command=$1
detach_terminal_flag=$2

${compose_command:="up"}
${detached_compose:=""}

echo "--------------------------------$compose_command docker compose---------------------------------" && \
(docker compose -f ./docker/compose.yml $compose_command $detach_terminal_flag )
