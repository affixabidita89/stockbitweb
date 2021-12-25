package steps;

import org.junit.Before;
import utils.SeleniumDriver;

public class BeforeActions {
@Before
    public static void setUp(){
        SeleniumDriver.setUpDriver();
    }

}
