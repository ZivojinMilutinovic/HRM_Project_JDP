package com.hrm.test.api.integration.common;

import com.hrm.test.api.common.ResponseValidation;
import org.testng.asserts.SoftAssert;

//Asserts used to validate json schema for Integration tests
public class IntegrationAssert {

    private SoftAssert softAssert;

    public IntegrationAssert() {
        this.softAssert = new SoftAssert();
    }

    public void assertResponseStructure(ResponseValidation responseValidation) {
        if (!responseValidation.getUnknownFields().isEmpty()) {
            for (int i = 0; i < responseValidation.getUnknownFields().size(); i++) {
                this.softAssert.fail(responseValidation.getUnknownFields().get(i));
            }
        }
        if (!responseValidation.getClassRequiredFields().isEmpty()) {
            for (int i = 0; i < responseValidation.getClassRequiredFields().size(); i++) {
                this.softAssert.fail("Required field " + responseValidation.getClassRequiredFields().get(i) + " missing in response");
            }
        }
        if (!responseValidation.getRequiredFieldMissingValue().isEmpty()) {
            for (int i = 0; i < responseValidation.getRequiredFieldMissingValue().size(); i++) {
                this.softAssert.fail(responseValidation.getRequiredFieldMissingValue().get(i));
            }
        }
        if (!responseValidation.getWrongTypeFields().isEmpty()) {
            for (int i = 0; i < responseValidation.getWrongTypeFields().size(); i++) {
                this.softAssert.fail(responseValidation.getWrongTypeFields().get(i));
            }
        }
        this.softAssert.assertAll();
    }
}
