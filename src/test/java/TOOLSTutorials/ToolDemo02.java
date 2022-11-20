package TOOLSTutorials;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolDemo02 {
Response response;
@Test
public void test() {
	RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
	RequestSpecification httpRequest=RestAssured.given();
	response=httpRequest.get("");
	System.out.println(response.asString());
	System.out.println("-----------------------------");
	System.out.println(response.prettyPrint());
}
}
