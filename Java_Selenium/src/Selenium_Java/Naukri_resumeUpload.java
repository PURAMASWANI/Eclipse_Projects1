package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_resumeUpload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Naukri login page
        driver.get("https://www.naukri.com/nlogin/login");

        System.out.println("Please login manually within 30 seconds...");

        // Wait for manual login
        Thread.sleep(30000);  

        // Go to profile page
        driver.get("https://www.naukri.com/mnjuser/profile");

        Thread.sleep(5000);

        // Click Update Resume button
        driver.findElement(By.xpath("//input[@type='file']"))
              .sendKeys("C:\\Users\\aswin\\Downloads\\Aswani_Puram-1.pdf");

        Thread.sleep(5000);

        System.out.println("Resume Uploaded Successfully!");

        driver.quit();
    }
}
