package EndtoEndAutomation.Tests.Utilities;

import EndtoEndAutomation.DriversSUp.Base.drivercontext;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void getScreenShots(String result) throws IOException  // camel casing method name static to  be used by other classes
    {

        File src= ((TakesScreenshot)drivercontext.Driver).getScreenshotAs(OutputType.FILE); //stored in virtual memory
        FileUtils.copyFile(src, new File("src/main/java/EndtoEndAutomation.Tests.Screenshots/"+result+"HighlightScreenshot.png"));//is saved in local drive with source variable
        //added io exception
        System.out.println("screenshot saved");
    }

}
