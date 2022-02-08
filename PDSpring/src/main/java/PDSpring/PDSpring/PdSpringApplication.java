package PDSpring.PDSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PdSpringApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext contex;

	public static void main(String[] args){
		SpringApplication.run(PdSpringApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(contex.getBean("PersonaPrototype").hashCode());
		System.out.println(contex.getBean("PersonaPrototype").hashCode());
		System.out.println(contex.getBean("PersonaPrototype").hashCode());
		System.out.println(contex.getBean("PersonaPrototype").hashCode());
		
		System.out.println(contex.getBean("PersonaSingleton").hashCode());
		System.out.println(contex.getBean("PersonaSingleton").hashCode());
		System.out.println(contex.getBean("PersonaSingleton").hashCode());
		System.out.println(contex.getBean("PersonaSingleton").hashCode());
		
	}

}
