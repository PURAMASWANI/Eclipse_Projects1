package utils;

import org.testng.*;
import utils.ScreenshotUtil;
import base.DriverFactory;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(
                DriverFactory.getDriver(),
                result.getName()
        );
    }
}