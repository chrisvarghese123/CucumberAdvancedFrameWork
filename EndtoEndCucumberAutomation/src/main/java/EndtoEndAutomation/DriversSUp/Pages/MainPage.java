package EndtoEndAutomation.DriversSUp.Pages;

import EndtoEndAutomation.DriversSUp.Base.basepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends basepage {

    public MainPage() {
    }

    @FindBy(how = How.CSS, using = "#navbar > div > div > a > img")
    public WebElement Logo;


    @FindBy(how = How.CSS, using = "#navbar > div > div > button")
    public WebElement OptionButton;

    public WebElement getLogo() {
        return Logo;
    }

    public WebElement getOptionButton() { return OptionButton; }


}
