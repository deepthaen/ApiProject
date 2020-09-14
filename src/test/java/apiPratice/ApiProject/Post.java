package apiPratice.ApiProject;

import org.testng.annotations.Test;

import apiPratice.ApiProject.restUtils.ConstantsURI;
import apiPratice.ApiProject.restUtils.Post_Consumer;

public class Post {
	
	@Test
	public void postMethod() {
		String url = ConstantsURI.BaseUrl+ConstantsURI.postEndurl;
		Post_Consumer.post_body_call(url);
	}

}
