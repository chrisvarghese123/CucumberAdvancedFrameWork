package EndtoEndAutomation.DriversSUp.Runner;

//import org.junit.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\EndtoEndAutomation\\DriversSUp\\Features", glue = "EndtoEndAutomation.DriversSUp.StepDefs")
public class ChromeRunner {


}
