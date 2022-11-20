package LexDemo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Demo08 {
	@Test
	  public void f() {
		
		//Create a reference for Response interface
	    Response response;
	    
		// Make a request to the server by specifying the method type and the method URL.
		// This will return the response from the server. Store the response in the reference variable created above.
	    response = RestAssured.get("https://localhosts.mobi/8080");
	    
	    String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);	  
	}
}


