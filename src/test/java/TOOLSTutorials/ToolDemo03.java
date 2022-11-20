package TOOLSTutorials;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolDemo03 {
@Test
public void stup() {
	RestAssured.baseURI="https://demoqa.com";
	RequestSpecification httpRequest=RestAssured.given();
	Response response=httpRequest.request(Method.GET, "/BookStore/v1/Books");
	System.out.println(response.asString());
	System.out.println("--------------------------------");
	System.out.println(response.asPrettyString());
	System.out.println("--------------------------------");
	System.out.println(response.prettyPrint());
}
}
