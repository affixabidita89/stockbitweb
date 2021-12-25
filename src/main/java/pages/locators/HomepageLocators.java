package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomepageLocators {

    @FindBy(how = How.LINK_TEXT,using="Investing")
    public WebElement investingLink;

    @FindBy(how = How.LINK_TEXT,using="Pro Tools")
    public WebElement proToolsLink;

    @FindBy(how = How.LINK_TEXT,using="Academy")
    public WebElement academyLink;

    @FindBy(how = How.LINK_TEXT,using="Blog")
    public WebElement blogLink;

    @FindBy(how = How.LINK_TEXT,using="Help")
    public WebElement helpLink;

    @FindBy(how = How.LINK_TEXT,using="Sign Up")
    public WebElement signUpLink;

    @FindBy(linkText = "Log In")
    public WebElement loginLink;

//    public void ClickOnLogin(){
//        loginLink.click();
//    }

}
