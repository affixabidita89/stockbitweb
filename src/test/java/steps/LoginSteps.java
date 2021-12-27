package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.actions.StockbitHomePageAction;
import pages.actions.StockbitLoginPageAction;
import pages.actions.StockbitStreamPageAction;
import pages.locators.HomepageLocators;
import utils.SeleniumDriver;

public class LoginSteps {

    StockbitHomePageAction stockbitHomePageAction = new StockbitHomePageAction();
    StockbitLoginPageAction stockbitLoginPageAction = new StockbitLoginPageAction();
    StockbitStreamPageAction stockbitStreamPageAction = new StockbitStreamPageAction();
    SeleniumDriver driver;
//    @Given("I am on {string} the Home Page of Stockbit.com")
//    public void iAmOnTheHomePageOfStockbitCom(String websiteURL) {
//        System.out.println("... Test");
//        SeleniumDriver.openBrowser();
//        System.out.println("Test 1");
//        SeleniumDriver.openPage(websiteURL);
//    }

    @Given("I am on \"https:\\/\\/stockbit.com\\/ the Home Page of Stockbit.com")
    public void i_am_on_https_stockbit_com_the_home_page_of_stockbit_com() {
        BeforeActions.setUp();
        System.out.println("... Test");
        SeleniumDriver.openPage("https://stockbit.com/");
    }

    @And("I click Login menu")
    public void iClickLoginMenu() {
//        stockbitHomePageAction.clickLoginMenu();
        HomepageLocators page = PageFactory.initElements(SeleniumDriver.getDriver(),HomepageLocators.class);
        page.LogInButton();
    }

    @Then("I redirected to {string}")
    public void iRedirectedTo(String URL) {
        stockbitLoginPageAction.PageURL();
        Assert.assertEquals(URL,"https://stockbit.com/#/login");
    }

    @And("I enter valid {string} and {string}")
    public void iEnterValidAnd(String username, String password) {
        stockbitLoginPageAction.selectUsername(username);
        stockbitLoginPageAction.selectPassword(password);

    }

    @And("I click Login button")
    public void iClickLoginButton() {
        stockbitLoginPageAction.clickLoginButton();
    }

    @Then("I redirected to {string} stream")
    public void iRedirectedToStream(String URLStream) {
        stockbitStreamPageAction.PageURL();
        Assert.assertEquals(URLStream,"https://stockbit.com/#/stream");
    }


}
