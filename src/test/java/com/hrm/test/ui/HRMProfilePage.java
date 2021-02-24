package com.hrm.test.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

//da bi smo cekali na stranici
public class HRMProfilePage {
    private HRMLogin hrmLogin;
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private Actions action;
    private JavascriptExecutor javascriptExecutor;
    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        prepareBrowserForTests();
        removeAllChildren();

    }
    private void prepareBrowserForTests(){
        hrmLogin=new HRMLogin();
        hrmLogin.LoginToHRM();
        driver=hrmLogin.getDriver();
        webDriverWait=hrmLogin.getWebDriverWait();
        action=hrmLogin.getActions();
        javascriptExecutor=hrmLogin.getJavascriptExecutor();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leave-management-tab")));
        driver.manage().window().maximize();
    }

    public void verifyTittle(){
        String expectedTitle="HRM";
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }
    @Test(groups = {"ui"})
    public void verifyProfileName(){
        String expectedProfileName="Živojin Milutinovic";
        WebElement el=driver.findElement(By.cssSelector(".top-card-info__profile--name p"));
        Assert.assertEquals(expectedProfileName,el.getText());
    }
    @Test(groups = {"ui"})
    public void verifyEmployeeNavigationIcons(){
       List<WebElement> elements= driver.findElements(By.cssSelector(".employee__navigation--icons--node p"));
       String names[]={"Basic","Leave Management","Relation Management"};
       for(int i=0;i<3;i++){
           Assert.assertEquals(elements.get(i).getText(),names[i]);
       }
    }
    @Test(groups = {"ui"})
    public void verifyProfilePageLabels(){
        List<WebElement> elements= driver.findElements(By.cssSelector("label"));
        String[] strings= elements.stream().filter(el->el.getText().length()>0).map(el->el.getText()).toArray(String[]::new);
        System.out.println(strings);
        for(int i=0;i<strings.length;i++)
            Assert.assertEquals(strings[i],HRMConstatnts.profilePageLabels[i]);
    }

    @Test(priority = 6,groups = {"ui"})
    public void verifyShirtSizeSelectBox(){
        //element treba da postane clickable u nekom trenutku
        WebElement clickEl=driver.findElement(By.xpath(HRMConstatnts.othersSectionEditXPath));
        clickEl.click();
        driver.findElement(By.cssSelector("#select_value_label_51")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_option_189")));
        driver.findElement(By.id("select_option_189")).click();
        driver.findElement(By.xpath(HRMConstatnts.othersSectionConfrimXPath)).click();
        By eli1=By.xpath("/html/body/main/hrm-app/div/main/ui-view/hrm-employee-details/div[2]/hrm-employee-profile/div/div[7]/hrm-employee-other/form/hrm-employee-card/div/div[2]/div/div[2]/div[1]/md-input-container/md-select/md-select-value/span[1]/div");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(eli1));
        WebElement el1=driver.findElement(eli1);
        String actualResult=el1.getText();
        Assert.assertEquals("M",actualResult);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    @Test(priority = 7,groups = {"ui"})
    public void verifyGlassesInputField(){
        WebElement clickEl=driver.findElement(By.xpath(HRMConstatnts.othersSectionEditXPath));
        clickEl.click();
        driver.findElement(By.cssSelector("#select_value_label_52")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_option_195")));
        driver.findElement(By.id("select_option_195")).click();
        driver.findElement(By.xpath(HRMConstatnts.othersSectionConfrimXPath)).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/hrm-app/div/main/ui-view/hrm-employee-details/div[2]/hrm-employee-profile/div/div[7]/hrm-employee-other/form/hrm-employee-card/div/div[2]/div/div[3]/div[1]/md-input-container/md-select/md-select-value/span[1]/div")));
        WebElement element=driver.findElement(By.xpath("/html/body/main/hrm-app/div/main/ui-view/hrm-employee-details/div[2]/hrm-employee-profile/div/div[7]/hrm-employee-other/form/hrm-employee-card/div/div[2]/div/div[3]/div[1]/md-input-container/md-select/md-select-value/span[1]/div"));
        String actualResult=element.getText();
        Assert.assertEquals("No",actualResult);

    }
    @Test(priority = 1,groups = {"ui"})
    public void verifyAddChild(){
        int previousNumberOfChildren=driver.findElements(By.cssSelector("#children > form > hrm-employee-card > div > div.employee-card__content > div.flex-grid.ng-scope  ")).size();
        WebElement clickEl=driver.findElement(By.xpath(HRMConstatnts.childrenSectionEditXPath));
        clickEl.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addChild")));
        WebElement addChildButton=driver.findElement(By.id("addChild"));
        addChildButton.click();
        List<WebElement> elements=driver.findElements(By.cssSelector("#children > form > hrm-employee-card > div > div.employee-card__content > div.flex-grid.ng-scope  "));
        WebElement divElement=elements.get(elements.size()-1);
        List<WebElement> inputElements=divElement.findElements(By.tagName("input"));
        WebElement selectElement=divElement.findElement(By.cssSelector("md-select"));
        WebElement selectElementOption=divElement.findElement(By.cssSelector("md-option"));
        inputElements.get(0).click();
        inputElements.get(0).sendKeys("Petar Petrovic");
        selectElement.click();
        selectElementOption.click();
        inputElements.get(1).click();
        inputElements.get(1).sendKeys("1111111111111");
        inputElements.get(2).click();
        inputElements.get(2).sendKeys("02-Feb-2005");
        inputElements.get(2).sendKeys(Keys.TAB);
        WebElement confirmElement=driver.findElement(By.xpath(HRMConstatnts.childrenSectionConfrimXPath));
        confirmElement.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HRMConstatnts.childrenSectionEditXPath)));
        int currentNumberOfChildren=driver.findElements(By.cssSelector("#children > form > hrm-employee-card > div > div.employee-card__content > div.flex-grid.ng-scope  ")).size();
        Assert.assertEquals(previousNumberOfChildren+1,currentNumberOfChildren);
    }
    @Test(priority = 2,groups = {"ui"})
    public void verifyRemoveChild(){
        //prethodno dete koje smo dodali njega cemo da izbacimo
        int previousNumberOfChildren=driver.findElements(By.cssSelector("#children > form > hrm-employee-card > div > div.employee-card__content > div.flex-grid.ng-scope  ")).size();
        WebElement clickEl=driver.findElement(By.xpath(HRMConstatnts.childrenSectionEditXPath));
        clickEl.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addChild")));
        WebElement buttonElement=driver.findElement(By.cssSelector(".hrmFamilyMember__button"));
        buttonElement.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.hrm-modal")));
        WebElement modalFormConfirmButton=driver.findElements(By.cssSelector("div.hrm-modal button")).get(1);
        modalFormConfirmButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HRMConstatnts.childrenSectionConfrimXPath)));
        WebElement confirmElement=driver.findElement(By.xpath(HRMConstatnts.childrenSectionConfrimXPath));
        confirmElement.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HRMConstatnts.childrenSectionEditXPath)));
        int currentNumberOfChildren=driver.findElements(By.cssSelector("#children > form > hrm-employee-card > div > div.employee-card__content > div.flex-grid.ng-scope  ")).size();
        Assert.assertEquals(previousNumberOfChildren-1,currentNumberOfChildren);
    }
    private void removeAllChildren() throws InterruptedException {

        WebElement clickEl=driver.findElement(By.xpath(HRMConstatnts.childrenSectionEditXPath));
        clickEl.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addChild")));
        int size=driver.findElements(By.cssSelector(".hrmFamilyMember__button")).size();
        int preSize=size;
        while(size!=0){
            WebElement button=driver.findElement(By.cssSelector(".hrmFamilyMember__button"));
            button.click();
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.hrm-modal")));
            WebElement modalFormConfirmButton=driver.findElements(By.cssSelector("div.hrm-modal button")).get(1);
            modalFormConfirmButton.click();
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HRMConstatnts.childrenSectionConfrimXPath)));
            size--;
        }
        WebElement confirmElement=driver.findElement(By.xpath(HRMConstatnts.childrenSectionConfrimXPath));
        confirmElement.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HRMConstatnts.childrenSectionEditXPath)));
        if(preSize!=0){
            driver.navigate().refresh();
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leave-management-tab")));

        }


    }
    //.hrmFamilyMember__button
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
