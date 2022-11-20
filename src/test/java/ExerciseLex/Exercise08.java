package ExerciseLex;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Exercise08 {

	Response response;
	@Test
	public void test() {
	response=RestAssured.get("https://localhosts.mobi/8080");
	
	int statusCode=response.getStatusCode();
	String contentType=response.getContentType();
	System.out.println(statusCode);
	System.out.println(contentType);
	
	
	Assert.assertEquals(statusCode, 200);
	Assert.assertEquals(contentType,"text/html; charset=UTF-8");
	}
}
















