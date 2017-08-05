/**
 * @Author Feng Bo
 * 
 * @Date 4 Aug 2017 3:03:25 pm
 */
package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

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
