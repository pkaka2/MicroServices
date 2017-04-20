package pl.grzejszczak.marcin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController2 {

@RequestMapping("/service2")

public String service2(){
	String response= "hello from service2";
	return response;
}
	
}
