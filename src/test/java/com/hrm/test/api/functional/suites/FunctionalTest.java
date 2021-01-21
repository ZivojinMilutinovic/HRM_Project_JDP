package com.hrm.test.api.functional.suites;

import com.hrm.test.api.calls.PeopleAPI;
import com.hrm.test.api.calls.WorklogAPI;
import com.hrm.test.api.common.init.TestBase;
import com.hrm.test.api.data.model.calendar.CalendarParticularPersonResponse;
import com.hrm.test.api.data.model.error_message.ErrorMessageResponse;
import com.hrm.test.api.data.model.work_statistics.TotalWorkStatisticsResponse;
import com.hrm.test.api.data.model.work_statistics.WorkStatisticsResponse;
import com.hrm.test.api.data.model.worklog.ChangeStatusRequest;
import com.hrm.test.api.data.model.worklog.ChangeStatusResponse;
import com.hrm.test.api.functional.asserts.ChangeStatusAssert;
import com.hrm.test.api.functional.asserts.TotalWorkStatisticsAssert;
import com.hrm.test.api.functional.asserts.WorkStatisticsAssert;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


// each test class should extend TestBase in order to inherit all common behaviors and to be logged properly in report
public class FunctionalTest extends TestBase {

    // each test case should be simple, readable, in few lines and without any to technical steps. It should represent
    // user actions like as those are done manually on UI

    @Test(groups = {"regression", "check-ins"})
    @Description("User logins and goes to the main page to check out.User can checkout from every state")
    public static void changeStatusOff() {
        ChangeStatusRequest request=new ChangeStatusRequest("Off","Check-out od posla");

        logStep("INFO: Create a request to change status to off");
        ChangeStatusResponse changeStatusResponseRecieved = WorklogAPI.createChangeStatus(token,request);
        logStep("PASS: response was succsefully created");

        ChangeStatusResponse changeStatusResponseExpected=new ChangeStatusResponse(0,"Operation completed successfully.",0,null);


        ChangeStatusAssert changeStatusAssert=new ChangeStatusAssert();
        logStep("INFO: Verify the response of the change status api");
        changeStatusAssert.assertCreatedNoEqual(changeStatusResponseRecieved, changeStatusResponseExpected);
        logStep("PASS:The response was successfuly verified");
    }
    @Test(groups = {"regression", "check-ins"})
    @Description("User logins and goes to the main page to check in to work from home")
    public static void changeStatusWorkFromHome() {
        ChangeStatusRequest requestPrepare=new ChangeStatusRequest("Off","Check-out from job");
        ChangeStatusRequest request=new ChangeStatusRequest("WorkFromHome","Check-in with workFromHome");

        logStep("INFO:We must first check-out the user and prepare his worklog-status to off");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);

        logStep("INFO: Create a request to change status to WorkFromHome");
        ChangeStatusResponse changeStatusResponseRecieved = WorklogAPI.createChangeStatus(token,request);
        logStep("PASS: response was successfully created");

        ChangeStatusResponse changeStatusResponseExpected=new ChangeStatusResponse(0,"Operation completed successfully.",0,null);


        ChangeStatusAssert changeStatusAssert=new ChangeStatusAssert();
        logStep("INFO: Verify the response of the change status api");
        changeStatusAssert.assertCreatedNoEqual(changeStatusResponseRecieved, changeStatusResponseExpected);
        logStep("PASS:The response was successfully verified");

