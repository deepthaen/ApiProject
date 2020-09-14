package apiPratice.ApiProject.restUtils;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.response.Response;
public class Get_Consumer {

	/**
	 * RequestSpecification
	 * Request
	 */

	public static void getRequest(String url) {
		HashMap<String, String> mapHeader = getHeaders();
		System.out.println("URL --> "+url);
		Response res =
				given()
					.with()
						.relaxedHTTPSValidation()
							.headers(mapHeader).auth().basic("u", "1234567")
								.when()
									.get(url);
		int statusCode=  res.getStatusCode();
		String resLine = res.getStatusLine();
		String resBody = res.asString();

		System.out.println("statusCode --> "+statusCode);
		System.out.println("resLine --> "+resLine);
		System.out.println("resBody --> "+resBody);
	}

	public static HashMap<String,String> getHeaders() {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("my-sample-header","Deeptha");
		System.out.println("Headers --> "+map);
		return map;
	}

}
