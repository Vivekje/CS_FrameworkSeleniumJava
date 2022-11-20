package LexDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Demo09 {
Response response;
@Test
public void test() {
	response=RestAssured.get("https://reqres.in/api/users");
	String rest=response.getBody().asString();
	//String rest1=rest.asString();
   // String rest2=rest.toString();
    System.out.println("--------------------------");
	System.out.println(rest);
	System.out.println("--------------------------");
//	System.out.println(rest1);
//	System.out.println("--------------------------");
//	System.out.println(rest2);
	System.out.println("--------------------------");
	int statusCode=response.getStatusCode();
	String statusLine=response.getStatusLine();
	String contentType=response.getContentType();
	 
	
	System.out.println(statusCode);
	System.out.println(statusLine);
	System.out.println(contentType);
	System.out.println("--------------------------");
	
	Assert.assertEquals(statusCode, 200);
	Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
	Assert.assertEquals(contentType,"application/json; charset=utf-8");
	Assert.assertEquals(rest.contains("Michael"), false);
	//Assert.assertEquals(rest.contains("Lindsay") /*Expected value*/, true /*Actual Value*/, "Response body does not contain Michael");
}
}
