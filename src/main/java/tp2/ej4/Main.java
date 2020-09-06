package tp2.ej4;

import tp2.ej3.Color;
import tp2.ej3.Material;
import tp2.ej3.Mueble;
import tp2.ej3.Persona;
import tp2.ej3.TipoMueble;

public class Main {

	public static void main(String[] args) {
		Edificio edificio = new Edificio();

		Vivienda vivienda = new Vivienda("Montañeses", 1234, 4, "C");
		vivienda.agregarPersona(new Persona("Arturo", "Roman", 53));
		vivienda.agregarPersona(new Persona("Mónica", "Gaztambide", 35));
		vivienda.agregarMueble(new Mueble(TipoMueble.MESA, Material.MADERA, Color.MARRON));
		vivienda.agregarMueble(new Mueble(TipoMueble.MESADA, Material.MARMOL, Color.ROJO));
		vivienda.agregarMueble(new Mueble(TipoMueble.PERCHERO, Material.METAL, Color.NEGRO));
		vivienda.agregarMueble(new Mueble(TipoMueble.SILLON, Material.CUERO, Color.AZUL));

		Vivienda vivienda2 = new Vivienda("Montañeses", 1234, 2, "B");

		edificio.agregarVivienda(vivienda);
		edificio.agregarVivienda(vivienda2);

		edificio.mostrarTodo();

		edificio.realizarMudanza(4, "C", 2, "B");

		edificio.mostrarTodo();

	}
}
