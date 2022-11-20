package ExerciseLex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class Exercise04 {
	Response response;
	@Test
	public void test() {

		response=RestAssured.get("https://localhosts.mobi/8080");
		Headers headers=response.getHeaders();
		for(Header header: headers) {
			System.out.println("Key : "+header.getName() + "Values :" +header.getValue() );
		}

	}
}