package com.hrm.test.api.common.environment;

public interface IAppConfig {

    String getBaseURL();

    String getAuthURL();

    String getAdmin();

    String getAdminPsw();

    String getUser();

    String getUserPsw();

    String getDbUser();

    String getDbPsw();

    String getDbUrl();
    String getGrantType();
    String getClientId();
    String getClientSecret();
    String getSeleniumBaseUrl();
    String getSeleniumEmail();
    String getSeleniumPassword();

}
