package TOOLSTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolContentTypeDemo06 {
@Test
public void setup() {
	RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
	RequestSpecification httpRequest=RestAssured.given();
	Response response=httpRequest.get();
	String contentType=response.header("Content-Type");
	Assert.assertEquals(contentType, "application/json; charset=utf-8");
	System.out.println("Content Type : " +contentType);
	
	String serverHeader=response.header("Server");
	System.out.println("Server Header :" +serverHeader);
	String contentEncodingHeader=response.header("Content-Encoding");
	System.out.println("Content Ecoding header : " +contentEncodingHeader);
	
	Assert.assertEquals(serverHeader, "nginx/1.17.10 (Ubuntu)", "Server header return");
	
}
}
