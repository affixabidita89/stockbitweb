package steps;

import org.junit.After;
import utils.SeleniumDriver;

public class AfterActions {
    @After
    public static void tearDown(){
        SeleniumDriver.tearDown();
    }
}
