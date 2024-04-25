package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class CommonPageTests {

    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();
    @Test
    public void test1() {
        driver = Driver.getDriver();
        driver.get(Config.getProperty("supplySync"));
        loginPage.emailInputField.sendKeys(Config.getProperty("supplySyncEmail"));
        loginPage.passwordInputField.sendKeys(Config.getProperty("supplySyncPassword"));
        loginPage.signInButton.click();

        commonPage.branchesTab.click();
        commonPage.mastersTab.click();
        commonPage.tariffsTab.click();
        commonPage.ordersTab.click();
        commonPage.regionsTab.click();
        commonPage.companiesTab.click();


    }
}
