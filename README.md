# 🧑‍💼 Recruitment Agency Web Application

A **Spring Boot**-based recruitement agency web application that allows job seekers to browse and apply for jobs while enabling recruiters to manage job postings.  
The application uses **Thymeleaf** for server-side rendering, **Spring Data JPA** with **Hibernate** for database access, and **Spring Security** for authentication & authorization.  
Deployed to **AWS Elastic Beanstalk** with **AWS RDS (MySQL)** for persistence and **AWS Systems Manager Parameter Store** for secure configuration.

---


## 📌 Features
- 👤 **User Roles**: Job Seeker and Recruiter, each with role-specific access.
- 📝 **Job Management**: Recruiters can create, update, and delete job postings.
- 🔍 **Job Search**: Job seekers can browse and filter available jobs.
- 📄 **Applications**: Apply for jobs with form validation.
- 🔒 **Authentication & Authorization** with **Spring Security** (role-based access control).
- 🗄 **Database Persistence** with **Spring Data JPA** & **Hibernate** (AWS RDS MySQL).
- 🎨 **Responsive UI** built with Thymeleaf, Bootstrap, jQuery, and Font Awesome.
- ☁ **AWS Deployment**: Backend on **Elastic Beanstalk**, database on **AWS RDS**, secrets in **AWS Systems Manager Parameter Store**.

---

## 🛠 Tech Stack
**Backend:**
- Java 21
- Spring Boot 3.5.4
- Spring Data JPA & Hibernate
- Spring Security
- Spring MVC & Validation
- MySQL (AWS RDS)

**Frontend:**
- Thymeleaf
- Bootstrap 5.3.2 (WebJars)
- jQuery 3.7.1
- Font Awesome 6.5.1

**DevOps & Cloud:**
- AWS Elastic Beanstalk
- AWS RDS (MySQL)
- AWS Systems Manager Parameter Store
- Maven
- Git

---

## 📦 Installation & Setup

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/recruiter-web-app.git
cd recruiter-web-app
````

### 2️⃣ Configure the database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=YOUR_DB_USER
spring.datasource.password=YOUR_DB_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

If using AWS Systems Manager Parameter Store, configure:

```properties
spring.config.import=aws-parameterstore:/jobportal/
```

### 3️⃣ Build & run locally

```bash
mvn clean install
mvn spring-boot:run
```

Access the app at: [http://localhost:8080](http://localhost:8080)

---

## ☁ AWS Deployment

1. **Package the app**:

```bash
mvn clean package
```

2. **Deploy to AWS Elastic Beanstalk**:

   * Create an EB Java 17 environment.
   * Upload the generated `target/jobportal-3.0.0-SNAPSHOT.jar`.
3. **Configure RDS & Parameter Store** in AWS.
4. **Update Security Groups** to allow traffic to the EB environment.

---

## 📸 Screenshots
<img alt="landing-page" src="./img.ra1_sm.png" />
<img alt="jobs" src="./img.ra2_sm.png" />
<img alt="candidate-page" src="./img.ra3_sm.png" />
<img alt="recruiter-page" src="./img.ra4_sm.png" />



---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss the change.

---

## 📜 License

This project is licensed under the MIT License.

---
