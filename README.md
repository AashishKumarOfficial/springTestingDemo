# 🧪 Spring Testing Demo

A simple **Spring Boot testing project** created to learn and practice unit testing, Mockito, Spring MVC testing, and repository testing.

The project demonstrates how to write maintainable automated tests for different layers of a Spring Boot application.

---

## 🚀 Tech Stack

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **JUnit 5**
* **Mockito**
* **MockMvc**
* **H2 Database**
* **MySQL**
* **Maven**

---

## 🧪 Testing Concepts Covered

### JUnit 5

* JUnit 5 fundamentals
* Assertions
* `assertEquals()`
* `assertThrows()`
* `@Test`
* `@BeforeEach`
* `@AfterEach`

### Mockito

* Mocking and test doubles
* `@Mock`
* `@InjectMocks`
* `@MockitoBean`
* `MockitoExtension`
* Stubbing with `when()` and `thenReturn()`
* Verifying interactions with `verify()`

### Spring MVC Testing

* `MockMvc`
* `@WebMvcTest`
* GET endpoint testing
* POST endpoint testing
* JSON response validation
* `jsonPath()`
* HTTP status validation
* Content-type validation

### Repository Testing

* `@DataJpaTest`
* H2 in-memory database
* Testing Spring Data JPA repositories

### Testing Approaches

The project also covers:

* Manual vs automated testing
* Arrange–Act–Assert (AAA)
* Unit testing
* Slice testing
* Integration testing
* Testing Pyramid

---

## 📂 Project Structure

```text
springTestingDemo
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.springTestingDemo
│   │   │       ├── controller
│   │   │       │   └── ProductController.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │   └── Product.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   └── ProductRepository.java
│   │   │       │
│   │   │       └── service
│   │   │           ├── PriceCalculator.java
│   │   │           └── ProductService.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── com.example.springTestingDemo
│               ├── controller
│               │   └── ProductControllerTest.java
│               │
│               └── service
│                   ├── PriceCalculatorTest.java
│                   └── ProductServiceTest.java
│
└── pom.xml
```

---

## 🔍 Example Testing Flow

The project demonstrates testing different application layers:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

Different testing tools are used depending on the layer:

```text
Service
   → JUnit + Mockito

Controller
   → @WebMvcTest + MockMvc + @MockitoBean

Repository
   → @DataJpaTest + H2

Integration
   → Spring Boot Test
```

---

## 📌 API Endpoints

### Get Product

```http
GET /api/product/{id}
```

Example:

```http
GET http://localhost:8080/api/product/1
```

### Create Product

```http
POST /api/product
```

Example request:

```json
{
  "name": "Laptop",
  "price": 50000,
  "stock": 10
}
```

---

## ▶️ Running the Project

Clone the repository:

```bash
git clone https://github.com/AashishKumarOfficial/springTestingDemo.git
```

Go into the project:

```bash
cd springTestingDemo
```

Run the application using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 🧪 Running Tests

Run all tests with:

```bash
mvn test
```

Or using Maven Wrapper:

### Windows

```bash
mvnw.cmd test
```

### Linux/macOS

```bash
./mvnw test
```

---

## 🎯 Learning Goals

This project was created to understand:

* How automated testing works in Spring Boot
* How to write unit tests with JUnit
* How Mockito isolates dependencies
* How to test service-layer business logic
* How to test REST controllers using MockMvc
* How to test JSON responses
* How to test repositories using an in-memory H2 database
* How different testing levels fit into the Testing Pyramid

---

## 📈 Future Improvements

* [ ] Add more controller tests
* [ ] Add POST validation tests
* [ ] Add `@WithMockUser` security tests
* [ ] Add `@SpringBootTest` integration tests
* [ ] Add Testcontainers
* [ ] Add JaCoCo test coverage
* [ ] Add CI/CD with GitHub Actions

---

## 👨‍💻 Author

**Aashish Kumar**

B.Tech Computer Science & Engineering

GitHub:
https://github.com/AashishKumarOfficial

---

⭐ If you find this project useful, feel free to explore the repository.
