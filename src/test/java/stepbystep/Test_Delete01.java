package stepbystep;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Delete01 {
		
		@Test
		public void test() {
		
	when().
	      delete("https://reqres.in/api/users/2").
	then().
	      statusCode(204).log().all();
		}
}
