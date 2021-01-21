package com.hrm.test.api.calls;

import com.hrm.test.api.common.GsonFunctions;
import com.hrm.test.api.common.ResponseValidation;
import com.hrm.test.api.common.RestAssuredFunctions;
import com.hrm.test.api.constants.ApiEndpoints;
import com.hrm.test.api.data.model.example.ExampleRequest;
import com.hrm.test.api.data.model.example.ExampleResponse;

//Methods that help parse json into model classes
public class ExampleAPI {

    public static ExampleResponse createExample(String accessToken, ExampleRequest createRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post(createRequest, accessToken, ApiEndpoints.EXAMPLE_ENDPOINT).body().asString(), ExampleResponse.class);
    }

    public static ExampleResponse getExample(String accessToken) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(accessToken, ApiEndpoints.EXAMPLE_ENDPOINT).body().asString(), ExampleResponse.class);
    }

    //Method used to parse and validate response for Integration tests
    public static ResponseValidation validateExampleResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.EXAMPLE_ENDPOINT).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ExampleResponse.class);
    }
}
