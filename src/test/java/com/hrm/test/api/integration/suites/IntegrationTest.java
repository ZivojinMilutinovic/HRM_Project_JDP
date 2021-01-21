package com.hrm.test.api.integration.suites;

import com.hrm.test.api.calls.PeopleAPI;
import com.hrm.test.api.calls.WorklogAPI;
import com.hrm.test.api.common.init.TestBase;
import com.hrm.test.api.integration.common.IntegrationAssert;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

// example for integration test
public class IntegrationTest extends TestBase {

    @Test(groups={"integration"})
    @Description("Integration test for worklog")
    public static  void verifyWorklogData(){
        logStep("INFO:Verify required fields");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogResponse(token));
        logStep("PASS:Required fields are verified");
    }

    @Test(groups={"integration"})
    @Description("Integration test for worklog calendar")
    public static  void verifyWorklogCalendarData(){
        //AuthToken.getAuthTokenBetter();
        logStep("INFO:Verify required fields for the worklog calendar are present");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogCalendarResponse(token));
        logStep("PASS:Required fields are verified and are all present");
    }
    @Test(groups={"integration"})
    @Description("Integration test for worklog calendar for a particular person on a particular date")
    public static  void verifyWorklogCalendarForParticularPersonData(){
        //AuthToken.getAuthTokenBetter();
        logStep("INFO:Verify required fields for the worklog calendar are present");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogCalendarParticularPersonResponse(token));
        logStep("PASS:Required fields are verified and are all present");
    }

    @Test(groups={"integration"})
    @Description("Integration test for worklog status endpoint")
    public static  void verifyWorklogStatusData(){
        //AuthToken.getAuthTokenBetter();
        logStep("INFO:Verify required fields for the worklog statud are present");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogStatusResponse(token));
        logStep("PASS:Required fields are verified and are all present");
    }
    @Test(groups={"integration"})
    @Description("Integration test for worklog Check reminders data endpoint")
    public static  void verifyWorklogCheckRemindersData(){
        //AuthToken.getAuthTokenBetter();
        logStep("INFO:Verify required fields for the worklog statud are present");
        logStep("Usually thiz log step returns empty json response");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogCheckRemindersResponse(token));
        logStep("PASS:Required fields are verified and are all present");
    }
    @Test(groups = {"integration"})
    @Description("APi test for checking an email adress if it is htec")
    public static  void verifyHTECEmailIsUnique(){
        logStep("INFO:Verify the response was good");
        new IntegrationAssert().assertResponseStructure(PeopleAPI.validatePeopleCheckEmailResponse(token));
        logStep("PASS:Required fields are verified");
    }
    @Test(groups = {"integration"})
    @Description("APi test for checking for veryfing particular worklog correction scope")
    public static  void verifyWorklogCorrectionScope(){
        logStep("INFO:Verify worklog correction scope");
        new IntegrationAssert().assertResponseStructure(WorklogAPI.validateWorklogCorrectionScopeResponse(token));
        logStep("PASS:Required fields are verified");
    }
    @Test(groups = {"integration"})
    @Description("Test for verifing statistics for a particular person")
    public static  void verifyPersonStatistics(){
        logStep("INFO:Verify person statistics");
        new IntegrationAssert().assertResponseStructure(PeopleAPI.validatePersonStatisticsResponse(token));
        logStep("PASS:Required fields are verified");
    }
    @Test(groups = {"integration"})
    @Description("Test for verifing statistics parameters for a particular person")
    public static  void verifyPersonStatisticsParams(){
        logStep("INFO:Verify person statistics params");
        new IntegrationAssert().assertResponseStructure(PeopleAPI.validatePersonStatisticsParamsResponse(token));
        logStep("PASS:Required fields are verified");
    }




}
