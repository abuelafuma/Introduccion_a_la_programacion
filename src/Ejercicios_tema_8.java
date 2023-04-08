/*
 * 
 * Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 * 
 * */
public class Ejercicios_tema_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(60, "Maradona", 7890);
		
		//System.out.println(persona1);
		// System.out.println(persona2);
		
		System.out.println(persona1.getEdad());
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getTelefono());
		
		persona1.setEdad(35);
		persona1.setNombre("Pollo");
		persona1.setTelefono(9876);
		
		System.out.println(persona1.getEdad());
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getTelefono());
		
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getTelefono());
		
		persona2.setEdad(56);
		persona2.setNombre("Don Pimpom");
		persona2.setTelefono(543210);
		
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getTelefono());
	}
	

}	
	
class Persona {
	
	private int edad;
	private String nombre;
	private int telefono;
	

	// CONSTRUCTOR VACIO DESD CUANDO SE LLAMA DESDE EL MAIN
	public Persona() {
		edad = 18;
		nombre = "Pele";
		telefono = 123456;
		System.out.println("Estoy en el consructor vacio");	
	}
	
	// CONSTRUCTOR CON PASANDO ARGUMENTOS DESDE EL MAIN
	public Persona(int edat, String nom, int num_telefono) {
		//this.edad = edad;
		edad = edat;  // Si el parametre i el atribut no es diuen igual ho pots posar sense this
		//this.nombre = nombre;
		nombre = nom; // Per convenció s'ha de posar el mateix nom del paràmetre i el del atribut de la classe
		//this.telefono = telefono;
		telefono = num_telefono;
		System.out.println("Estoy en el consructor que debo pasar argumentos / parametros");

	}

	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}

