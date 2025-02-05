# This is a simple game based in a REST API ✨

### I wanted to improve my Spring Boot abilities, so I made this project 💻

---

## How to run it? 🤔

- clone this repository and enter the directory:

```bash
git clone https://github.com/Gustanol/financialGame.git && cd financialGame
```

- Make sure you have Maven installed.
- After this, you can run the following commands:

```bash
mvn clean install # Only first time
mvn spring-boot:run # Every time you want to run it
```

- [Version 1.0:](https://github.com/Gustanol/financialGame/tree/v1.0)
  - access [http://localhost:8080/users](http://localhost:8080/users) to view all users.
  - filter which user will appear by writing its ID after "***/users/***". Example: `/users/2`
  - you can filter also by user name, using a ***Query Parameter***. Example: `/users?name=John`
  - Add new users by using ***POST*** HTTP method at `http://localhost:8080/users/create/{USERNAME}`
  - lend money from a user to another also using POST method. Example: `http://localhost:8080/money/lend?amount=350&fromUser=John&toUser=Anna`

### That's it 😊
