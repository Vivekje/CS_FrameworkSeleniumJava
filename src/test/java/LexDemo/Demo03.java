package LexDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo03 {
	//Create a reference for Response interface
	Response response;

	@Test
	public void test01() {

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response=RestAssured.get("https://reqres.in/api/users?page=2");

		//to get last received session id from the server and print the value returned
		String sessionId=response.getSessionId();
		System.out.println("Session Id :"+sessionId);

		//to get the value of the content-type header field and print the value returned
		String contentType=response.getContentType();
		System.out.println("Content Type : "+contentType);
	}
}
