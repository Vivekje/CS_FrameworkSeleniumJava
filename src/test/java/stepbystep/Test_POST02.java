package stepbystep;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Test_POST02 {
	@Test
	public void test() {

		JSONObject request=new JSONObject();
		request.put("name","Vivek");
		request.put("job","System Engineer");
		System.out.println(request);
		System.out.println(request.toJSONString());

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
	}
	@Test
	public void test01() {
		JSONObject request=new JSONObject();
		
		given().
		      header("Content-Type","application/json").
		      contentType(ContentType.JSON).
		      accept(ContentType.JSON).
		      body(request.toJSONString()).
		when().
		      post("https://reqres.in/api/users").
		then().
		      statusCode(201);
	}
}
