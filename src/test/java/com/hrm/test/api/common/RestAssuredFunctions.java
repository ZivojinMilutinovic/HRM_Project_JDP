package com.hrm.test.api.common;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

// Basic REST API methods that can be reused; all with Authorization and bearer token; example with and without body
public class RestAssuredFunctions {

    public static Response get(String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).when()
                .get(uri).then().extract().response();
    }

    public static Response get(Object body, String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).body(body).when()
                .get(uri).then().extract().response();
    }

    public static Response post(Object body, String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).body(body).when()
                .post(uri).then().extract().response();
    }

    public static Response post(String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).when()
                .post(uri).then().extract().response();
    }

    public static Response delete(String accessToken, String uri) {
        return given().header("Authorization",  "Bearer " + accessToken).when()
                .delete(uri).then().extract().response();
    }

    public static Response patch(Object body, String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).body(body).when()
                .patch(uri).then().extract().response();
    }

    public static Response put(String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).when()
                .put(uri).then().extract().response();
    }

    public static Response put(Object body, String accessToken, String uri) {
        return given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).body(body).when()
                .put(uri).then().extract().response();
    }
}
