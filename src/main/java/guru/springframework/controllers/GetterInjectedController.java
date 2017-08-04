package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class GetterInjectedController {
	private GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
