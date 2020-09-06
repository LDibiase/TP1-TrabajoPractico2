package tp2.ej3;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;

	public Persona(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getValor() {
		return "Nombre: " + this.nombre + " " + this.apellido + ", Edad: " + this.edad;
	}
}
