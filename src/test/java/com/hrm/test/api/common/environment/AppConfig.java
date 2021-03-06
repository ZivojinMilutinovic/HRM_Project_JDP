package com.hrm.test.api.common.environment;

public class AppConfig extends ConfigReader implements IAppConfig {

    private static String CONFIG_FILENAME = "env.properties";

    public AppConfig() {
        super(CONFIG_FILENAME);
    }

    @Override
    public String getBaseURL() {
        return getValue("BASE_URL_DEV");
    }
    @Override
    public String getAuthURL() {
        return getValue("BASE_URL_IDENTITY");
    }

    @Override
    public String getAdmin() {
        return getValue("EMAIL");
    }

    @Override
    public String getAdminPsw() {
        return getValue("PASSWORD");
    }



    @Override
    public String getUser() {
        return getValue("USER");
    }

    @Override
    public String getUserPsw() {
        return getValue("USER_PSW");
    }

    @Override
    public String getDbUser() {
        return getValue("DB_USER");
    }

    @Override
    public String getDbPsw() {
        return getValue("DB_PSW");
    }

    @Override
    public String getDbUrl() {
        return getValue("DB_URL");
    }

    @Override
    public String getGrantType() {
        return getValue("GRANT_TYPE");
    }

    @Override
    public String getClientId() {
        return getValue("CLIENT_ID");
    }

    @Override
    public String getClientSecret() {
        return getValue("CLIENT_SECRET");
    }

    @Override
    public String getSeleniumBaseUrl() {
        return getValue("BASE_URL");
    }

    @Override
    public String getSeleniumEmail() {
        return getValue("EMAIL_SELENIUM");
    }

    @Override
    public String getSeleniumPassword() {
        return getValue("PASSWORD_SELENIUM");
    }


}
