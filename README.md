## Description
Develop an API for hotel reservation system using Java Springboot.

### Get a list of hotels
GET /api/hotels
![GetHotels.png](src/main/resources/photos/GetHotels.png)

### Get a specific hotel
GET /api/hotels/{hotelId}
<br/>

Success
![GetHotel_200.png](src/main/resources/photos/GetHotel_200.png)

Fail
![GetHotel_404.png](src/main/resources/photos/GetHotel_404.png)

### Create a new hotel
POST /api/hotels
![PostHotel.png](src/main/resources/photos/PostHotel.png)

## Technologies

SpringBoot
<br/>
H2 Database (Embedded Persistence Mode)
<br/>
Liquibase: version control for database
<br/>
Lombok
<br/>
Swagger (access at http://localhost:8080/swagger-ui/index.html)