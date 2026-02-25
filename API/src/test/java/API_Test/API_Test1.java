package API_Test;
 
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
 
public class API_Test1
{
 
	@Test
	
	public void getUserTest()
	{
			given()
			.when().get("https://dummyjson.com/products")
			.then()
			.statusCode(200)
			.body("data.id", equalTo(2));
		
	}
	
}