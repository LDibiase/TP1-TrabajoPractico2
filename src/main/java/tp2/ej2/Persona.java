package tp2.ej2;

import tp2.ej1.EMail;
import tp2.ej1.NumeroTelefonico;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String apellido;
	private String nombre;
	private List<NumeroTelefonico> numeroTelefonicos;
	private List<EMail> eMails;
	private List<Mascota> mascotas;

	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.numeroTelefonicos = new ArrayList<>();
		this.eMails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
	}

	public void agregarEmail(EMail email) {
		this.agregarEmail(email);
	}

	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}

	public void agregarTelefono(NumeroTelefonico numeroTelefonico) {
		this.numeroTelefonicos.add(numeroTelefonico);
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

		if (mascotas.size() > 0) {
			System.out.println("Mascotas:");
			mascotas.forEach(x -> {
				System.out.println(x.getValor());
			});
		}
	}
}
