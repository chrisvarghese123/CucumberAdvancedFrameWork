package EndtoEndAutomation.Tests;

import EndtoEndAutomation.DriversSUp.Base.basebrowser;
import EndtoEndAutomation.DriversSUp.Pages.MainPage;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopNavigation extends basebrowser {
//public class ShopNavigation extends Login {

@Test (groups = {"Primary"})
    public void ShopNav()
{

    System.out.println("This is a TEST");
    MainPage mainPage = new MainPage();
    Dimension d= new Dimension(640,480);
//    Driver.manage().window().maximize();
//    Driver.manage().window().setSize(782,831);
    Driver.manage().window().setSize(d);

    logger.info("halved the window width to verify option button");


    Assert.assertTrue(mainPage.OptionButton.isDisplayed());
    logger.info("OptionButton verification post login");

}

}
