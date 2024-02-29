package dominio;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;

	public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
		super(nombre, genero, edad, direccion);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}



}
