package dominio;

import java.util.Date;

public class Cliente extends Persona {

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;

	public Cliente() {

	}

	public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad,
			String direccion) {
		super(nombre, genero, edad, direccion); //Super debe estár primero
		this.fechaRegistro = fechaRegistro;
		this.idCliente = ++Cliente.contadorCliente;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}
	
	public boolean isVip() {
		return this.vip;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", vip=");
		builder.append(vip);
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
