package ExerciseLex;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Exercise03 {
Response response;
@Test
public void test01() {
	response=RestAssured.get("http://localhost:8080/InfyClinicV2/APP_V2/getDoctor?Specialization=Cardiologist");
	int StatusCode=response.getStatusCode();
    System.out.println("status Code :" +StatusCode);
    
    String statusLine=response.getStatusLine();
    System.out.println("Status Code :" +statusLine);
}
}
