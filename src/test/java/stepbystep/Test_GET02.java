package stepbystep;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
public class Test_GET02 {
Response response;
@Test
public void test1() {
	given().
	get("https://reqres.in/api/users?page=2").
	then().
	statusCode(200).
	body("data.id[1]", equalTo(8)).
	log().all();
  }
}
