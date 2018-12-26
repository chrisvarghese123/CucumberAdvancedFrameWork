package EndtoEndAutomation.Tests;

import EndtoEndAutomation.DriversSUp.Base.basebrowser;
import EndtoEndAutomation.DriversSUp.Base.drivercontext;
import EndtoEndAutomation.DriversSUp.Pages.MainPage;
import EndtoEndAutomation.DriversSUp.Pages.homepage;
import EndtoEndAutomation.DriversSUp.Pages.landingpage;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends basebrowser {


    @BeforeTest
    public void startupDude() throws IOException {
        basebrowser.initializeBrowser();
    }

    @Test(groups = {"Primary"})
    public void LogintotheApplication() throws IOException {

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


        Assert.assertTrue(home.LoginLogo.isDisplayed()); //verify display of logo

        String Moto = home.LoginBanner.getText();
        System.out.println("The Banner has a moto: " + Moto);
        Assert.assertTrue(Moto.contains("TEST"));

        Assert.assertTrue(home.loginbutton.isDisplayed());
        home.loginbutton.click();

    }

    @Test (groups = {"Primary"})
    public void EnterCredentials() {

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

    }

@Test (groups = {"primary"})
    public void Mainpagecheck(){
    MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.Logo.isDisplayed());
}

    @AfterTest
    public void teardown() {

     //   drivercontext.Driver.quit();
    }


}
