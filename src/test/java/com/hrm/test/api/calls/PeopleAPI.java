package com.hrm.test.api.calls;

import com.hrm.test.api.common.GsonFunctions;
import com.hrm.test.api.common.ResponseValidation;
import com.hrm.test.api.common.RestAssuredFunctions;
import com.hrm.test.api.constants.ApiEndpoints;
import com.hrm.test.api.data.model.check_email.CheckEmail;
import com.hrm.test.api.data.model.person_statistics.PersonStatisticsParamsResponse;
import com.hrm.test.api.data.model.person_statistics.PersonStatisticsResponse;
import com.hrm.test.api.data.model.work_statistics.TotalWorkStatisticsResponse;
import com.hrm.test.api.data.model.work_statistics.WorkStatisticsResponse;

import java.util.HashMap;
import java.util.Map;

public class PeopleAPI {

    public static ResponseValidation validatePeopleCheckEmailResponse(String accessToken) {
        //body prosledjujemo kao hashMapu
        Map<String,Object> jsonAsMap=new HashMap<>();
        jsonAsMap.put("Email","zivojin.milutinovic007@htecgroup.com");
        String jsonResponse = RestAssuredFunctions.post(jsonAsMap,accessToken, ApiEndpoints.PEOPLE_CHECK_EMAIL).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse,  CheckEmail.class);
    }
    public static ResponseValidation validatePersonStatisticsResponse(String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.PERSON_STATISTICS_ENDPOINT+"/513/2021-01-11").body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, PersonStatisticsResponse.class);
    }
    public static ResponseValidation validatePersonStatisticsParamsResponse(String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ApiEndpoints.PERSON_STATISTICS_PARAMS_ENDPOINT+"/513/2021-01-11").body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, PersonStatisticsParamsResponse.class);
    }
    public static WorkStatisticsResponse createWorkStatisticsResponse(String accessToken, String personID, String date)
    {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(accessToken,ApiEndpoints.WORKLOG_STATISTICS_RESPONSE+"/"+personID+"/"+date).body().asString(),WorkStatisticsResponse.class);
    }
    public static TotalWorkStatisticsResponse createTotalWorkStatisticsResponse(String accessToken, String personID)
    {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(accessToken,ApiEndpoints.WORKLOG_STATISTICS_TOTAL_RESPONSE+"/"+personID).body().asString(),TotalWorkStatisticsResponse.class);
    }

}
