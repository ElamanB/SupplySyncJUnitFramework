package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MastersPage {

    public MastersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
