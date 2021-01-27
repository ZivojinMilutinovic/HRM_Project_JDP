package com.hrm.test.api.common;

import com.hrm.test.api.common.environment.ConfigSetup;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthToken {

//    /*
//    public static String getAuthToken() {
//        Response response = given()
//                .header("Accept", "application/json, text/plain, */*")
//                .header("Connection", "keep-alive")
//                .header("Content-Type", "application/x-www-form-urlencoded")
//                .header("Host", "hrm-identity-test.htec.rs")
//                .header("Origin", "https://hrm-test.htec.rs")
//                .formParam("client_id", "HRManagerWebClient")
//                .formParam("grant_type", "refresh")
//                .formParam("scope", "HRManagerApi")
//                //ovde menjamo samo refresh token
//                .formParam("refresh_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Inppdm9qaW4ubWlsdXRpbm92aWNAaHRlY2dyb3VwLmNvbSIsInRva2VuX3VzYWdlIjoicmVmcmVzaF90b2tlbiIsInN1YiI6Ijg5IiwibmJmIjoxNjEwMzYzMzg5LCJleHAiOjE2MTA5NjgxODksImlhdCI6MTYxMDM2MzM4OSwiaXNzIjoiaHR0cHM6Ly9ocm0taWRlbnRpdHktdGVzdC5odGVjLnJzIiwiYXVkIjoiSWRlbnRpdHlTZXJ2ZXIifQ.tcmIXZl1ZracjTlT1ndXNcb73-YwbBjrd2fJXy-L9S8")
//                .when().post("https://hrm-identity-test.htec.rs/connect/token");
//        return (String) response.path("access_token");
//    }
//
//    public static String encode(String str1, String str2) {
//        return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
//    }  */

    //da pokusamo da ispravimo funkciju
    public static String getAuthToken() {
        //staviti env properties
                        Response resp=given()
                                .headers("Content-Type","application/x-www-form-urlencoded","Accept", ContentType.JSON)
                                .param("grant_type",ConfigSetup.getGrantType())
                                .param("client_id",ConfigSetup.getClientId())
                                .param("username", ConfigSetup.getAdmin())
                                .param("password",ConfigSetup.getAdminPsw())
                                .param("client_secret",ConfigSetup.getClientSecret())
                                .when()
                                .post(ConfigSetup.getAuthURI())
                                .then()
                                .extract()
                                .response();
                        return resp.jsonPath().getString("access_token");

    }



}
