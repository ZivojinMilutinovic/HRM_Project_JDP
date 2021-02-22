package com.hrm.test.ui;

import com.hrm.test.api.common.environment.ConfigSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class HRMLogin {
    private String chromeDriverPath="C:\\Program Files (x86)\\chromedriver.exe";
    private String geckoDriverPath="C:\\Program Files (x86)\\geckodriver.exe";
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public JavascriptExecutor getJavascriptExecutor() {
        return javascriptExecutor;
    }

    public void setJavascriptExecutor(JavascriptExecutor javascriptExecutor) {
        this.javascriptExecutor = javascriptExecutor;
    }

    private JavascriptExecutor javascriptExecutor;
    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    private Actions actions;
    public HRMLogin(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            this.driver=new ChromeDriver();
        this.webDriverWait = new WebDriverWait(driver, 25);
        this.actions=new Actions(this.driver);
        this.javascriptExecutor=(JavascriptExecutor) this.driver;
    }
    public void LoginToHRM(){


        String myEmail = ConfigSetup.getSeleniumEmail();
        String myPassword = ConfigSetup.getSeleniumPassword();
        String baseUrl = ConfigSetup.getSeleniumBaseUrl();
        this.driver.get("https://accounts.google.com/signin");

        new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys(myEmail);
        this.driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(this.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys(myPassword);
        this.driver.findElement(By.id("passwordNext")).click();
        this.driver.get(baseUrl);

        String loginButton = "hrmLogin__login-btn";
        this.webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(loginButton)));
        this.driver.findElement(By.className(loginButton)).click();


        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(loginButton)));
        driver.findElement(By.className(loginButton)).click();
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHanles = driver.getWindowHandles();
        for (String s : windowHanles) {
            if (!s.equals(parentWindowHandle))
                driver.switchTo().window(s);
        }
        String googleLoginEl = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]";
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(googleLoginEl)));
        WebElement listElement = driver.findElement(By.xpath(googleLoginEl));
        listElement.click();
        this.driver.switchTo().window(parentWindowHandle);
    }

}
