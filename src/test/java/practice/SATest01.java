package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SATest01 {

	@Test
	public void setup() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET);
		ResponseBody body=response.getBody();
		String rest=body.asString();
		System.out.println(rest);
		System.out.println("-------------------");
		System.out.println(response.prettyPrint());
	}
}
