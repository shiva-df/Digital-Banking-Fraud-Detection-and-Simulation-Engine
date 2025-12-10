Digital Banking Fraud Detection and Simulation Engine
-----------------------------------------------------
This project is a comprehensive system designed to simulate, detect, and analyze fraudulent activities in digital banking environments. It aims to replicate realistic transaction patterns, generate synthetic fraud scenarios, and apply intelligent detection mechanisms to identify anomalies.

The current repository contains the Transaction Application module, developed using Java, Spring Boot, and MySQL. Additional modules will be added as the project expands.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Project Overview

Modern digital banking faces evolving fraud threats. This engine provides an end-to-end structure for:

• Simulating high-volume transactions
• Introducing realistic fraud patterns
• Detecting suspicious behavior using rules and machine learning
• Offering APIs for monitoring and analysis

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

System Modules (Current and Planned)

1. Transaction Simulation Engine:
Generates synthetic banking transactions representing both normal activity and fraudulent behavior. Supports randomness and various configurable fraud scenarios.

2. Anomaly Detection Core:
Applies rule-based checks such as velocity anomalies, location mismatches, suspicious device usage, and sudden transaction spikes. Also allows the integration of future machine learning models.

3. Monitoring and Dashboard Layer (planned):
Displays fraud alerts, risk scores, user behavior, and transaction trends in real time.

4. Transaction API Gateway:
Provides REST endpoints for sending, generating, and retrieving transactions.
This is the currently implemented module.

5. Machine Learning Plug-in Layer (planned):
Enables machine learning models to be loaded, tested, and used to assign anomaly scores. Allows comparison between rule-based and ML-driven detection.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Current Module Implemented: Transaction Application

The active module handles storing, generating, and retrieving transactions.

Tech Stack:
Java (JDK 17 or 21)
Spring Boot
MySQL
Maven
JSON request and response structure

Completed Features:
Ability to save transactions
Automatic random transaction generation
Retrieval of transaction history
Clean MVC-style backend architecture

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Project Folder Structure:

src
main
java
org.example
Application.java
controller
TransactionController.java
service
TransactionService.java
SimpleTransactionGenerator.java
model
Transaction.java
resources
application.properties
schema.sql

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

REST API Endpoints

1. Generate Random Transaction:
POST /api/transactions/generate
Creates and stores a randomized synthetic transaction.

2. Save a Custom Transaction:
POST /api/transactions/save
Accepts a transaction in JSON format.

3. Fetch All Transactions:
GET /api/transactions/all
Returns every transaction stored in the system.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

High-Level Architecture:

External Clients (Applications, Postman, Third-party Systems)
connect to
Transaction Controller (REST Endpoints)
connects to
Transaction Service (Business Logic Layer)
connects to
MySQL Database (Transactions Table)

Future modules will integrate simulation, detection, dashboards, and machine learning tools.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Future Enhancements:

• Machine learning-based anomaly scoring
• Real-time transaction pipelines using streaming technologies
• Geo-location and device behavior profiling
• Advanced graphical dashboards
• Expanded rule engine
• Integration with banking or corporate platforms
















