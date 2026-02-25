package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open upload website
        driver.get("https://the-internet.herokuapp.com/upload");

        Thread.sleep(2000);
        
        driver.findElement(By.id("file-upload"))
              .sendKeys("C:\\Users\\aswin\\Downloads\\Aswani_Puram-1.pdf");

        Thread.sleep(2000);

        // Click upload button
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);

        System.out.println("Resume Uploaded Successfully!");

        driver.quit();
    }
}
