package com.hrm.test.api.constants;

import com.hrm.test.api.common.environment.ConfigSetup;

//List of endpoint as constants
public class ApiEndpoints {

    public static final String EXAMPLE_ENDPOINT = "api/example/test";
    public static final String WORKLOG_ENDPOINT = ConfigSetup.getBaseURI()+"Account/permissions-and-me";
    public static final String PERSON_STATISTICS_ENDPOINT = ConfigSetup.getBaseURI()+"api/People/v2/person-statistics";
    public static final String PERSON_STATISTICS_PARAMS_ENDPOINT = ConfigSetup.getBaseURI()+"api/People/v2/person-statistics-params";
    public static final String CALENDAR_ENDPOINT= ConfigSetup.getBaseURI()+"api/WorkLog/calendar";
    public static final String CALENDAR_PERSON_ENDPOINT= ConfigSetup.getBaseURI()+"api/WorkLog/calendar/84/2020-12-10";
    public static final String WORKLOG_STATUS_ENDPOINT=ConfigSetup.getBaseURI()+"api/WorkLog/Status";
    public static final String WORKLOG_CHECK_REMINDERS_ENDPOINT=ConfigSetup.getBaseURI()+"api/WorkLog/CheckReminders";
    public static final String PEOPLE_CHECK_EMAIL=ConfigSetup.getBaseURI()+"api/People/check-email";
    public static final String PEOPLE_PROFILE_ME=ConfigSetup.getBaseURI()+"api/People/profile/me";
    public static final String WORKLOG_CORRECTION_SCOPE=ConfigSetup.getBaseURI()+"api/WorkLog/WorkLogCorrectionScope/255467";
    public static final String WORKLOG_CHANGE_STATUS=ConfigSetup.getBaseURI()+"/api/WorkLog/ChangeStatus";
    public static final String WORKLOG_STATISTICS_RESPONSE=ConfigSetup.getBaseURI()+"/api/v2/People/WorkStatistics";
    public static final String WORKLOG_STATISTICS_TOTAL_RESPONSE=ConfigSetup.getBaseURI()+"api/v2/People/TotalWorkStatistics";

}
