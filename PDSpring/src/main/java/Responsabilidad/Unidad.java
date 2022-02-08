package Responsabilidad;

import lombok.Builder;

@Builder
public class Unidad {
	
	private String nombre;
	private Unidad Subordinado;
	
	
	
	public void ejecutarOrden() {
		
		if(Subordinado!=null) {
			System.out.println("Te lo paso");
			
			Subordinado.ejecutarOrden();
			
		}else{
			System.out.println("Te ha tocado pringar");	
		}
		
	}

}
