package dominio;

public class Persona {

	private int idPersona;
	private String nombre;
	private static int contadorPersonas; //Debe ser static para que no se reinicie
	//al crear cada objeto

	public Persona(String nombre) {
		this.nombre = nombre;
		// Incremento el contador y uso Persona en vez de this porque es estatica la
		// variable
		Persona.contadorPersonas++;
		//Asignar valor a idPersona
		this.idPersona = Persona.contadorPersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
}
