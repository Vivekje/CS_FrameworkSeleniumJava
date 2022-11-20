package ExerciseLex;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Exercise01 {
	
Response response;
@Test
public void test01() {
	response=RestAssured.get("http://localhost:8081/InfyClinic/APP_V1/getDoctor?Specialization=Cardiologist");
	
	ResponseBody body=response.getBody();
	String rest=body.asString();
	System.out.println(rest);
	System.out.println(" Status Code : " +response.getStatusCode());
    }
}
