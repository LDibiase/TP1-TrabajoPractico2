package tp2.ej1;

public class NumeroTelefonico {
	private Integer caracteristica;
	private Integer numeroDeAbonado;
	private Integer codigoDePais;
	private TipoDeLinea tipoDeLinea;

	public NumeroTelefonico(){

	}

	public NumeroTelefonico(Integer caracteristica, Integer numeroDeAbonado, Integer codigoDePais, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}

	public String getValor() {
		return this.tipoDeLinea.name() + ": " + "(+" + this.codigoDePais + ")" + " " + this.caracteristica + "-" + this.numeroDeAbonado;
	}
}
