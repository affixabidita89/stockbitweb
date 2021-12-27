package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //init Webdriver
    private static WebDriver driver;

    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private SeleniumDriver(){
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));

    }

//    public static void initDriver(){
//        final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
//        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//    }

//    public static void openBrowser(){
//        final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
//        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    public static void openPage(String url){
        System.out.println("....halo");
        driver.get(url);
        System.out.println("check "+url);
    }

    public static String getURLPage(){
        driver.getCurrentUrl();
        return null;
    }

    public static WebDriver getDriver(){

        return driver;
    }

    public static void setUpDriver(){
        if(seleniumDriver==null){
            seleniumDriver = new SeleniumDriver();
        }
    }
    public static void tearDown(){
        if (driver !=null){
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

//    public static Click(String test){
//        driver.findElement();
//    }

}
