package tp2.ej4;

import tp2.ej3.Mueble;
import tp2.ej3.Persona;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
	private List<Vivienda> viviendas;

	public Edificio() {
		this.viviendas = new ArrayList<>();
	}

	public void agregarVivienda(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}

	public void realizarMudanza(Integer pisoOrigen, String departamentoOrigen, Integer pisoDestino,
	                            String departamentoDestino) {
		Vivienda viviendaOrigen = buscarVivienda(pisoOrigen, departamentoOrigen);
		Vivienda viviendaDestino = buscarVivienda(pisoDestino, departamentoDestino);

		if (viviendaOrigen == null || viviendaDestino == null) {
			System.out.println("Uno de los departamentos no es valido");
		} else {
			List<Mueble> muebles = viviendaOrigen.obtenerYVaciarMuebles();
			muebles.forEach(viviendaDestino::agregarMueble);

			List<Persona> personas = viviendaOrigen.obtenerPersonasYCambiarDomicilio();
			personas.forEach(viviendaDestino::agregarPersona);

			System.out.println("Se realizó la mudanza del departamento " + pisoOrigen + departamentoOrigen + " al " + pisoDestino + departamentoDestino);
		}

	}

	private Vivienda buscarVivienda(Integer piso, String departamento) {
		Vivienda vivienda = null;
		Integer i = 0;
		boolean encontrada = false;

		while(i < this.viviendas.size() && !encontrada) {
			if (this.viviendas.get(i).getPiso() == piso
					&& this.viviendas.get(i).getDepartamento().equalsIgnoreCase(departamento)) {
				vivienda = this.viviendas.get(i);
				encontrada = true;
			} else {
				i++;
			}
		}

		return vivienda;
	}

	public void mostrarTodo() {
		if (this.viviendas.size() > 0) {
			for (int i=0; i < this.viviendas.size(); i++) {
				System.out.println("Vivienda " + (i+1));
				this.viviendas.get(i).mostrarTodo();
			}
		}
	}
}
