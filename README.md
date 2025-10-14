
---

### 📄 `README.md`

```markdown
# 🛒 Kirana Shop - Spring Boot Mini Project

A small but complete **Spring Boot application** simulating a simple **Kirana (Grocery) Shop**, built for learning **OOP, Spring Boot architecture, and SQL relationships** in a clean and progressive way.

---

## ✅ Features

- Manage **Products**, **Categories**, and **Suppliers**
- Manage **Customers** and **Employees**
- Create **Orders** with multiple products (Many-to-Many)
- Assign **Employees** to Orders
- Calculate **total order price** automatically
- View all orders with customer and product details
- Product **active/inactive** status for soft deletes

---

## 🎓 What You’ll Learn

This project is designed to help you understand:

- ✅ Object-Oriented Programming (OOP) in real applications
- ✅ Entity relationships: `@OneToMany`, `@ManyToOne`, `@ManyToMany`
- ✅ Layered Architecture: Controller → Service → Repository
- ✅ Using DTOs to manage data flow
- ✅ Computed fields (e.g. total price)
- ✅ Business rules and validations
- ✅ How to scale a clean Spring Boot project

---

## 🧱 Tech Stack

| Layer         | Technology            |
|---------------|------------------------|
| Backend       | Java 17, Spring Boot   |
| Persistence   | Spring Data JPA        |
| Database      | H2 (in-memory)         |
| Build Tool    | Maven                  |
| Dev Tools     | Spring Boot DevTools   |
| Helpers       | Lombok, ModelMapper    |

---

## ⚙️ Project Structure

```

kirana-shop/
├── controller/      # REST API Controllers
├── service/         # Business Logic
├── repository/      # Data Access Layer
├── model/           # JPA Entities
├── dto/             # Request/Response DTOs
├── KiranaShopApplication.java
└── application.properties

````

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven

### Run the Application

```bash
git clone https://github.com/your-username/kirana-shop.git
cd kirana-shop
mvn spring-boot:run
````

### Access H2 Console

```
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
```

---

## 📬 API Endpoints (Examples)

### Order APIs

* `GET /orders` — List all orders
* `POST /orders` — Create new order

```json
{
  "customerId": 1,
  "employeeId": 2,
  "productIds": [1, 2, 3]
}
```

### Product APIs

* `POST /products`
* `GET /products`

### Customer & Employee APIs

* `POST /customers`
* `POST /employees`
* `GET /customers`, `GET /employees`

---

## 🔄 Future Improvements

* ✅ Add authentication (Spring Security)
* ✅ Add pagination and search
* ✅ Export orders/invoices (CSV or PDF)
* ✅ Inventory management
* ✅ Unit & integration tests

---

## 🙌 Aimed Audience

This project is ideal for:

* Java beginners learning **Spring Boot**
* Backend developers improving **OOP + SQL relationship skills**
* Interview prep and portfolio building

---

## 📄 License

This project is open-source and free to use under the [MIT License](LICENSE).

---

## ✍️ Author

**ManixGt!** Customize it, extend it, learn from it.
```
---
```
