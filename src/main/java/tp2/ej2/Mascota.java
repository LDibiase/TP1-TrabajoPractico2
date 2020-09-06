package tp2.ej2;

public class Mascota {
	private String nombre;
	private TipoMascota tipoMascota;

	public Mascota(String nombre, TipoMascota tipoMascota) {
		this.nombre = nombre;
		this.tipoMascota = tipoMascota;
	}

	public String getValor() {
		return this.tipoMascota.name() + ", " + this.nombre;
	}
}
