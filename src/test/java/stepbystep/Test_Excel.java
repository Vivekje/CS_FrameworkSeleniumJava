package stepbystep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Excel {
	Response response;
@Test
public void test() throws IOException {
	FileInputStream file=new FileInputStream("D:\\Excel\\APIRest.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	for(int i=0; i<sheet.getLastRowNum(); i++) {
		String name=sheet.getRow(i).getCell(0).getStringCellValue();
	 
	//	response=RestAssured.get("https://reqres.in/api/users?page=2"" +name+ "");
		response=RestAssured.get("https://reqres.in/api/users?page=2" + name + "");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	
	
}
}