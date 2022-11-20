package LexDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Demo01 {

	//Create a reference for Response interface
	Response response;
	@Test
	void test01() {

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response =RestAssured.get("https://reqres.in/api/users?page=2");

		//print the message body of the response received from the server
		ResponseBody body=response.getBody();
		String Rest=body.asString();
		System.out.println(Rest);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
	}
}