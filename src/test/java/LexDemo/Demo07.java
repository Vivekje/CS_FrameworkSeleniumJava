package LexDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Demo07 {
	@Test
	public void user() {
		// Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a
		// reference variable created above.
		response = RestAssured.get("https://localhosts.mobi/8080");

		// First get the JsonPath object instance from the Response interface
	
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		// Then simply query the JsonPath object to get a String value of the node
		// specified by JsonPath: doctorName (Note: You should not put $. in the Java code)
		String name = jsonPathEvaluator.get("doctorName");
		
		// Print the name variable to see what we got
		System.out.println("Name of the doctor is: " + name);
		
		// Validating the account holder name
		Assert.assertEquals(name /* actual value */, "John"/* Expected Value */,"Incorrect account holder name");
	}
}

