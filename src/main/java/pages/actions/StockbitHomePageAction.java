package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HomepageLocators;
import utils.SeleniumDriver;

public class StockbitHomePageAction {

    HomepageLocators homepageLocators=null;

    public StockbitHomePageAction(){
        this.homepageLocators=new HomepageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homepageLocators);

    }

    public void clickInvestingMenu(){
        homepageLocators.investingLink.click();
    }

    public void clickProToolsMenu(){
        homepageLocators.proToolsLink.click();
    }

    public void clickAcademyMenu(){
        homepageLocators.academyLink.click();
    }

    public void clickBlogMenu(){
        homepageLocators.blogLink.click();
    }

    public void clickHelpMenu(){
        homepageLocators.helpLink.click();
    }


    public void clickSignUpMenu(){
        homepageLocators.signUpLink.click();
    }

    public void clickLoginMenu(){
        System.out.println("ada d homepage action klik login menu");
        System.out.println(homepageLocators);
//        homepageLocators.ClickOnLogin();
        homepageLocators.loginLink.click();

    }

}
