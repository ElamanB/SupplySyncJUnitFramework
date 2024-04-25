package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CommonPage {

    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='sc-nVkyK dGprtm MuiList-root MuiList-padding sc-hYQoXb cdcgTu']/div")
    public List<WebElement> sideBar;

    @FindBy(linkText = "Companies")
    public WebElement companiesTab;

    @FindBy(linkText = "Branches")
    public WebElement branchesTab;

    @FindBy(linkText = "Masters")
    public WebElement mastersTab;

    @FindBy(linkText = "Tariffs")
    public WebElement tariffsTab;

    @FindBy(linkText = "Orders")
    public WebElement ordersTab;

    @FindBy(linkText = "Regions")
    public WebElement regionsTab;

    @FindBy(css = "button[aria-label='Account settings']")
    public WebElement administratorButton;

    @FindBy(xpath = "//li[text()='Exit']/../..")
    public WebElement exitButton;

    @FindBy(xpath = "//button[text()='Exit']")
    public WebElement exitConfirmButton;

    @FindBy(xpath = "//button[text()='Cancer']")
    public WebElement exitCancelConfirmButton;


}
