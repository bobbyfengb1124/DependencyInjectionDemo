/**
 * @Author Feng Bo
 * @Date 5 Aug 2017 11:12:54 am
 */
package guru.springframework.services;

/**
 * 
 */
public class PrimaryGermanGreetingService implements GreetingService {

	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guru.springframework.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Primärer Grußdienst";
	}

}
