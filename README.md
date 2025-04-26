# SpringKafkaMongo

[![Java](https://img.shields.io/badge/Java-24-blue.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Kafka](https://img.shields.io/badge/Kafka-3.x-000000.svg)](https://kafka.apache.org/)
[![MongoDB](https://img.shields.io/badge/MongoDB-6.x-green.svg)](https://www.mongodb.com/)
[![Docker](https://img.shields.io/badge/Docker-Compose-blue.svg)](https://docs.docker.com/compose/)

Projeto de estudos entre a integração **Kafka** e **MongoDB**, usando **Spring Boot**.

## Rodando o projeto

```bash
git clone https://github.com/mateusdnc/SpringKafkaMongo.git
cd SpringKafkaMongo
docker-compose up
./mvnw spring-boot:run
```

## Funcionalidades

- Produz e consome mensagens Kafka.
- Persiste dados no MongoDB.
- API REST para envio de mensagens.

## Exemplo de uso da API

**Endpoint:** `POST /message`

**Request Body:**
```json
{
  "content": "Mensagem de exemplo para Kafka e MongoDB!"
}
```

**Curl exemplo:**
```bash
curl -X POST http://localhost:8080/message \
  -H "Content-Type: application/json" \
  -d '{"content":"Mensagem de exemplo para Kafka e MongoDB!"}'
```

## Estrutura

- `config/` – Configurações de Kafka/MongoDB.
- `controller/` – Endpoints REST.
- `listener/` – Consumidor Kafka.
- `model/` – Entidades.
- `service/` – Lógica de negócios.
