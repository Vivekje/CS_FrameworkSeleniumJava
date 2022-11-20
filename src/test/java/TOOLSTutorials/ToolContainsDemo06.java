package TOOLSTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ToolContainsDemo06 {
@Test
public void setup() {
	RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
	RequestSpecification request=RestAssured.given();
	Response response=request.get("Git Pocket Guide");
	ResponseBody hyd=response.getBody();
	String hydb=hyd.asString();
	System.out.println(hydb);
	System.out.println(hydb.toUpperCase());
	//Assert.assertEquals(hydb.toLowerCase().contains("Git Pocket Guide") /*Expected value*/, true /*Actual Value*/, "Response body contains place");
	//title
}
}
