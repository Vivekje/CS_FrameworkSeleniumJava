package TOOLSTutorials;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToolHeaderDemo05 {
@Test
public void setu() {
	RestAssured.baseURI="https://demoqa.com";
	RequestSpecification httpRequest=RestAssured.given();
	Response response=httpRequest.request(Method.GET,"/BookStore/v1/Books");
	Headers headers=response.getHeaders();
	for(Header header: headers) {
		System.out.println("Keys :" +header.getName() + " ===><===  Value : " +header.getValue());
	}
}
}
