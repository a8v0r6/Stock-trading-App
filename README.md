# Stock-trading-App

# 📈 Event-Driven Trading System

A real-time, cloud-native trading platform simulating core stock exchange functionalities using event-driven microservices architecture.

## 🔧 Tech Stack

- **Java 17**, **Spring Boot 3**
- **Apache Kafka** (for event streams)
- **Redis** (caching + pub/sub)
- **PostgreSQL** (RDS)
- **WebSockets** (live updates)
- **Docker** (microservice containerization)
- **AWS** (ECS Fargate, RDS, ElastiCache, CloudWatch)

## 📦 Microservices

| Service              | Description                                 |
|----------------------|---------------------------------------------|
| Order Matching       | Handles order book and matches trades       |
| Price Service        | Simulates real-time market price updates    |
| Portfolio Service    | Tracks user holdings, PnL, and history      |
| Risk Service         | Evaluates risk, triggers alerts             |
| API Gateway          | Single entrypoint; WebSocket/REST gateway   |

## 🚀 Architecture Overview


Currently working on the main Portfolio Service
