package tp2.ej1;

public class Main {

	public static void main(String[] args) {

		Persona lio = new Persona("Messi", "Lionel");
		lio.agregarTelefono(new NumeroTelefonico(114111, 2222, 549, TipoDeLinea.CELULAR));
		lio.agregarTelefono(new NumeroTelefonico(032444, 5678, 68, TipoDeLinea.CELULAR));
		lio.agregarTelefono(new NumeroTelefonico(4411, 5472, 549, TipoDeLinea.FIJO));
		lio.agregarEmail(new EMail("lio@messi.com"));

		lio.mostrarTodo();
	}
}
