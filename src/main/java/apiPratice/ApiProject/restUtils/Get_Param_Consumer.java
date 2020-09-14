package apiPratice.ApiProject.restUtils;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;

import io.restassured.response.Response;
public class Get_Param_Consumer {
	
	public static void get_Param_call(String url) {
		HashMap<String, String> map = queryParam();
		
		System.out.println("URL  :" +url);
		System.out.println("map  :" +map);
		Response res = given().relaxedHTTPSValidation().queryParams(map).when().get(url);
		
		JSONObject json = new JSONObject(res.asString());
		String test = json.get("test").toString();
		String type = json.get("Content-Type").toString();
		System.out.println("Response" + test);
		System.out.println("response"+ type);
		
		int statusCode = res.getStatusCode();
		String statusLine = res.getStatusLine();
		String responseBody = res.asString();
		System.out.println("reponse body" +responseBody);
		
	}

	
	public static HashMap<String, String> queryParam() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Content-Type", "text/html");
		map.put("test", "response_headers");
		return map;
	}
}
