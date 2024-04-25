package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegionsPage {

    public RegionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
