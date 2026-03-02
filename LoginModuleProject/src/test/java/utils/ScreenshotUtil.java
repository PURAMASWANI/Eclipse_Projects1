package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Add timestamp to avoid overwrite
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            String path = System.getProperty("user.dir")
                    + "/screenshots/" + testName + "_" + timeStamp + ".png";

            FileUtils.copyFile(source, new File(path));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}