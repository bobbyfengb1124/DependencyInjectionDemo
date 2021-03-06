package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	// @Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
}
