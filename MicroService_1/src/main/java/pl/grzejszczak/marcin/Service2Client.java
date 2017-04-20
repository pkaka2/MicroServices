package pl.grzejszczak.marcin;

import org.springframework.web.client.RestTemplate;

public class Service2Client {
	private String baseUrl;

	public Service2Client(String baseUrl){
		this.baseUrl=baseUrl;
	}

	public String callService2() {
		RestTemplate rest=new RestTemplate();
		String response=rest.getForObject(baseUrl + "/service2", String.class);
	    return response;
	}

}
