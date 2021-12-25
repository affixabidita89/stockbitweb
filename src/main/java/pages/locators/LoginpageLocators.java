package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginpageLocators {
    @FindBy(how = How.ID,using="username")
    public static WebElement Username;

    @FindBy(how = How.ID,using="password")
    public static WebElement Password;

    @FindBy(how = How.ID,using="loginbutton")
    public WebElement loginButton;

}
