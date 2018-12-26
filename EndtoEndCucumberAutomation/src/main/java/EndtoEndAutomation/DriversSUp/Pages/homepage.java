package EndtoEndAutomation.DriversSUp.Pages;

import EndtoEndAutomation.DriversSUp.Base.basepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepage extends basepage {

    public homepage() {  //Alt + Insert to add a constructor

    }

    @FindBy(how = How.CSS, using = ":nth-child(4) a:nth-child(1) > span:nth-child(2)")
    public WebElement loginbutton;

    @FindBy(how = How.CSS, using = "img.img-responsive.logo")
    public WebElement LoginLogo;

    @FindBy(how = How.CSS, using = "div.col-sm-6.col-md-8.hidden-xs.video-banner:nth-child(1) > h3:nth-child(1)")
    public WebElement LoginBanner;



    public WebElement getLogin() {
        return loginbutton;
    }

    public WebElement getLoginLogo() {
        return LoginLogo;
    }
    public WebElement getLoginBanner() {
        return LoginBanner;
    }


}

