# Spring Data REST Project

This project, `springdatarest`, is a demonstration of how to use [Spring Data REST](https://spring.io/projects/spring-data-rest) to expose your Spring Data repositories directly as RESTful endpoints. It showcases the simplicity and power of Spring Data REST in creating a RESTful API with minimal boilerplate code.

## Features

- **Spring Data REST**: Automatically exposes Spring Data repositories as RESTful resources.
- **Spring Boot**: Simplifies the setup and development of Spring applications.
- **Spring Data JPA**: Provides an abstraction over JPA to simplify database access.
- **HATEOAS**: Incorporates HATEOAS principles to make the API more discoverable and easier to use.
- **H2 Database**: In memory database to persist data.

## Getting Started

### Cloning the Repository

git clone https://github.com/prmacedoandrade/springdatarest.git 

### Running the Application

To run the application, execute the following Maven command on application directory:

mvn spring-boot:run

This will start the application on the default port 8080.

### Accessing the API

Once the application is running, you can access the API endpoints at:

- `http://localhost:8080/api`

The API will expose all the Spring Data repositories as RESTful resources. You can perform CRUD operations on these resources using standard HTTP methods (GET, POST, PUT, DELETE).

### Exploring the API

Spring Data REST automatically generates a HAL-based API, which means you can navigate the API using hypermedia links. For example, to access the list of clients, you can send a GET request to `http://localhost:8080/api/clients`.

## Contact

For any questions or suggestions, please open an issue on GitHub.

---

This README provides a basic overview of the `springdatarest` project. For more detailed information, please refer to the project's documentation and source code.


