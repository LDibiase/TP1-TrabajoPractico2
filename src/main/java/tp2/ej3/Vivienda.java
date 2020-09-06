package tp2.ej3;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;

	public Vivienda(String calle, Integer altura, Integer piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento, new ArrayList<>());
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void agregarMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}

	public void mostrarTodo() {
		System.out.println(this.direccion.getValor());

		if (personas.size() > 0) {
			System.out.println("Personas:");
			personas.forEach(x -> {
				System.out.println(x.getValor());
			});
		}

		if (muebles.size() > 0) {
			System.out.println("Muebles:");
			muebles.forEach(x-> {
				System.out.println(x.getValor());
			});
		}
	}
}
