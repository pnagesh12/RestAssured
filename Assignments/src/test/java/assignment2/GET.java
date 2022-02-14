package assignment2;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GET {
	@Test
	public void test_01() {
	Response res =	given().
				header("Content-Type", "application/JSON").
		when().
				get("https://reqres.in/api/users?page=2").
		then().
				statusCode(200).
				log().all().
				extract().response();
	}

}
