package TOOLSTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolDemo04 {
	@Test
	public void setup() {

		RestAssured.baseURI="https://demoqa.com";

		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/BookStore/v1/Books");
		System.out.println(response.asPrettyString());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200,"Correct status code returned");
	}
}