package apiPratice.ApiProject;

import org.testng.annotations.Test;

import apiPratice.ApiProject.restUtils.ConstantsURI;
import apiPratice.ApiProject.restUtils.Get_Param_Consumer;

public class GetParams {
	@Test
	public void get_parama() {
		String url  = ConstantsURI.BaseUrl+ConstantsURI.getParam;
		Get_Param_Consumer.get_Param_call(url);
	}

}
