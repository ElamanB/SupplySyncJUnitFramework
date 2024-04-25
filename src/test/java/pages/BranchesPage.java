package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BranchesPage {
    public BranchesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
