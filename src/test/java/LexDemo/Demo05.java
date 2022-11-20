package LexDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo05 {

	Response response;
	
	@Test
	public void test() {
		response=RestAssured.get("https://reqres.in/api/users?page=2");
		Headers allHeader=response.getHeaders();
		for(Header header: allHeader) {
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
	}
}
