package EndtoEndAutomation.DriversSUp.Base;


import org.openqa.selenium.support.PageFactory;


//import EndtoEndAutomation.DriversSUp.Base.basepage;
//import EndtoEndAutomation.Tests.Utilities.logutility;

public abstract class basepage { //abstract class part of all the classes

    public basepage() {
        PageFactory.initElements(drivercontext.Driver,this);


        //logutility

    }


}
