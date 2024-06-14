<div align="center">

<h3 align="center">Potatotally</h3>

  <p align="center">
    Dockerized Java Rest API powered by Wintard
    <br />
    <a href="https://github.com/CPNV-VIR1/wintard/wiki"><strong>Explore the docs »</strong></a>
    <br />
  </p>
</div>

## Built With

[![Docker][docker.com]][docker-url]
[![Maven][maven.com]][maven-url]
[![Spring][spring.com]][spring-url]
[![nginx][nginx.com]][nginx-url]
[![VSC][vsc.com]][vsc-url]
[![postgresql][postgresql.com]][postgresql-url]
[![H2][h2.com]][h2-url]

## Getting Started

### Prerequisites

#### Deployment

* Docker engine 20.10.7

#### Development

* Docker engine 20.10.7

##### Local development

If you wish to run the project locally whilst not running docker, you will need the following tools:

* Java 17
* Maven 3.8.2

### Installation, configuration

* Copy the `.env.example` file to `.env` and set the environment variables

1. Clone the repo

   ```shell
   git clone https://github.com/CPNV-VIR1/wintard
   ```

2. Copy the `.env.example` file to `.env` and set the environment variables

   ```shell
   cp .env.example .env
   ```

3. Set the environment variables

   ```shell
   nano .env
   ```

## Deployment

### On dev environment

To deploy the project locally, you have to follow the [installation steps](#installation-configuration) below.

Once ready, you can run the following command to build the project.

```bash
docker compose up --build -d
```

> The `--build` flag is used to build the images before running the containers. This is useful when you have made changes to the code.
> 
> The `-d` flag is used to run the containers in the background.

Once the containers are built once, you can run the following command to start the containers again. No need to build the images again.

```bash
docker compose up -d
```

If you wish to stop the containers, you can run the following command.

```bash
docker compose down
```

If you wish to stop the containers and remove the volumes and images, you can run the following command.

```shell
docker compose down -v --rmi local
```

Once the containers are running, you can access the project on the following URL:

```shell
http://localhost:8080
```

### On production environment

To deploy the project on a production environment, you have to follow the installation steps below. If you wish to use the host machine's shell environment variables, you can skip the `.env` file creation.

1. Connect to the reverse proxy server and create a ssh tunnel

   ```shell
   ssh user@server -i ./path/to/ssh_key -L 2222:remote_host:22
   ```

2. Connect to the remote host through the ssh tunnel

   ```shell
   ssh user@localhost -p 2222 -i ./path/to/ssh_key
   ```

3. Follow the [installation steps](#installation-configuration) above

4. Now you can build the containers on the remote host

   ```shell
   docker compose up --build -d
   ```

5. Once the containers are running, you can access the project on the following URL:

   ```shell
   https://remote_host
   ```

> Because the reverse proxy server is used, the project is accessible on the remote host's IP address/FQDN and redirects the traffic to the api gateway microservice.

## Directory structure

```shell
.
├── assets
│   ├── Proj3.drawio
│   └── Proj3.png
├── docs
│   └── useCaseDiagram.wsd
├── ms-api-gateway
│   ├── Dockerfile
│   └── nginx
│       ├── api_backends.conf
│       ├── api_conf.d
│       │   └── potatoes_api.conf
│       ├── api_gateway.conf
│       └── nginx.conf
├── ms-db
│   └── Dockerfile
├── ms-delete
│   ├── .mvn
│   │   └── wrapper
│   │       ├── maven-wrapper.jar
│   │       └── maven-wrapper.properties
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   └── java
│       │       └── ch
│       │           └── cpnves
│       │               ├── potatotally
│       │               │   ├── Controllers
│       │               │   │   ├── PotatoController.java
│       │               │   │   ├── PotatoNotFoundAdvice.java
│       │               │   │   └── PotatoNotFoundException.java
│       │               │   ├── Entities
│       │               │   │   └── Potato.java
│       │               │   ├── PotatotallyApplication.java
│       │               │   └── Repositories
│       │               │       ├── LoadDatabase.java
│       │               │       └── PotatoRepository.java
│       │               └── resources
│       │                   └── application.properties
│       └── test
│           └── java
│               └── ch
│                   └── cpnves
│                       └── potatotally
│                           └── PotatotallyApplicationTests.java
├── ms-get
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── ...
├── ms-post
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── ...
├── ms-put
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── ...
├── compose.yaml
├── .dockerignore
├── .env.example
├── .gitignore
└── README.md

```

## Collaborate

### Convention

#### Commit

The project uses [Conventional Commits][Commit-url]. The keywords used are: `feat`, `fix`, `chore`, `refactor`, `test`, `docs`. The commits are named with the following pattern: `type: description` eg.(feat: add login page).

#### file naming

The project uses the following file naming convention.

| Type    | Naming convention | Example                           |
| ------- | ----------------- | --------------------------------- |
| Class   | PascalCase        | `Potato.java`                     |
| Tests   | PascalCase        | `PotatottalyApplicationTest.java` |
| Compose | kebab-case        | `compose.yaml`                    |

## License

Distributed under the MIT License. See [LICENSE](LICENSE.txt) for more information.

## Contact

| Name             | Email                                                              |
| ---------------- | ------------------------------------------------------------------ |
| Noah Delgado     | [mailto:noah.delgado1@eduvaud.ch](mailto:noah.delgado1@eduvaud.ch) |
| Benjamin FONTANA | [benjamin.fontana@eduvaud.ch](mailto:benjamin.fontana@eduvaud.ch)  |

[Commit-url]: https://www.conventionalcommits.org/
[docker.com]: https://img.shields.io/badge/Docker-0db7ed?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://www.docker.com/
[maven.com]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white
[maven-url]: https://maven.apache.org/
[spring.com]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[spring-url]: https://spring.io/
[nginx.com]: https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white
[nginx-url]: https://www.nginx.com/
[vsc.com]: https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white
[vsc-url]: https://code.visualstudio.com/
[postgresql.com]: https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white
[postgresql-url]: https://www.postgresql.org/
[h2.com]: https://img.shields.io/badge/H2-87B3E0?style=for-the-badge&logo=h2&logoColor=white
[h2-url]: https://www.h2database.com/html/main.html
