package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolsDemo01 {
	@Test
	public void test() {
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";

		RequestSpecification httpRequest=RestAssured.given();

		Response response=httpRequest.request(Method.GET,"");
		System.out.println(response.getBody().toString());
		System.out.println("---------------");
		System.out.println(response.getBody().asString());
		System.out.println("---------------");
		System.out.println(response.toString());
		System.out.println("---------------");
		System.out.println(response.getBody());
		System.out.println("---------------");
		System.out.println(response.asString());
		System.out.println("---------------");
		System.out.println("Status received => " + response.getStatusLine());
		System.out.println("---------------");
		System.out.println(response.getStatusLine());
		System.out.println("---------------");
		System.out.println("Response=>" + response.prettyPrint());
	}
}