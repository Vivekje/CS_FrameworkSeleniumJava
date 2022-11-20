package stepbystep;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_POST01 {

	@Test
	public void test() {
		Map<String, Object> map=new HashMap<String, Object>();
		
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		System.out.println(map);
		
		JSONObject request=new JSONObject(map);
		System.out.println(request);
		
		System.out.println(request.toJSONString());
	}
}
