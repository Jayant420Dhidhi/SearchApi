# Search API
## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)

## Features

- fetch the supplier data based on `location, nature_of_business, manufacturing_processes` from data base using RestFul API in Springboot.
- Handle and validate `nature_of_business` that belong into one of three types: `small scale, medium scale, or large scale`.
- Handle and validate `manufacturing_processes` that belong into one of three types: `moulding, printing_3d, casting, coating`.
- Exception handling.

## Installation

To set up the project locally, follow these steps:

### Prerequisites

- Java 17 or higher
- Maven
- MySQL
  
### Steps

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Jayant420Dhidhi/SearchApi.git
    cd SearchApi
    ```

2. **Set up the database:**
   - Create a new database for the project using MySQL   .
   - Name the database according to your preference.

3. **Update application.properties:**
   - Open `src/main/resources/application.properties`.
   - Modify the following properties to match your database configuration:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

4. **Build the project:**
    ```bash
    mvn clean install
    ```

5. **Run the project:**
    ```bash
    mvn spring-boot:run
    ```

6. **Access the API:**
   - The API will be available at `http://localhost:8080/api/supplier/query?city=location&btype=nature_of_business&ptype=manufacturing_processes`.

## Configuration

You can further configure the application by modifying the `application.properties` file. Key configurations include:

- `spring.datasource.url`: The JDBC URL for your database connection.
- `spring.datasource.username`: Your database username.
- `spring.datasource.password`: Your database password.

## Usage

Once the application is running, you can start making requests to the API using tools like  `Postman`.

### Example Request

```bash
POST `http://localhost:8080/api/supplier/query?city=location&btype=nature_of_business&ptype=manufacturing_processes`
```

## API Endpoints

Here are the API description:

- `POST api/supplier/query`: Search for records based on query parameters.
  - **Parameters**:
    - `city` : location.
    - `btype` : nature of business.
    - `ptype` : manufacturing process.

##Results and screenshots
