# SPRING-BOOT-FULL-STACK-WEB-APPLICATION-DEMO

A small, opinionated Spring Boot full‑stack demo I built while learning how Spring works end‑to‑end. I put this together to understand how a backend fetches data from a SQL database, processes it, and serves it to a simple UI built with HTML, CSS and JavaScript. I also used this project to teach a friend the basics of a Spring Boot full‑stack app — so the code and structure are intentionally straightforward and easy to follow.

---

## What this project is

- Minimal full‑stack example: Spring Boot backend, SQL database, plain HTML/CSS/JS frontend.
- Focused on clarity over completeness so new learners can see the data flow: database → repository/service → controller → frontend.
- Great as a starting point to experiment or to demonstrate Spring concepts in a classroom or one‑on‑one session.

## Why it exists

I created this repository while learning Spring Boot and later used it to teach a friend how a small full‑stack app works. The goal is a readable, practical reference you can clone, run, and extend to learn how the pieces fit together.

## Features

- Simple CRUD/read endpoints that demonstrate controller → service → repository flow
- Uses a SQL database (H2 for demos or any JDBC RDBMS)
- Lightweight frontend using HTML, CSS and JavaScript to fetch and display data
- Easy to read project layout and minimal dependencies

## Tech stack

- Java 11+ (compatible with later versions)
- Spring Boot (Spring MVC + Spring Data / JDBC)
- H2 (in-memory) or any JDBC-compatible DB (MySQL / PostgreSQL)
- HTML, CSS, JavaScript for frontend
- Maven build

## Getting started

Prerequisites
- Java 11 or newer
- Maven (or use the included Maven wrapper)
- Optional: MySQL/Postgres if you prefer a persistent DB

Clone the repository:
```bash
git clone https://github.com/ASWIN-SENTHILKUMAR2006/SPRING-BOOT-FULL-STACK-WEB-APPLICATION-DEMO.git
cd SPRING-BOOT-FULL-STACK-WEB-APPLICATION-DEMO
```

Run with the Maven wrapper (recommended if present):
```bash
./mvnw spring-boot:run
```
Or with your local Maven:
```bash
mvn spring-boot:run
```
Or build and run the jar:
```bash
mvn clean package
java -jar target/*.jar
```

Open the app:
- Visit http://localhost:8080 (or the port set in application.properties)

## Configuration examples

H2 (in-memory) — quick demo (src/main/resources/application.properties):
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
```

MySQL example:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC
spring.datasource.username=myuser
spring.datasource.password=mypassword
spring.jpa.hibernate.ddl-auto=update
```

Adjust `spring.jpa.hibernate.ddl-auto` for development vs production (e.g. `update` for convenience while developing).

## Sample data (optional)

If you want to seed the database for testing, add a SQL file under `src/main/resources/data.sql` (Spring Boot will execute it on startup with default settings). Example:
```sql
INSERT INTO items (id, name, description) VALUES (1, 'Example', 'Seed data used in demos');
```

## Project layout (quick tour)

- src/main/java — controllers, services, repositories, entities
- src/main/resources — application.properties / static / templates
- src/main/resources/static — simple HTML/CSS/JS for frontend (if used)
- src/main/resources/templates — server-side templates (if used)

Follow the controller → service → repository flow to trace how requests are handled and how data is fetched and returned to the UI.

## How I used it to teach

I walked a friend through the code structure using small edits:
- Change a repository or seed record, restart the app, and see the UI update.
- Add a simple endpoint and connect it from the frontend to demonstrate full‑stack flow.
This repository is intentionally compact so learners can make visible changes quickly.

## Contributing

This repo is meant for learning. If you add improvements, keep them small and documented so the project remains easy to understand. Feel free to:
- Add example endpoints or frontend pages
- Add more seed data or sample tests
- Improve README instructions to match your environment

If you'd like to contribute: fork → branch → PR with a clear description.

## License

Use freely for learning and teaching. Add an explicit license file (MIT/Apache-2.0) if you want to clarify reuse terms.

---

If you want, I can:
- Tailor this README to include exact commands for your build (Maven/Gradle) and Java version.
- Add a ready-to-use `data.sql` seed file or example `application.properties` tuned for your project.
- Provide a commit-ready README file and show the exact git commands to add it to the repository.

How would you like me to proceed?
