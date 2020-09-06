package tp2.ej3;

import java.util.List;

public class Direccion {
	private String calle;
	private Integer altura;
	private Integer piso;
	private String departamento;
	private List<Persona> personas;

	public Direccion(String calle, Integer altura, Integer piso, String departamento, List<Persona> personas) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
		this.personas = personas;
	}

	public Integer getPiso() {
		return piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public String getValor() {
		return this.calle + " " + this.altura + " " + this.piso + "'" + this.departamento + "'";
	}
}
