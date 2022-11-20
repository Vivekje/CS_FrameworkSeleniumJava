package LexDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo02{
	@Test
	public void test01() {

		// Specify the base URL to the RESTful web service
		RestAssured.baseURI="https://reqres.in/api/users?page=2";

		// Get the RequestSpecification of the request that you want to sent to the server. 
		//The server is specified by the BaseURI that we have specified in the above step.
		RequestSpecification httpRequest=RestAssured.given();
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response=httpRequest.request(Method.GET,"/byId?doctorId=1001");

		//print the message body of the response received from the server
		String Rest=response.getBody().asString();
		System.out.println(Rest);
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}
}