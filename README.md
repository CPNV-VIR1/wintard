# Spring - REST API

Wintard - Potatolly

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
├───assets
├───docs
├───ms-api-gateway
│   └───nginx
│       └───api_conf.d
├───ms-db
├───ms-delete
│   ├───.mvn
│   │   └───wrapper
│   └───src
│       ├───main
│       │   └───java
│       │       └───ch
│       │           └───cpnves
│       │               ├───potatotally
│       │               │   ├───Controllers
│       │               │   ├───Entities
│       │               │   └───Repositories
│       │               └───resources
│       └───test
│           └───java
│               └───ch
│                   └───cpnves
│                       └───potatotally
├───ms-get
│   ├───.mvn
│   │   └───wrapper
│   └───src
├───ms-post
│   ├───.mvn
│   │   └───wrapper
│   └───src
├───ms-put
│   ├───.mvn
│   │   └───wrapper
│   └───src      
└───target
    ├───classes
    │   └───ch
    │       └───cpnves
    │           └───potatotally
    │               ├───Controllers
    │               ├───Entities
    │               └───Repositories
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───surefire-reports
    └───test-classes
        └───ch
            └───cpnves
                └───payroll
```

## Collaborate

* [How to collaborate]
  * Ask to be added to the project on github
    * Clone the project
  * [How to commit](https://www.conventionalcommits.org/en/v1.0.0/)

And you are good to go.

## License

* [Choose the license adapted to your project](https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository).

## Contact

* Contact at noah.delgado1(at)eduvaud.ch or benjamin.fontana(at)eudvaud.ch
