/*package utils;

public class TestListener {

}*/
package utils;

import org.testng.*;
import base.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(
                BaseTest.driver,
                result.getName());
    }
}
