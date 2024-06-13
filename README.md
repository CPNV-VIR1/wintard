# Spring - REST API

Wintard - Potatotally

## Description

Dockerized Rest API

## Getting Started

### Prerequisites

List all dependencies and their version needed by the project as :

* Docker engine 20.10.7
* Java 17
* Maven 3.8.2

### Configuration

* Copy the `.env.example` file to `.env` and set the environment variables

## Deployment

First time running the container

```bash
docker compose up --build -d
```

Running the container

```bash
docker compose up -d
```

How to destroy containers

```shell
docker compose down -v --rmi local
```

How to access

```shell
http://localhost:8080
```

## Directory structure

* Tip: try the tree bash command

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

| Type  | Naming convention | Example              |
| ----- | ----------------- | -------------------- |
| Class | PascalCase        | `LoginPage.java`     |
| Tests | PascalCase        | `LoginPageTest.java` |

## License

* [MIT](LICENSE)

## Contact

### Noah Delgado

* [Email](mailto:noah.delgado1@eduvaud.ch)

### Benjamin FONTANA

* [Email](mailto:benjamin.fontana@eduvaud.ch)

[Commit-url]: https://www.conventionalcommits.org/
