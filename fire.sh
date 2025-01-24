#!/bin/bash

compose_command=$1
detach_terminal_flag=$2

${compose_command:="up"}
${detached_compose:=""}

if [ ! -s docker/.env ]; then
  echo  ".env file does not exist"
  cp docker/.env.example docker/.env
  echo ".env file created!"
fi
echo "--------------------------------$compose_command docker compose---------------------------------" && \
(docker compose -f ./docker/compose.yml $compose_command $detach_terminal_flag )
