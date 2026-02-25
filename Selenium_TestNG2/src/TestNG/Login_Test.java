package TestNG;
import org.openqa.selenium.WebDriver;
import org.testing.annotations.chrome.ChromeDriver;
import org.testing.annotations.BeforeClass;
import org.testing.annotations.AfterClass;
import org.testing.annotations.DataProvider;
import org.testing.annotations.Test;

public class Login_Test {
	@Test(dataProvider="loginData")
	public void loginTest(String username, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomtion.com/practice-test-login);"
        driver.findElement(By.id("Username")).sendKeys("username");
        driver.findElement(By.id("Password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        driver.quit();
	
	}
	@DataProvider(name="loginData")
	public Object[][] getData()
	{
		return new Object[][]
				{
			         {"user1","pass1"},
			         {"user2","pass2"},
			         {"user3","pass3"}
				};
	}

}
