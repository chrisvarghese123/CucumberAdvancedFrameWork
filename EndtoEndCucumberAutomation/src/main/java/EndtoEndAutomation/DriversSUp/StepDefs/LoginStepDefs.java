package EndtoEndAutomation.DriversSUp.StepDefs;

import EndtoEndAutomation.DriversSUp.Base.ExtentReporterNG;
import EndtoEndAutomation.DriversSUp.Base.basebrowser;
import EndtoEndAutomation.DriversSUp.Base.drivercontext;
import EndtoEndAutomation.DriversSUp.Pages.MainPage;
import EndtoEndAutomation.DriversSUp.Pages.homepage;
import EndtoEndAutomation.DriversSUp.Pages.landingpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//import static java.EndtoEndAutomation.Tests.Utilities.*;
//import static test.java.EndtoEndAutomation.Tests.Utilities;

import static EndtoEndAutomation.DriversSUp.Base.ExtentReporterNG.reporter;

public class LoginStepDefs extends basebrowser {
    @Given("^User is on the homepage$")
    public void user_is_on_the_homepage() throws Throwable {
        basebrowser.initializeBrowser();
        System.out.println("User is on Homepage");

        ExtentReports extent = ExtentReporterNG.extent;
        extent.attachReporter(reporter);
        ExtentTest ExtentLogger = extent.createTest("Login test");

        ExtentLogger.log(Status.INFO, "Login to QA click academy");
        ExtentLogger.log(Status.PASS, "Logged in to QA click academy");

        extent.flush();
        String url = basebrowser.pro.getProperty("url");
        System.out.println("the pro url is : " + url);
        drivercontext.Driver.get(url);
        homepage home = new homepage();
        logger.info("Opened http://www.qaclickacademy.com/ ");

        Assert.assertTrue(home.LoginLogo.isDisplayed()); //verify display of logo

        String Moto = home.LoginBanner.getText();
        System.out.println("The Banner has a moto: " + Moto);
        Assert.assertTrue(Moto.contains("TEST"));

        Assert.assertTrue(home.loginbutton.isDisplayed());

        ExtentLogger.log(Status.INFO, "Login button loaded to QA click academy");
        ExtentLogger.log(Status.PASS, "Log in button loaded to QA click academy");

        extent.flush();


        if (home.Popup.isDisplayed()) {
            System.out.println("The popup is displayed");
//            EndtoEndAutomation.Tests.Utilities.TakeScreenshot.getScreenShots("popup");
            home.PopupCross.click();
  //          EndtoEndAutomation.Tests.Utilities.TakeScreenshot.getScreenShots("popupclosed");
        }

        home.loginbutton.click();

//        Assert.assertTrue(home.loginbutton.isDisplayed()); //fail test to see the screenshot on error from listener!!!




    }

    @When("^User logs in with valid  \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void user_logs_in_with_valid_something_and_something_credentials(String Username, String Password) throws Throwable {
        System.out.println("init parameters are " + Username + Password);
        Username = pro.getProperty("username");
        Password = pro.getProperty("password");
        System.out.println("Entering Credentials");
        System.out.println("property parameters are " + Username + Password);

///////////
        logger.info("Entering Credentials");

        landingpage Landingpage = new landingpage();

        String uname = pro.getProperty("username");
        String pword = pro.getProperty("password");
        System.out.println("Entering Credentials");

        String Usernamefieldtxt = Landingpage.Usernamefieldtxt.getText();
        System.out.println("user name field txt is : "+ Usernamefieldtxt);
        Assert.assertEquals(Usernamefieldtxt,"Email Address");

        String Passwordfieldtxt = Landingpage.Passwordfieldtxt.getText();
        System.out.println("user name field txt is : "+ Passwordfieldtxt);


        Assert.assertEquals(Passwordfieldtxt,"Password");
//        Assert.assertEquals(Passwordfieldtxt,"Password23");

        Landingpage.usernamefield.sendKeys(uname);
        Landingpage.Passwordfield.sendKeys(pword);


        Assert.assertTrue(Landingpage.Loginbutton.isDisplayed());

        Assert.assertTrue(Landingpage.Loginbutton.isDisplayed());
        Landingpage.Loginbutton.click();

        logger.info("Entered Credentials and clicking login button");


    }


//    @When("^User logs in with valid credentials$")
//    public void user_logs_in_with_valid_credentials() throws Throwable {
//        System.out.println("User is on cred");
//    }

    @Then("^Welcome page is presented$")
    public void welcome_page_is_presented() throws Throwable {
        System.out.println("User is on page");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.Logo.isDisplayed());
        logger.info("Running mainpage verifications after logging in");

    }

    @And("^The should be able to see all the available login options$")
    public void the_should_be_able_to_see_all_the_available_login_options() throws Throwable {
        System.out.println("User is on final");
        logger.info("Running @AfterTest - teardown method");

        drivercontext.Driver.quit();

    }


}
