package EndtoEndAutomation.Tests;

import EndtoEndAutomation.DriversSUp.Base.ExtentReporterNG;
import EndtoEndAutomation.DriversSUp.Base.basebrowser;
import EndtoEndAutomation.DriversSUp.Base.drivercontext;
import EndtoEndAutomation.DriversSUp.Pages.MainPage;
import EndtoEndAutomation.DriversSUp.Pages.homepage;
import EndtoEndAutomation.DriversSUp.Pages.landingpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static EndtoEndAutomation.DriversSUp.Base.ExtentReporterNG.reporter;
import static EndtoEndAutomation.Tests.Utilities.TakeScreenshot.getScreenShots;

public class Login extends basebrowser {


    @BeforeTest
    public void startupDude() throws IOException {
        basebrowser.initializeBrowser();
    }

    @Test(groups = {"Primary"})
    public void LogintotheApplication() throws IOException {

//
//    ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/autoReport.html");
//
  ExtentReports extent = ExtentReporterNG.extent;
  extent.attachReporter(reporter);
        ExtentTest ExtentLogger = extent.createTest("Login test");

        ExtentLogger.log(Status.INFO, "Login to QA click academy");
        ExtentLogger.log(Status.PASS, "Logged in to QA click academy");

        extent.flush();
//        initializeBrowser();
//        Driver.get("http://www.qaclickacademy.com/");
//basebrowser.initializeBrowser().get("http://www.qaclickacademy.com/");
//        basebrowser.initializeBrowser();//
        String url = basebrowser.pro.getProperty("url");
        System.out.println("the pro url is : " + url);
        //Driver.get(url);
        //Driver.findElement(By.cssSelector(":nth-child(4) a:nth-child(1) > span:nth-child(2)")).click();
        //Driver.findElement(By.cssSelector("div.tools:nth-child(2) div.container-fluid nav.pull-right ul:nth-child(1) li:nth-child(4) a:nth-child(1) > span:nth-child(2)")).click();
        drivercontext.Driver.get(url);
        homepage home = new homepage();
logger.info("Opened http://www.qaclickacademy.com/ ");

        Assert.assertTrue(home.LoginLogo.isDisplayed()); //verify display of logo

        String Moto = home.LoginBanner.getText();
        System.out.println("The Banner has a moto: " + Moto);
        Assert.assertTrue(Moto.contains("TEST"));

        Assert.assertTrue(home.loginbutton.isDisplayed());
        getScreenShots("pass");// test screenshot
//        ExtentTest ExtentLogger = extent.createTest("Login button loaded test");

        ExtentLogger.log(Status.INFO, "Login button loaded to QA click academy");
        ExtentLogger.log(Status.PASS, "Log in button loaded to QA click academy");

        extent.flush();


        if (home.Popup.isDisplayed()) {
    System.out.println("The popup is displayed");
    getScreenShots("popup");
    home.PopupCross.click();
    getScreenShots("popupclosed");
}

        home.loginbutton.click();

//        Assert.assertTrue(home.loginbutton.isDisplayed()); //fail test to see the screenshot on error from listener!!!


    }

    @Test (groups = {"Primary"})
    public void EnterCredentials() {
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

//        ExtentTest ExtentLogger = extent.createTest("Login button loaded test");
//
//        ExtentLogger.log(Status.INFO, "Login button loaded to QA click academy");
//        ExtentLogger.log(Status.PASS, "Log in button loaded to QA click academy");
//
//        extent.flush();

        ExtentReports extent = ExtentReporterNG.extent;
        extent.attachReporter(reporter);
        ExtentTest ExtentLogger = extent.createTest("Login test 2");

        ExtentLogger.log(Status.INFO, "qLogin to QA click academy");
        ExtentLogger.log(Status.PASS, "qLogged in to QA click academy");

        extent.flush();


    }

@Test (groups = {"primary"})
    public void Mainpagecheck(){
    MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.Logo.isDisplayed());
    logger.info("Running mainpage verifications after logging in");

    }

    @AfterTest
    public void teardown() {

        logger.info("Running @AfterTest - teardown method");

     //   drivercontext.Driver.quit();
    }


}
