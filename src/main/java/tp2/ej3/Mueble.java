package tp2.ej3;

public class Mueble {
	private TipoMueble tipoMueble;
	private Material tipoMaterial;
	private Color color;

	public Mueble(TipoMueble tipoMueble, Material tipoMaterial, Color color) {
		this.tipoMueble = tipoMueble;
		this.tipoMaterial = tipoMaterial;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getValor() {
		return this.tipoMueble.name() + " de " + this.tipoMueble.name() + " de color " + this.color.name();
	}
}
