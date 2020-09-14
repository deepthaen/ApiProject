package apiPratice.ApiProject.restUtils;

import java.util.HashMap;

import apiPratice.ApiProject.pojo.Info;
import apiPratice.ApiProject.pojo.Postbody;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class Post_Consumer {
	
	
	public static void post_body_call(String url) {
		HashMap<String, String> map = postHeader();
		
	System.out.println(map);
	System.out.println(url);
    Response res = given().relaxedHTTPSValidation().headers(map).body(postBody().toString()).when().post(url);
    System.out.println(res.statusCode());
    System.out.println(res.asString());
    
    
    
	}
	
	public static HashMap<String, String> postHeader() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		return map;
	}
	
	public static String requestBody() {
		String body ="{\r\n" + 
				"  \"info\": {\r\n" + 
				"    \"name\": \"Sample Postman Collection\",\r\n" + 
				"    \"schema\": \"https://schema.getpostman.com\",\r\n" + 
				"    \"description\": \"A sample\"\r\n" + 
				"  }\r\n" + 
				"}";
		return body;
	}
	
	public static Postbody postBody() {
		Info info = new Info();
		info.setName("Dadhi");
		info.setSchema("Dummy schema");
		info.setDescription("Double dummy");
		
		Postbody pb = new Postbody();
		pb.setInfo(info);
		return pb;
		
	}

}
