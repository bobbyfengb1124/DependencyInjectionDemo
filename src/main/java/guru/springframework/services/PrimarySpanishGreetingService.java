/**
 * @Author Feng Bo
 * 
 * @Date 4 Aug 2017 3:03:25 pm
 */
package guru.springframework.services;

/**
 * 
 */
public class PrimarySpanishGreetingService implements GreetingService {

	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guru.springframework.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hola - Servicio de Saludo Primario";
	}

}
