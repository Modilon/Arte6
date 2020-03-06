# Manual do Dev

Para rodar o projeto localmente precisamos realizar a instalação do docker que encontramos dentro deste link: [Instalação do Docker
](https://www.vultr.com/docs/installing-docker-ce-on-ubuntu-16-04).
Após instalar o Docker será necessário baixar duas imagens, a do PostgreSQL e a do SonarQube.

## Instalando o Postgre no Docker

Atualizando os pacotes, baixando a imagem do postgre, criando um diretorio para armazenar os dados do seu postgre e rodando um container do docker com a instancia do Postgre na porta 5432.

 1. sudo apt-get install
 2. docker pull postgres
 3. mkdir -p $HOME/docker/volumes/postgres
 4. docker run --rm --name postgresql -e POSTGRES_PASSWORD=1234 -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql/data postgres

Após realizar os seguintes comandos o Postgres estará rodando na porta 5432, com o nome de Postgresql e senha 1234.

## Instalação do SonarQube

Não lembro
