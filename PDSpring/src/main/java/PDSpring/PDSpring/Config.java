package PDSpring.PDSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import PDSpring.PDSpring.Persona.PersonaBuilder;

@Configuration
public class Config {
	
	@Bean (name="PersonaPrototype")
	@Scope ("prototype")
	public PersonaBuilder PersonaPrototype()
	{
		return Persona.builder().nombre("Juan").edad(18);
	}
	
	@Bean (name="PersonaSingleton")
	@Scope ("singleton")
	public PersonaBuilder PersonaSingleton()
	{
		return Persona.builder().nombre("Juan").edad(18);
	}

}
