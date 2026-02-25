package Selenium_Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_Website_UC {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("official website of Selenium");
		driver.findElement(By.name("q")).submit();
		//try {
		Thread.sleep(3000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		driver.quit();
		
		
	}

}
