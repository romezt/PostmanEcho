package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

class PostmanEchoTest {
 @Test
 void shouldReturnSameData() {
  given()
          .baseUri("http://postman-echo.com")
          .body("some data")
          .when()
          .post("/post")
          .then()
          .statusCode(200)
          .body("data", equalTo("some data"))
  ;
 }
}