package PDSpring.PDSpring;

public class Persona {
	
	private String nombre;
    private int edad;
 
    public Persona(String nom, int edad) {
    	
        nombre=nom;
        this.edad=edad;
    }
 
    public String getNombre() {
    	
        return nombre;
    }
 
    public int getEdad() {
    	
        return edad;
    }
    
    public void setNombre(String nombreCliente) {
    	
        nombre=nombreCliente;
    }
 
    public void setEdad(int edad) {
    	
        this.edad=edad;
    }
    
    
    //Patr�n builder
    
    public static PersonaBuilder builder() {
    	return new PersonaBuilder();
    }
    
    public static class PersonaBuilder{
    	
    	private String nombre;
    	private int edad;
    	
    	public PersonaBuilder nombre(String nombre)
    	{
    		this.nombre=nombre;
    		return this;
    	}
    	
    	public PersonaBuilder edad(int edad)
    	{
    		this.edad=edad;
    		return this;
    	}
    	
    	public Persona build() {
    		return new Persona(this.nombre, this.edad);
    	}
    	
    }
    
    public void operacion() {
    	System.out.println("OPERACION");
    }
    
}
