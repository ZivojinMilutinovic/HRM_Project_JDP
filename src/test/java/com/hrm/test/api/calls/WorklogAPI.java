package com.hrm.test.api.calls;

import com.hrm.test.api.common.GsonFunctions;
import com.hrm.test.api.common.ResponseValidation;
import com.hrm.test.api.common.RestAssuredFunctions;
import com.hrm.test.api.constants.ApiEndpoints;
import com.hrm.test.api.data.model.calendar.CalendarParticularPersonResponse;
import com.hrm.test.api.data.model.calendar.CalendarResponse;
import com.hrm.test.api.data.model.check_reminder_for_today.CheckReminders;
import com.hrm.test.api.data.model.error_message.ErrorMessageResponse;
import com.hrm.test.api.data.model.worklog.ChangeStatusRequest;
import com.hrm.test.api.data.model.worklog.ChangeStatusResponse;
import com.hrm.test.api.data.model.worklog.WorklogResponse;
import com.hrm.test.api.data.model.worklog.WorklogStatusResponse;

public class WorklogAPI {
    public static ResponseValidation validateWorklogResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken,  ApiEndpoints.WORKLOG_ENDPOINT).body().asString();

        return GsonFunctions.verifyResponse(jsonResponse, WorklogResponse.class);
    }
    public static ResponseValidation validateWorklogCalendarResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.CALENDAR_ENDPOINT).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, CalendarResponse.class);
    }
    public static ResponseValidation validateWorklogCalendarParticularPersonResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.CALENDAR_PERSON_ENDPOINT).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, CalendarParticularPersonResponse.class);
    }
    public static ResponseValidation validateWorklogStatusResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.WORKLOG_STATUS_ENDPOINT).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, WorklogStatusResponse.class);
    }
    public static ResponseValidation validateWorklogCheckRemindersResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.WORKLOG_CHECK_REMINDERS_ENDPOINT).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, CheckReminders.class);
    }
    public static ResponseValidation validateWorklogCorrectionScopeResponse(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.WORKLOG_CORRECTION_SCOPE).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ErrorMessageResponse.class);
    }

    public static ChangeStatusResponse createChangeStatus(String accessToken, ChangeStatusRequest createRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.put(createRequest, accessToken, ApiEndpoints.WORKLOG_CHANGE_STATUS).body().asString(), ChangeStatusResponse.class);
    }
    public static ErrorMessageResponse createChangeStatusErrorMessageResponse(String accessToken, ChangeStatusRequest createRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.put(createRequest, accessToken, ApiEndpoints.WORKLOG_CHANGE_STATUS).body().asString(), ErrorMessageResponse.class);
    }
    public static CalendarParticularPersonResponse createCalendarParticularPersonResponse(String accessToken,String personID,String date)
    {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(accessToken,ApiEndpoints.CALENDAR_ENDPOINT+"/"+personID+"/"+date).body().asString(),CalendarParticularPersonResponse.class);
    }


}
