package tp2.ej1;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String apellido;
	private String nombre;
	private List<NumeroTelefonico> numeroTelefonicos;
	private List<EMail> eMails;

	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.numeroTelefonicos = new ArrayList<>();
		this.eMails = new ArrayList<>();
	}

	public void agregarTelefono(NumeroTelefonico numeroTelefonico) {
		this.numeroTelefonicos.add(numeroTelefonico);
	}

	public void agregarEmail(EMail email) {
		this.agregarEmail(email);
	}

	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);

		if (numeroTelefonicos.size() > 0) {
			System.out.println("Telefonos:");
			numeroTelefonicos.forEach(x -> {
					System.out.println(x.getValor());
			});
		}

		if (eMails.size() > 0) {
			System.out.println("Emails:");
			eMails.forEach(x-> {
				System.out.println(x.getValor());
			});
		}
	}
}