        logStep("INFO:After the check-in was successfully verified the user must be check-out");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);
    }

    @Test(groups = {"regression", "check-ins"})
    @Description("User can not change status to break from off")
    public static void changeStatusToBreakNotAvaibleIfUserIsOff() {
        ChangeStatusRequest requestPrepare=new ChangeStatusRequest("Off","Check-out from job");
        ChangeStatusRequest request=new ChangeStatusRequest("Break","User wants to use break when off");

        logStep("INFO:We must first check-out the user and prepare his worklog-status to off");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);

        logStep("INFO: Create a request to change status to Break");
        ErrorMessageResponse changeStatusErrorResponseRecieved = WorklogAPI.createChangeStatusErrorMessageResponse(token,request);
        logStep("PASS: response was successfully created");

        ErrorMessageResponse changeStatusErrorResponseExpected=new ErrorMessageResponse("You can't change status to break when you are off.");

        SoftAssert softAssert=new SoftAssert();
        logStep("INFO:Verify the error message response are the sam as actual");
        softAssert.assertEquals(changeStatusErrorResponseExpected.getErrorMessage(),changeStatusErrorResponseRecieved.getErrorMessage());
        softAssert.assertAll();
        logStep("PASS:Error response was correct");


    }
    @Test(groups = {"regression", "check-ins"})
    @Description("User logins and goes to the main page to check in to work from field")
    public static void changeStatusWorkFromField() {
        ChangeStatusRequest requestPrepare=new ChangeStatusRequest("Off","Check-out from job");
        ChangeStatusRequest request=new ChangeStatusRequest("WorkFromField","Check-in with WorkFromField status option");

        logStep("INFO:We must first check-out the user and prepare his worklog-status to off");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);

        logStep("INFO: Create a request to change status to WorkFromField");
        ChangeStatusResponse changeStatusResponseRecieved = WorklogAPI.createChangeStatus(token,request);
        logStep("PASS: response was successfully created");

        ChangeStatusResponse changeStatusResponseExpected=new ChangeStatusResponse(0,"Operation completed successfully.",0,null);


        ChangeStatusAssert changeStatusAssert=new ChangeStatusAssert();
        logStep("INFO: Verify the response of the change status api");
        changeStatusAssert.assertCreatedNoEqual(changeStatusResponseRecieved, changeStatusResponseExpected);
        logStep("PASS:The response was successfully verified");

        logStep("INFO:After the check-in was successfully verified the user must be check-out");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);
    }

    @Test(groups = {"regression", "check-ins"})
    @Description("User can not change status to break from off")
    public static void changeStatusToOnNotAvaibleIfUserIsNotInOffice() {
        ChangeStatusRequest requestPrepare=new ChangeStatusRequest("Off","Check-out from job");
        ChangeStatusRequest request=new ChangeStatusRequest("On","User want to check in while not being int the office");

        logStep("INFO:We must first check-out the user and prepare his worklog-status to off");
        logStep("INFO:The change status off is  verified with changeStatusOff test");
        WorklogAPI.createChangeStatus(token,requestPrepare);

        logStep("INFO: Create a request to change status to On");
        ErrorMessageResponse changeStatusErrorResponseRecieved = WorklogAPI.createChangeStatusErrorMessageResponse(token,request);
        logStep("PASS: response was successfully created");

        ErrorMessageResponse changeStatusErrorResponseExpected=new ErrorMessageResponse("You have to be in the office in order to use status \"At the office\"");

        SoftAssert softAssert=new SoftAssert();
        logStep("INFO:Verify the error message response are the same as actual");
        softAssert.assertEquals(changeStatusErrorResponseExpected.getErrorMessage(),changeStatusErrorResponseRecieved.getErrorMessage());
        softAssert.assertAll();
        logStep("PASS:Error response was correct");
    }

    @Test(groups = {"regression", "worklog"})
    @Description("User goes to my worklog and wants to check worklogs statistics for one day on the graph")
    public static void ceckWorklogStatisticsForOneDay() {
        logStep("Prepare data");
        long actualHours=8;
        long actualMinutes=37;
        logStep("INFO: Create a request to get a calendar response for one person for the particular day");
        CalendarParticularPersonResponse response=WorklogAPI.createCalendarParticularPersonResponse(token,"513","2021-1-14");
        logStep("PASS: response was successfully created");
        logStep("INFO:Get sum off all log step for all logs");
        double sumHoursForDay= response.getPersonLoggingStatuses().stream().mapToDouble(el -> Double.parseDouble(el.toString().split("TotalTime=")[1].split(",")[0])).sum();
        logStep("INFO:Get whole part of hours");
        long receivedHours=(long)sumHoursForDay;
        logStep("INFO:Get minutes part");
        long receivedMinutes=(long)((sumHoursForDay-receivedHours)*60);
        logStep("INFO:Create soft assert");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualHours,receivedHours);
        softAssert.assertEquals(actualMinutes,receivedMinutes);
        softAssert.assertAll();
        logStep("PASS:Hours and minutes were successfully calculated");
    }
    @Test(groups = {"regression", "worklog"})
    @Description("User goes to my worklog and wants to check worklog live statistics panel")
    public static void checkWorklogLiveStatistics(){
        logStep("Prepare data for live statistics:");

        WorkStatisticsResponse actualResponse= PeopleAPI.createWorkStatisticsResponse(token,"188","2020-12-19");
        logStep("PASS:Actual response was successfully created");

        logStep("INFO:Creating an expected response");
        WorkStatisticsResponse expectedResponse=new WorkStatisticsResponse("2020-12-19T00:00:00","70h 52m",
                "30h 35m", "7h 0m","6h 7m",6.12);
        WorkStatisticsAssert workStatisticsAssert=new WorkStatisticsAssert();
        logStep("INFO:Verify that actual and expected response are equal");
        workStatisticsAssert.assertCreatedNoEqual(actualResponse,expectedResponse);
        logStep("PASS:The objects were successfully verified");

    }
    @Test(groups = {"regression", "worklog"})
    @Description("User goes to my worklog and wants to check worklog total statistics panel")
    public static void checkWorklogTotalStatistics(){
        logStep("Prepare data for live statistics:");
        TotalWorkStatisticsResponse actualResponse= PeopleAPI.createTotalWorkStatisticsResponse(token,"513");
        logStep("PASS:Actual response was successfully created");
        logStep("INFO:Creating an expected response");
        TotalWorkStatisticsResponse expectedResponse=new TotalWorkStatisticsResponse("321h 19m",47,"6h 50m");
        TotalWorkStatisticsAssert workStatisticsAssert=new TotalWorkStatisticsAssert();
        logStep("INFO:Verify that actual and expected response are equal");
        workStatisticsAssert.assertCreatedNoEqual(actualResponse,expectedResponse);
        logStep("PASS:The objects were successfully verified");

    }

}
