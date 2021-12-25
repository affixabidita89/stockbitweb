package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.LoginpageLocators;
import utils.SeleniumDriver;

public class StockbitLoginPageAction {

    LoginpageLocators loginpageLocators = null;

    public StockbitLoginPageAction(){
        this.loginpageLocators = new LoginpageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),loginpageLocators);
    }

    //check URL
    public void PageURL(){
        SeleniumDriver.getURLPage();
        System.out.println("check : "+SeleniumDriver.getURLPage());
    }

    public void selectUsername(String username){
        Select selectUsername = new Select(LoginpageLocators.Username);
        selectUsername.selectByValue(username);
    }

    public void selectPassword(String password){
        Select selectPassword = new Select(LoginpageLocators.Password);
        selectPassword.selectByValue(password);

    }

    public void clickLoginButton(){
        loginpageLocators.loginButton.click();
    }

}
