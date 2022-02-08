package Decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import PDSpring.PDSpring.Persona;

@SpringBootApplication
public class TestDecorator implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext contex;

	public static void main(String[] args){
		SpringApplication.run(TestDecorator.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Decorator decoracion1 = Decorator.builder().Persona(Persona.builder().nombre("Juan").edad(18).build()).build();
				
		System.out.println(decoracion1.getNombre());
		System.out.println(decoracion1.getEdad());
		
		
	}

}

