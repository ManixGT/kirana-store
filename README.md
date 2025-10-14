
```markdown
# 🛒 Kirana Store - Spring Boot Backend

A complete grocery store management system built with Spring Boot and PostgreSQL, designed to help Java developers grow from basic to intermediate level.

---

## ✅ Features

### 🔸 Core Features
- Manage **Products** with categories and suppliers
- Manage **Customers** and **Employees**
- Create **Orders** with multiple products
- View **Orders** with calculated totals

### 🔹 Advanced Features
- **Suppliers** (One-to-Many relationship)
- **Employees** (Track who created orders)
- **Categories** (Product categorization)
- **Soft-delete** logic with active/inactive status
- **Total Order Price** computed dynamically

---

## 🎓 Learning Objectives

| Concept | Covered In |
|---------|------------|
| OOP & Clean Architecture | Entities, DTOs, Services |
| SQL Relationships | One-to-Many, Many-to-Many |
| Spring Boot Layers | Controller → Service → Repository |
| DTO Mapping | Request/Response patterns |
| Business Logic | Validation, computed fields |
| Real-World Flow | Employees, Suppliers, Orders |

---

## 🛠️ Tech Stack

- **Java 17** + **Spring Boot 3.x**
- **PostgreSQL** Database
- **Spring Data JPA** (Hibernate)
- **Maven** Build Tool
- **Lombok** for boilerplate reduction
- **ModelMapper** for DTO mapping

---
---
## 🗂️ Project Structure

**Source Code:**
- `src/main/java/com/kiranastore/controller/` - REST APIs
- `src/main/java/com/kiranastore/service/` - Business logic
- `src/main/java/com/kiranastore/repository/` - Data access
- `src/main/java/com/kiranastore/entity/` - JPA entities
- `src/main/java/com/kiranastore/dto/` - Data Transfer Objects
- `src/main/java/com/kiranastore/config/` - Configuration

**Resources:**
- `src/main/resources/application.properties` - App configuration
- `pom.xml` - Maven dependencies


kiranaStore/
├── src/main/java/com/kiranastore/
│ ├── controller/ # REST APIs
│ ├── service/ # Business logic
│ ├── repository/ # Data access
│ ├── entity/ # JPA entities
│ ├── dto/ # Data Transfer Objects
│ └── config/ # Configuration
├── src/main/resources/
│ ├── application.properties
│ └── data.sql # Sample data (optional)
└── pom.xml
```

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- PostgreSQL database
- Maven

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/ManixGT/kirana-store.git
cd kiranaStore
```

2. **Database Setup**
```sql
CREATE DATABASE kirana;
```

3. **Configure application.properties**
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/kirana
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. **Run the application**
```bash
mvn spring-boot:run
```

---

## 📡 API Endpoints

### Orders
- `GET /api/orders` - Get all orders
- `POST /api/orders` - Create new order
- `GET /api/orders/{id}` - Get order by ID

### Products
- `GET /api/products` - List all products
- `POST /api/products` - Create product
- `PUT /api/products/{id}` - Update product

### Customers & Employees
- `GET /api/customers` - List customers
- `POST /api/customers` - Create customer
- `GET /api/employees` - List employees

---

## 🗄️ Entity Relationships

```
Customer ---< Order >--- Product
         \             /
        Employee     Category
                         |
                     Supplier
```

---

## 💡 Example Usage

### Create Order
```json
POST /api/orders
{
  "customerId": 1,
  "employeeId": 1,
  "items": [
    {
      "productId": 1,
      "quantity": 2
    },
    {
      "productId": 3,
      "quantity": 1
    }
  ]
}
```

### Create Product
```json
POST /api/products
{
  "name": "Basmati Rice",
  "price": 80.00,
  "categoryId": 1,
  "supplierId": 1
}
```

---

## 🔧 Configuration

### application.properties
```properties
spring.application.name=kiranaStore
server.port=8080

# Database
spring.datasource.url=jdbc:postgresql://localhost:5432/kirana
spring.datasource.username=postgres
spring.datasource.password=your_password

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 🚀 Future Enhancements

- [ ] Spring Security with JWT
- [ ] Inventory Management
- [ ] Reporting & Analytics
- [ ] PDF Invoice Generation
- [ ] Docker Configuration
- [ ] Unit & Integration Tests

---

## 👨‍💻 Author

**ManixGT** - [GitHub Profile](https://github.com/ManixGT)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

## 🔧 Key Fixes Made:

1. **✅ Updated repository URL** to your actual GitHub: `https://github.com/ManixGT/kirana-store.git`
2. **✅ Fixed tech stack** - Changed from H2 to **PostgreSQL** (what you're actually using)
3. **✅ Corrected project structure** to match Spring Boot conventions
4. **✅ Added proper configuration** section with your actual `application.properties`
5. **✅ Fixed API endpoints** to use `/api/` prefix
6. **✅ Updated entity relationships** to match your actual design
7. **✅ Added realistic example requests**
8. **✅ Removed broken formatting** and markdown errors

## 🎯 To Use This README:

1. **Save it as `README.md`** in your project root
2. **Update the password** in database configuration
3. **Commit and push** to GitHub:
```bash
git add README.md
git commit -m "docs: add proper README.md"
git push origin main
```
