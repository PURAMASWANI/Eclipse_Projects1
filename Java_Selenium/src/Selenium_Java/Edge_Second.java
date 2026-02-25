package Selenium_Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Second {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver","C:/Users/aswin/OneDrive/Desktop/Selinium_Wipro/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.google.com");r.get(\"https://www.google.com\");
		driver.get("https://www.google.com");
		System.out.println("Title " + driver.getTitle());
		driver.quit();
	}
	

}
