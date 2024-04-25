package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TariffsPage {

    public TariffsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
