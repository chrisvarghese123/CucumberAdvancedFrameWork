package EndtoEndAutomation.DriversSUp.Pages;

import EndtoEndAutomation.DriversSUp.Base.basepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class landingpage extends basepage {

    public landingpage() {
        }  //Empty Constructor

    @FindBy(how = How.CSS, using = "#user_email")
    public WebElement usernamefield;

        @FindBy(how = How.CSS, using = "#user_password")
        public WebElement Passwordfield;

        @FindBy(how = How.CSS, using = "div.form-group:nth-child(4) > label.control-label")
        public WebElement Usernamefieldtxt;

        @FindBy(how = How.CSS, using = "div.form-group:nth-child(5) > label.control-label")
        public WebElement Passwordfieldtxt;


        @FindBy(how = How.CSS, using = "input.btn.btn-primary.btn-md.login-button")
        public WebElement Loginbutton;




    public WebElement getUsernamefield() {
        return usernamefield;
    }
    public WebElement getLoginbutton() {
        return Loginbutton;
    }

        public WebElement getPasswordfield() {
            return Passwordfield;
        }
        public WebElement getUsernamefieldtxt() {
            return Usernamefieldtxt;
        }

       public WebElement getPasswordfieldtxt() {
            return Passwordfieldtxt;
        }


}
