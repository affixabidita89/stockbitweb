package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.StreampageLocators;
import utils.SeleniumDriver;

public class StockbitStreamPageAction {
    StreampageLocators streampageLocators = null;

    public StockbitStreamPageAction(){
        this.streampageLocators = new StreampageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),streampageLocators);
    }

    public void PageURL(){
        SeleniumDriver.getURLPage();
        System.out.println("check : "+SeleniumDriver.getURLPage());
    }
}
