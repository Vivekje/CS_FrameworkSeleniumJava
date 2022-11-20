package ExerciseLex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Exercise02 {
Response response;

@Test
public void test01() {
	response=RestAssured.get("http://localhost:8080/InfyClinicV2/APP_V2/getDoctor?Specialization=Cardiologist");
	String sessionId=response.getSessionId();
	System.out.println("session Id : " +sessionId);
	
	String contentType=response.getContentType();
	System.out.println("Content Type : "  +contentType);
}
}
