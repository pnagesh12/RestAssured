package assignment2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class POST {
	@Test
	public static void test1() {
		

		
	Response res =	given().
				header("Content-Type","application/json").
//				body("{\r\n"
//						+ "    \"name\": \"morpheus\",\r\n"
//						+ "    \"job\": \"leader\"\r\n"
//						+ "}").
		when().
				post("https://reqres.in/ap/users").
				
		then().
				statusCode(404).
				log().all().extract().response();
		}
}