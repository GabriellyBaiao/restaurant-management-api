# 🍽️ Restaurant Management API

<p align="center">
  API REST para gerenciamento compartilhado de restaurantes.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?logo=openjdk" alt="Java 21">
  <img src="https://img.shields.io/badge/Spring%20Boot-Backend-brightgreen?logo=springboot" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow" alt="Em desenvolvimento">
</p>

---

## 📌 Sobre o projeto

A **Restaurant Management API** é uma aplicação backend desenvolvida para oferecer uma solução centralizada de gerenciamento compartilhado de restaurantes.

O sistema tem como objetivo permitir o gerenciamento de usuários, contemplando dois perfis principais:

- **Clientes:** usuários que poderão utilizar os serviços disponibilizados pela plataforma.
- **Proprietários de restaurantes:** usuários responsáveis pela gestão de seus estabelecimentos.

O projeto faz parte do **Tech Challenge – Fase 1**, da pós-graduação em Arquitetura e Desenvolvimento Java da FIAP, integrando os conhecimentos adquiridos durante a formação.

---

## 📚 Índice

- [Sobre o projeto](#-sobre-o-projeto)
- [Objetivo](#-objetivo)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias utilizadas](#-tecnologias-utilizadas)
- [Requisitos](#-requisitos)
- [Instalação](#-instalação)
- [Como executar](#-como-executar)
- [Documentação da API](#-documentação-da-api)
- [Testes com Postman](#-testes-com-postman)
- [Estrutura do projeto](#-estrutura-do-projeto)
- [Autores](#-autores)

---

## 🎯 Objetivo

Desenvolver um backend robusto utilizando **Java e Spring Boot**, aplicando boas práticas de desenvolvimento, orientação a objetos e organização de código.

A aplicação busca centralizar operações de gerenciamento de usuários em uma plataforma compartilhada entre diferentes restaurantes.

## ⚙️ Funcionalidades

- Cadastro de usuários.
- Atualização de dados cadastrais.
- Exclusão de usuários.
- Consulta de usuários.
- Busca de usuários pelo nome.
- Validação de login.
- Alteração de senha em endpoint específico.
- Diferenciação entre clientes e proprietários de restaurantes.

## 🛠️ Tecnologias utilizadas

As principais tecnologias e ferramentas utilizadas no desenvolvimento são:

- Java
- Spring Boot
- Maven
- MySQL
- Docker
- Docker Compose
- Swagger / OpenAPI
- Postman
- Git e GitHub

## 📋 Requisitos

Para executar o projeto, é necessário possuir:

- Java 21 ou versão compatível com o projeto.
- Maven.
- Docker.
- Docker Compose.
- Git.
- Postman (opcional, para testes).

## 🚀 Instalação

**1. Clone o repositório:**

```bash
git clone https://github.com/GabriellyBaiao/restaurant-management-api.git
```

**2. Acesse a pasta do projeto:**

```bash
cd restaurant-management-api
```

**3. Configure as variáveis de ambiente:**

Utilize o arquivo `.env.example` como referência para criar seu arquivo `.env`.

## ▶️ Como executar

Com o Docker em execução, utilize o comando:

```bash
docker compose up --build
```

Para executar os containers em segundo plano:

```bash
docker compose up --build -d
```

Para verificar os containers:

```bash
docker compose ps
```

Para encerrar a aplicação:

```bash
docker compose down
```

## 📖 Documentação da API

A documentação dos endpoints será disponibilizada por meio do Swagger/OpenAPI.

Após iniciar a aplicação, acesse:

```text
http://localhost:8080/swagger-ui/index.html
```

## 🧪 Testes com Postman

A API poderá ser testada utilizando o Postman.

A coleção de requisições ficará disponível na pasta `postman/` do projeto.

Os testes contemplarão os principais cenários:

- Cadastro de usuário.
- Validação de dados obrigatórios.
- Verificação de e-mail duplicado.
- Atualização de informações.
- Alteração de senha.
- Busca de usuários pelo nome.
- Validação de login.
- Tratamento de erros HTTP.

## 📁 Estrutura do projeto

```text
restaurant-management-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│
├── postman/
├── docs/
│
├── Dockerfile
├── docker-compose.yml
├── .env.example
├── .gitignore
├── pom.xml
└── README.md
```

## 👩‍💻 Autores

Desenvolvido como parte do **Tech Challenge – Fase 1 | FIAP**.

- Adriano
- Denize
- Gabrielly Baiao
- Guilherme Marcionilio
- Matheus Silva

---

<p align="center">
  Desenvolvido com ☕ e dedicação.
</p>
