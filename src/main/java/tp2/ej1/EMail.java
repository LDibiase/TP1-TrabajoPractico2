package tp2.ej1;

public class EMail {
	private String cuenta;
	private String dominio;

	public EMail(String email) {
		String[] cuentaYDominio = email.split("@");

		if (cuentaYDominio.length < 2) {
			System.out.println("El formato del email es invalido");
		} else {
			this.cuenta = cuentaYDominio[0];
			this.dominio = cuentaYDominio[1];
		}
	}

	public String getValor() {
		return cuenta + "@" + dominio;
	}
}
