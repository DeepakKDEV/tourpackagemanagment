Tour Package Management ![online-food-delivery-industry-min](https://github.com/DeepakKDEV/ApicrudOperation/assets/142679882/11625f4d-3afe-4a4f-a634-7d9a1bf6114f)
   
   ##### 🔸This is simple Food Delivery App built using Spring Boot framework. The idea was to build  a simple Food Delivery App to perform basic CRUD operations                  with some validations and also auhentication.
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA-17
    3. Postman
    4. postgressql
    5. Swagger
    
## :two: Dependency Used
   1. **Spring Boot Starter Web**  
   Provides the core functionalities to build REST APIs.

2. **Spring Boot Starter Data JPA**  
   For database access using Hibernate and JPA.

3. **PostgreSQL Driver**  
   JDBC driver required to connect to PostgreSQL database.

4. **Spring Boot Starter Security**  
   Adds authentication and authorization support.

5. **springdoc-openapi-starter-webmvc-ui**  
   Enables Swagger/OpenAPI documentation and Swagger UI.

6. **AWS SDK (S3)**  
   Allows integration with AWS S3 buckets for file operations.

7. **Lombok**  
   Reduces boilerplate code with annotations like `@Getter`, `@Setter`, `@NoArgsConstructor`.

8. **JUnit Jupiter API & Engine**  
   Framework for writing and running unit tests.

9. **Mockito JUnit Jupiter**  
   Used for mocking dependencies in unit tests.

10. **Spring Boot Starter Test**  
    Provides additional Spring-specific testing utilities.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: Dataflow (Functions Used In)
# Tour Package Management 

---

## Task Requirements

- **Database:** PostgreSQL  
- Build a backend service that allows users to **create and manage tour packages**, with optional **image upload and AWS S3 integration**.

---

## Core Features
 ## Use Docker if familia
 ## Swagger API Docs (Bonus)
 ## Secure APIs using a basic API key header
 ## API documentation  using swagger @peration @apirepnse

1. **Create Tour Package**  

   **POST** `/api/tours`  

   **Request Body Example:**
   ```json
   {
     "id": 1,
     "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
     "discountInPercentage": "17%",
     "title": "Himalayan Trek Adventure",
     "description": "14-day trek through the Himalayas",
     "duration": "14Days/13Nights",
     "actualPrice": "$1200",
     "discountedPrice": "$1000",
     "location": "Leh"
   }

## API Endpoints Overview

| # | HTTP Method | Endpoint | Description | Headers | Body Example |
|---|-------------|---------|-------------|---------|-------------|
| 1 | POST | `/api/tours` | Create a new tour package | `x-api-key: MY_SECRET_KEY_123`<br>`Content-Type: application/json` | ```json { "title": "Chennai Beach Holiday", "description": "A 5-day holiday package including beach parties, water sports, and sightseeing in Goa.", "duration": "5 Days / 4 Nights", "actualPrice": "18000", "discountedPrice": "13500", "discountInPercentage": "25", "location": "Goa", "imageUrl": "https://example.com/images/goa-beach.jpg" } ``` |
| 2 | GET | `/api/tours` | List all tour packages | `x-api-key: MY_SECRET_KEY_123` | N/A |
| 3 | GET | `/api/tours/{id}` | Get tour package by ID | `x-api-key: MY_SECRET_KEY_123` | N/A |
| 4 | GET | `/api/tours?location={location}` | Search tour packages by location | `x-api-key: MY_SECRET_KEY_123` | N/A |

-------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 2. Service - This Layer is used to perform business functionalities.
#### :o: TourService.java



---------------------------------------------------------

### :white_flower: 3. Controller - This Controller is used to create RestApi's and perform basic CRUD operations.
#### :o: TourController.java

-------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------

#### :white_check_mark:  TourController Controller

```java
http://localhost:8081/api/tours
```
```java
http://localhost:8081/api/tours?location=Goa&x-api-key
```
```java
http://localhost:8081/api/tours/1
```
```


## :six: Documentation in Swagger
```java
 http://localhost:8081/swagger-ui/index.html#/
```
TourController![Screenshot_10](https://github.com/DeepakKDEV/FoodDelivery/assets/142679882/399bebb1-d5c0-43eb-8929-0e246b7c3337)


## :seven: View in postgresql Database

![Screenshot_8](https://github.com/DeepakKDEV/FoodDelivery/assets/142679882/c48a3e77-abeb-4fbd-a5ae-5ad440fd3254)





#  Summary
This project is a backend service for managing tour packages, allowing users to create, update, and search for tours easily. It supports image uploads with AWS S3 integration, enabling storage and retrieval of tour images. Built with Spring Boot and PostgreSQL, it ensures robust and scalable data management. The APIs are secured using an API key for authorized access. Additionally, Swagger documentation is provided for easy testing and integration with tools like Postman or curl.

             
