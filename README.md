# JustEat API BackEnd Server 


### Project Overview:

As part of the assignment, I was tasked to utilise JustEat's API. However, due to 
some errors I have been encountering, it prevented my React application from accessing the
directly from the API due to security issues.

To address this issue, I set up a proxy server on my backEnd that forwards requests to the 
JustEat API. My React application can then make requests to my proxy server, which will 
which will forward them to the API.

This way, by having the API originate from my server, it bypasses the restrictions enforced 
by the browser. 

## Technical Information:
My project utilises the following:
* Spring Boot `version: 3.0.6`
* Maven
* Packaging: `Jar`
* Java `version: 17`
* Dependencies: `Lombok`, `Spring Data JPA`, `Spring Web`, `Spring Boot DevTools`, `PostgreSQL Driver`
* `IntelliJ IDEA JDK 17`, `PostgreSQL`, `Postico` & `Postman` to help create and visualise our code

* 
