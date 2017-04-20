package pl.grzejszczak.marcin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController1 {
@RequestMapping("/service1")

public String service1(){
	Service2Client client = new Service2Client("http://localhost:8000");
	String response= client.callService2();
	Service3Client Client = new Service3Client("http://localhost:8001");
	String respons= Client.callService3();
		return "service1: " +response +"  " +respons ;	
}
	
}
