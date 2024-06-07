# Spring Boot Kafka Reactive Project

This is a sample Spring Boot project that demonstrates the integration of Kafka with a Spring Reactive application. The project showcases key concepts related to Kafka, including topics, partitions, serialization, consumer groups, and offset management.

## Table of Contents

- [Requirements](#requirements)
- [Getting Started](#getting-started)
    - [Running Kafka](#running-kafka)

## Requirements

- Java 17 or later
- Apache Kafka (for running locally)
- Maven (or use the included `./mvnw` script)

## Getting Started

### Running Kafka

Ensure that Kafka is installed and running locally. You can download Kafka from the [official Apache Kafka website](https://kafka.apache.org/).

Start a ZooKeeper server (required by Kafka):

```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Start a Kafka broker:
```bash
bin/kafka-server-start.sh config/server.properties
```