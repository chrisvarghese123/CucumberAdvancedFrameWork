package EndtoEndAutomation.DriversSUp.Base;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class basebrowser extends drivercontext{


    public static Logger logger = LogManager.getLogger(EndtoEndAutomation.DriversSUp.Base.basebrowser.class);
    //commenting above line causes the logging not to be recorded?

    //    public static WebDriver Driver;
public static Properties pro = new Properties();


public static WebDriver initializeBrowser() throws IOException {

    FileInputStream fis = new FileInputStream("src\\test\\java\\EndtoEndAutomation\\Tests\\Utilities\\Property.properties");
    pro.load(fis);
String browserName =    pro.getProperty("browser");
System.out.println("the browser is:" +    browserName);
if (browserName.equalsIgnoreCase("Chrome") )
{
    System.setProperty("webdriver.chrome.driver","src\\main\\java\\EndtoEndAutomation\\DriversSUp\\chromedriver.exe");
    //WebDriver
    Driver = new ChromeDriver();
    logger.info("Chrome Browser Instantiated");
    Driver.manage().window().maximize();
logger.info("Maximised the window");
}
else if(browserName.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.firefox.driver","src\\main\\java\\EndtoEndAutomation\\DriversSUp\\Drivers\\geckodriver.exe");
    Driver = new FirefoxDriver();
Driver.manage().window().maximize();
    System.out.println("Dude I am running Firefox!!");

}
else if(browserName.equalsIgnoreCase("IE"))
{
    System.setProperty("webdriver.ie.driver", "src\\main\\java\\EndtoEndAutomation/DriversSUp/Drivers/IEDriverServer.exe");
    Driver = new InternetExplorerDriver();
    Driver.manage().window().maximize();
    System.out.println("Dude I am running IE!!");

}
Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
return Driver;

}
public static void getScreenShots(String result) throws IOException  // camel casing method name static to  be used by other classes
{
 File src= ((TakesScreenshot)drivercontext.Driver).getScreenshotAs(OutputType.FILE); //stored in virtual memory
    FileUtils.copyFile(src, new File("src/main/java/EndtoEndAutomation.Tests.Screenshots/"+result+"HighlightScreenshot.png"));//is saved in local drive with source variable
    //added io exception

}

}
