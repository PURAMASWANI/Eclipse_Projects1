package Test_NG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Run All
public class Selenium_TestNG 
{
	
	@Test
	//Run / Debug
	public void openGoogle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	

}
