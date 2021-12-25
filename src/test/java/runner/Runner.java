package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",
        glue= {"StepDefinition"},
        plugin ={"json:target/cucumber.json"})

public class Runner {


}
