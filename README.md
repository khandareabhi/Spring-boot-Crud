# 🚀 CRUD REST API – Spring Boot | Postman | Swagger

A **real-world CRUD (Create, Read, Update, Delete) REST API** built using **Spring Boot**, tested with **Postman**, and documented using **Swagger (OpenAPI)**.  
This project demonstrates **backend API development best practices** used in real software companies.

---

## 📌 Project Overview

This application provides REST APIs to manage **Student data**, allowing users to:

- Add new students
- View all students
- View a student by ID
- Update student details
- Delete students

All APIs are:
- Tested using **Postman**
- Documented using **Swagger UI**

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---------|--------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST API Development |
| Spring Data JPA | Database Interaction |
| MySQL / H2 | Database |
| Lombok | Boilerplate Code Reduction |
| Swagger (Springdoc OpenAPI) | API Documentation |
| Postman | API Testing Tool |
| Maven | Dependency Management |

---

## 📂 Project Structure

src/main/java
└── com.example.demo

├── controller

│ └── StudentController.java

├── service
│ └── StudentService.java

├── repository
│ └── StudentRepository.java

├── model
│ └── Student.java
└── DemoApplication.java


---

## 📑 API Endpoints

| HTTP Method | Endpoint | Description |
|-----------|---------|-------------|
| POST | `/api/students` | Create a new student |
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

---

## 📤 Sample Request (POST)

```json
{
  "name": "Abhishek",
  "email": "abhishek@gmail.com",
  "course": "Java Full Stack"
}
esting with Postman

Open Postman

Use the following base URL:

http://localhost:8080/api/students


Test all CRUD operations using:

POST

GET

PUT

DELETE

✔ Ensures API correctness
✔ Used by QA & Backend Developers

📘 Swagger API Documentation

After running the application, open:

http://localhost:8080/swagger-ui.html


or

http://localhost:8080/swagger-ui/index.html

Swagger Features:

Auto-generated API documentation

Try APIs directly from browser

Used by frontend developers for integration

▶️ How to Run the Project
Step 1: Clone the Repository
git clone https://github.com/your-username/crud-springboot-api.git

Step 2: Open in IDE

IntelliJ IDEA / Eclipse / VS Code

Step 3: Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


(You can also use H2 for testing)

Step 4: Run the Application
mvn spring-boot:run

🏢 Real-World Use Case

Backend API development

Frontend integration support

QA testing with Postman

API documentation using Swagger

Resume & interview-ready project

🚀 Future Enhancements

Input validation using @Valid

Global exception handling

Pagination & sorting

Authentication with JWT

Role-based access control

Frontend integration (React / Angular)

👨‍💻 Author

Abhishek Khandare
🎓 BBA-CA | Aspiring Full Stack Java Developer
💡 Interested in Backend, APIs, Spring Boot & Microservices

⭐ If you like this project

Give it a ⭐ on GitHub and feel free to fork & enhance it!


---

## ✅ What You Should Do Now

1. Create a file named **`README.md`**
2. Paste the above content
3. Push to GitHub
4. Use this project in:
   - Resume
   - Hackathons
   - Internship interviews

---

### 🔥 Next I Can Help You With:
- Postman **collection export**
- Swagger **annotations**
- **JWT authentication**
- Convert this to **Microservices**
- Interview questions based on this project

Just tell me 👉 **what’s next** 🚀
  
