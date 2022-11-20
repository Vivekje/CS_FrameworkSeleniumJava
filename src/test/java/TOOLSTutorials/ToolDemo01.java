//Use the RestAssured class to generate a RequestSpecification for the URL:  https://demoqa.com/BookStore/v1/Books
//Specify the HTTP Method type (GET method).
//Send the Request to the server.
//Get the Response back from the server.
//Print the returned Response’s body.
//

package TOOLSTutorials;


	import org.testng.annotations.Test;

import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	public class ToolDemo01 {
	 @Test
	public void GetBooksDetails() { 
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// specify the method type (GET) and the parameters if any. 
		//In this case the request does not take any parameters 
		Response response = httpRequest.request(Method.GET, "");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	    	
	}
	}

