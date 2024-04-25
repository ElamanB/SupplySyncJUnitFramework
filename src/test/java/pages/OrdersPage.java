package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrdersPage {
    public OrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
