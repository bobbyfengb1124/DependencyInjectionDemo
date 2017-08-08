/**
 * @Author Feng Bo
 * @Date 8 Aug 2017 2:04:01 pm
 */
package guru.springframework.services;

/**
 * 
 */
public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	/**
	 * @param greetingRepository
	 */
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {

		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
		case "es":
			return new PrimarySpanishGreetingService(greetingRepository);
		default:
			return new PrimaryGreetingService(greetingRepository);
		}
	}
}
