package apiPratice.ApiProject;

import org.testng.annotations.Test;

import apiPratice.ApiProject.restUtils.ConstantsURI;
import apiPratice.ApiProject.restUtils.Get_Consumer;

public class GetHeaders_Test {
	
	@Test
	public void test_getcall() {
		String url = ConstantsURI.BaseUrl+ConstantsURI.getHeaders;
		Get_Consumer.getRequest(url);
	}

}
