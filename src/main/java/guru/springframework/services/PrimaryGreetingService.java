/**
 * @Author Feng Bo
 * @Email bobbyfeng@cse-global.com
 * @Date 4 Aug 20172:15:31 pm
 */
package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

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
