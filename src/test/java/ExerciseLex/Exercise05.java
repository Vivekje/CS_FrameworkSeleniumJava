package ExerciseLex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Exercise05 {
	Response response;
	@Test
	public void test() {
		response=RestAssured.get("https://localhosts.mobi/8080");
		String contentType=response.header("Content-Type");
		System.out.println("Content_Type Values : " +contentType);
		
		String date=response.header("Date");
		System.out.println("Date Headers : " +date);
	}
}