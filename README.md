# CSE-360-Project

A secure identity management and help system application built with JavaFX and MongoDB.

## Technologies Used
- Java 17
- JavaFX
- MongoDB Atlas
- Maven
- BCrypt for password hashing
- JUnit 5 for testing

## Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/identityhelp/
│   │       ├── App.java
│   │       ├── config/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── util/
│   └── resources/
│       ├── fxml/
│       ├── css/
│       └── application.properties
└── test/
    └── java/
        └── com/identityhelp/
```

## Setup Instructions
1. Clone the repository
2. Configure MongoDB Atlas connection string in `application.properties`
3. Build the project: `mvn clean install`
4. Run the application: `mvn javafx:run`

## Development Guidelines
1. Branch naming convention:
   - Feature branches: `feature/description`
   - Bug fixes: `bugfix/description`
   - Releases: `release/version`

2. Always create pull requests for merging into `develop`
3. Use meaningful commit messages following conventional commits

## Contributing
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## Running Tests
```bash
mvn test
```
