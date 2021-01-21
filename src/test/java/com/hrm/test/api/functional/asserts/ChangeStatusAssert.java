package com.hrm.test.api.functional.asserts;

import com.hrm.test.api.data.model.worklog.ChangeStatusResponse;
import org.testng.asserts.SoftAssert;

public class ChangeStatusAssert {
    private SoftAssert softAssert;
    public ChangeStatusAssert() {softAssert=new SoftAssert();}
    public void assertCreatedNoEqual(ChangeStatusResponse actualResponse,ChangeStatusResponse expectedResponse){
        this.softAssert.assertEquals(actualResponse.getResponseCode(),expectedResponse.getResponseCode(),"Response code did not match");
        this.softAssert.assertEquals(actualResponse.getResponseMessage(),expectedResponse.getResponseMessage(),"Response message did not match");
        this.softAssert.assertEquals(actualResponse.getData(),expectedResponse.getData(),"Response code did not match");


        this.softAssert.assertAll();
    }
}
