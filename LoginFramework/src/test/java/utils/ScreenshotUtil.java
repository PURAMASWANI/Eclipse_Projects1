//package utils;

//public class ScreenshotUtil {
	package utils;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.*;
	import org.apache.commons.io.FileUtils;

	public class ScreenshotUtil {

	    public static void captureScreenshot(WebDriver driver, String testName) {

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        String path = System.getProperty("user.dir")
	                + "/screenshots/" + testName + ".png";

	        File destination = new File(path);

	        try {
	            FileUtils.copyFile(source, destination);
	            System.out.println("Screenshot saved at: " + path);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

//}
