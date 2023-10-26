# NIBSS
# NIBSS Instant Payments (NIP) Simulation Application

## Description

This Java web application simulates NIBSS Instant Payments (NIP) transfer operations between bank accounts. It provides two REST endpoints for processing transfer requests and retrieving transaction lists with optional parameters. Additionally, the application includes a scheduled operation for calculating commissions on successful transactions and generating daily transaction summaries.

## Features

- Create and process transfer requests.
- Retrieve transaction lists based on various criteria.
- Calculate commissions on successful transactions.
- Generate daily transaction summaries.

## Technologies Used

- Java 11+
- Spring Boot
- Spring Data JPA
- Spring MVC
- H2 Database (for testing)
- Maven (for build and dependencies management)

## Getting Started

Follow these steps to run the application locally:

1. Clone the repository:

    ```bash
    git clone https://github.com/rasheey97-alt/NIBSS.git
    cd your-repo
    ```

2. Build the application using Maven:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    java -jar target/your-application.jar
    ```

4. The application will be accessible at [http://localhost:8080](http://localhost:8080).

## API Endpoints

1. **Create Transaction:**

   - Endpoint: POST `/api/transactions`
   - Description: Create a new transaction.
   - Request Body: JSON representing the transaction.
   - Example:
     ```json
     {
         "transactionReference": "TX123",
         "amount": 100.00,
         "description": "Payment for services"
     }
     ```

2. **Get Transactions:**

   - Endpoint: GET `/api/transactions`
   - Description: Retrieve a list of transactions based on optional parameters.
   - Query Parameters:
     - `status`: Filter by transaction status (e.g., "SUCCESSFUL").
     - `userId`: Filter by user ID.
     - `startDate` and `endDate`: Filter by date range.

## Scheduled Job

The commission calculation job runs daily at 2 AM and updates successful transactions with commission details.

## Testing

You can run automated tests using JUnit and Mockito to ensure the correctness of the application components.

```bash
mvn test

