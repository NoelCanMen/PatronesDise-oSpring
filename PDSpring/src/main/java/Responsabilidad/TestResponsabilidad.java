package Responsabilidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class TestResponsabilidad implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext contex;

	public static void main(String[] args){
		SpringApplication.run(TestResponsabilidad.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Unidad soldado1= Unidad.builder().nombre("Soldado").build();
		Unidad sargento1= Unidad.builder().nombre("Sargento").Subordinado(soldado1).build();
		Unidad capitan1= Unidad.builder().nombre("Capitan").Subordinado(soldado1).Subordinado(sargento1).build();
				
		capitan1.ejecutarOrden();
		System.out.println();
		sargento1.ejecutarOrden();
		System.out.println();
		soldado1.ejecutarOrden();
		
	}

}

