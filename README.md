# Expense Tracker API

This project is a Spring Boot application that provides a RESTful API for managing expenses and income. It includes endpoints for creating, reading, updating, and deleting transactions, as well as calculating total expenses, income, and net worth. The project uses MySQL for data storage and Swagger UI for API documentation.

## Project Description

The Expense Tracker API allows users to manage their financial transactions. It includes endpoints for:

- Managing income and expenses
- Calculating total income, total expenses, and net worth

## Setup Instructions

### Prerequisites

- Java 17 or higher
- Maven
- MySQL Server
- Git

### Clone the Repository

```sh
git clone git@github.com:bhskr-j-dka/Java_Collection-Framework.git
cd Java_Collection-Framework
```

### Configure the Database

1. **Create a MySQL Database:**

   Create a new database in MySQL. For example:
   ```sql
   CREATE DATABASE expense_tracker;
   ```

2. **Update `application.properties`:**

   Configure the database connection in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

### Build and Run the Application

1. **Build the Project:**

   ```sh
   mvn clean install
   ```

2. **Run the Application:**

   ```sh
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

## API Endpoints

### Income Endpoints

- **Get All Income**
  - `GET /api/transactions/income`

- **Add Income**
  - `POST /api/transactions/income`
  - Request Body: `{"amount": 1500.75, "tag": "Groceries", "date": "2024-08-22"}`

- **Update Income**
  - `PUT /api/transactions/income/{id}`
  - Request Body: `{"amount": 1500.75, "tag": "Groceries", "date": "2024-08-22"}`

- **Delete Income**
  - `DELETE /api/transactions/income/{id}`

- **Get Total Income**
  - `GET /api/transactions/total-income`

### Expense Endpoints

- **Get All Expenses**
  - `GET /api/transactions/expense`

- **Add Expense**
  - `POST /api/transactions/expense`
  - Request Body: `{"amount": 100.50, "tag": "Utilities", "date": "2024-08-22"}`

- **Update Expense**
  - `PUT /api/transactions/expense/{id}`
  - Request Body: `{"amount": 100.50, "tag": "Utilities", "date": "2024-08-22"}`

- **Delete Expense**
  - `DELETE /api/transactions/expense/{id}`

- **Get Total Expense**
  - `GET /api/transactions/total-expense`

- **Get Net Worth**
  - `GET /api/transactions/net-worth`

## Swagger UI

Swagger UI is available for API documentation. You can access it at:

```
http://localhost:8080/swagger-ui/
```

## Screenshots

**Swagger UI:**

![Swagger UI Screenshot](Screenshot%202024-08-22%20at%203.03.46%20PM.png)

**Application Screenshot 1:**

<img src="Screenshot%202024-08-22%20at%203.03.30%20PM.png" alt="Application Screenshot 1">

**Application Screenshot 2:**

<img src="Screenshot%202024-08-22%20at%203.11.28%20PM.png" alt="Application Screenshot 2">

## Database Configuration

The application uses MySQL for data storage. Ensure that the MySQL server is running and accessible.

### Database Schema

The application uses the following tables:

- `income` (id, amount, tag, date)
- `expense` (id, amount, tag, date)

Ensure that these tables are created in the `expense_tracker` database.

## Contributing

Feel free to fork the repository, make changes, and create pull requests. For major changes, please open an issue to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
