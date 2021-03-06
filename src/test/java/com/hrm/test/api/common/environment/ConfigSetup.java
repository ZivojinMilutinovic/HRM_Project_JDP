package com.hrm.test.api.common.environment;

public class ConfigSetup {

    public static AppConfig getAppConfig() {
        return new AppConfig();
    }

    public static String getBaseURI() {
        return getAppConfig().getBaseURL();
    }
    public static String getAuthURI() {
        return getAppConfig().getAuthURL();
    }

    public static String getAdmin() {
        return getAppConfig().getAdmin();
    }

    public static String getAdminPsw() {
        return getAppConfig().getAdminPsw();
    }

    public static String getUser() {
        return getAppConfig().getUser();
    }

    public static String getUserPsw() {
        return getAppConfig().getUserPsw();
    }

    public static String getDbUser() {
        return getAppConfig().getDbUser();
    }

    public static String getDbPsw() {
        return getAppConfig().getDbPsw();
    }

    public static String getDbUrl() {
        return getAppConfig().getDbUrl();
    }

    public static String getGrantType() {
        return getAppConfig().getGrantType();
    }


    public static String getClientId() {
        return getAppConfig().getClientId();
    }

    public static  String getClientSecret() {
        return getAppConfig().getClientSecret();
    }

    public static  String getSeleniumBaseUrl() {
        return getAppConfig().getSeleniumBaseUrl();
    }
    public static  String getSeleniumEmail() {
        return getAppConfig().getSeleniumEmail();
    }
    public static  String getSeleniumPassword() {
        return getAppConfig().getSeleniumPassword();
    }

}
