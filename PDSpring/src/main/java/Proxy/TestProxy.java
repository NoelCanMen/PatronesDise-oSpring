package Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import PDSpring.PDSpring.Persona;

@SpringBootApplication
public class TestProxy implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext contex;

	public static void main(String[] args){
		SpringApplication.run(TestProxy.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Proxy p1=new Proxy(new Persona("pepe", 17));
		
		p1.operacion();
		
	}

}

