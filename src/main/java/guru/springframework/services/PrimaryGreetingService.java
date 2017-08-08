/**
 * @Author Feng Bo
 * @Email bobbyfeng@cse-global.com
 * @Date 4 Aug 20172:15:31 pm
 */
package guru.springframework.services;

/**
 * 
 */
public class PrimaryGreetingService implements GreetingService {

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guru.springframework.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting service";
	}

}
