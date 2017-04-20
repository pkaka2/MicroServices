package pl.grzejszczak.marcin;

import org.springframework.web.client.RestTemplate;

public class Service3Client {
	private String baseUrl;

	public Service3Client(String baseUrl){
		this.baseUrl=baseUrl;
	}

	public String callService3() {
		RestTemplate rest=new RestTemplate();
		String respons=rest.getForObject(baseUrl + "/service3", String.class);
	    return respons;
	}

}
