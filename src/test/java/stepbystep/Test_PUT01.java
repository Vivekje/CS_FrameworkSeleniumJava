package stepbystep;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class Test_PUT01 {

	@Test
	public void test() {
	
		JSONObject request=new JSONObject();
		request.put("name","Vivek");
		request.put("job","Teacher");
		
		System.out.println(request);
		System.out.println("--------------");
		System.out.println(request.toJSONString());
		System.out.println("-----------------");
		
		given().
	      header("Content-Type","application/json").
	      contentType(ContentType.JSON).
	      accept(ContentType.JSON).
	      body(request.toJSONString()).
	when().
	      put("https://reqres.in/api/users/2").
	then().
	      statusCode(200).log().all();
	}
}