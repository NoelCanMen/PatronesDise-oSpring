package Decorator;

import PDSpring.PDSpring.Persona;
import lombok.Builder;

@Builder
public class Decorator implements IPersonaDecorator{
	
	private Persona Persona;
	
	@Override
	public String getNombre()
	{
		return Persona.getNombre()+ "Adorno nuevo";
	}
	
	@Override
	public int getEdad()
	{
		return Persona.getEdad()*100;
	}
	
}
