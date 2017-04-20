package pl.grzejszczak.marcin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController3 {

@RequestMapping("/service3")

public String service2(){
	String response= "hello from service3";
	return response;
}
	
}