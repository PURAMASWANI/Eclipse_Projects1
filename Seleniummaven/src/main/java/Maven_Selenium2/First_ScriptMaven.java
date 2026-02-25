/*package Maven_Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_ScriptMaven {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}*/
package Maven_Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First_ScriptMaven {

    public static void main(String[] args) {

        // Set ChromeDriver path (IMPORTANT: use double \\)
        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\aswin\\OneDrive\\Desktop\\Selinium_Wipro\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Optional Chrome settings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Launch Chrome
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.quit();
    }
}
