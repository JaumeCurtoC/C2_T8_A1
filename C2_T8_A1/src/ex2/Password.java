package ex2;

public class Password {
	// Atributos
	private int longitud;
	private String contraseña;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}

	// Constructor con logitud pasado como parámetro
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = crearContraseña();

	}

	// toString para mostrar el contenido de la clase Password
	public String toString() {
		return "Password -> (Longitud: " + this.longitud + ", Contraseña: " + this.contraseña + ")";
	}

	//Método para generar la contraseña aleatoria
	private String crearContraseña() {
		// Estos serán los valores que usaremos para crear la contraseña random
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"
				+ "+-!?$%/()*";
		// Declaramos un StringBuilder del tamaño que hemos pasado como parámetro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Por cada pasada del for, se seleccionara de forma aleatoria la posición de un
			// caracter del AlphaNumericString
			int index = (int) (AlphaNumericString.length() * Math.random());
			// Luego lo añadimos al StringBuilder indicando el caracter por la posición
			// anteriormente randomizada
			sb.append(AlphaNumericString.charAt(index));
		}
		// Por último, los pasamos a String y lo definimos como el atributo contraseña
		return sb.toString();
	}
}
