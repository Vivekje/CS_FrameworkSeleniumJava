package stepbystep;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
public class Test_GET03 {

@Test
public void test() {
	given().
	get("https://reqres.in/api/users?page=2").
	then().
	statusCode(200).
	body("data.id[1]", equalTo(8)).
	body("data.first_name", hasItems("Michael","Lindsay"));
}
}
