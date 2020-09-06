package tp2.ej3;

public class Main {

	public static void main(String[] args) {
		Vivienda vivienda = new Vivienda("Montañeses", 1234, 4, "C");
		vivienda.agregarPersona(new Persona("Arturo", "Roman", 53));
		vivienda.agregarPersona(new Persona("Mónica", "Gaztambide", 35));
		vivienda.agregarMueble(new Mueble(TipoMueble.MESA, Material.MADERA, Color.MARRON));
		vivienda.agregarMueble(new Mueble(TipoMueble.MESADA, Material.MARMOL, Color.ROJO));
		vivienda.agregarMueble(new Mueble(TipoMueble.PERCHERO, Material.METAL, Color.NEGRO));
		vivienda.agregarMueble(new Mueble(TipoMueble.SILLON, Material.CUERO, Color.AZUL));

		vivienda.mostrarTodo();
	}
}
