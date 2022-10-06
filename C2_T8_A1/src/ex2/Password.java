package ex2;

public class Password {
	// Atributos
	private int longitud;
	private String contrase�a;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contrase�a = "";
	}

	// Constructor con logitud pasado como par�metro
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = crearContrase�a();

	}

	// toString para mostrar el contenido de la clase Password
	public String toString() {
		return "Password -> (Longitud: " + this.longitud + ", Contrase�a: " + this.contrase�a + ")";
	}

	//M�todo para generar la contrase�a aleatoria
	private String crearContrase�a() {
		// Estos ser�n los valores que usaremos para crear la contrase�a random
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"
				+ "+-!?$%/()*";
		// Declaramos un StringBuilder del tama�o que hemos pasado como par�metro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Por cada pasada del for, se seleccionara de forma aleatoria la posici�n de un
			// caracter del AlphaNumericString
			int index = (int) (AlphaNumericString.length() * Math.random());
			// Luego lo a�adimos al StringBuilder indicando el caracter por la posici�n
			// anteriormente randomizada
			sb.append(AlphaNumericString.charAt(index));
		}
		// Por �ltimo, los pasamos a String y lo definimos como el atributo contrase�a
		return sb.toString();
	}
}
