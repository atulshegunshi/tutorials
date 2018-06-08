package org.demo.endpoint;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api-shopping")
public class ShoppingMenuServiceEndpoint {

	@RequestMapping(path = "/shopping-list")
	public HttpEntity<String> sayHello(){
		return new HttpEntity<String>("Hello");
	}
	
}
