package LexDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo04 {
Response response;
@Test
public void test01() {
	response=RestAssured.get("https://reqres.in/api/users?page=2");
	
	 //To retrieve response status from the server and print the returned value.
    int statusCode = response.getStatusCode();
	System.out.println("Status Code: "+statusCode );
	
	//To retrieve status line of the response from the server and print the returned value.
	String statusLine = response.getStatusLine();
	System.out.println("Status Line: "+statusLine );

}
}
