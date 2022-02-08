package Proxy;

import PDSpring.PDSpring.Persona;
import lombok.Builder;

@Builder
public class Proxy  implements IPersonaProxy{

	private Persona p;
	
	@Override
	public void operacion() {

		System.out.println("antes de ");
		p.operacion();
		System.out.println(" despues ");
		
	}
	
	

}
