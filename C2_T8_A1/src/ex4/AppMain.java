package ex4;

import ex4.Serie;

public class AppMain {

	public static void main(String[] args) {
		// Constructor por defecto
		Serie serie1 = new Serie();
		
		// Constructor con titulo y creador como parámetros
		Serie serie2 = new Serie("House of the Dragon", "George R. R. Martin");
		
		// Constructor con todos los atributos, salvo entregado, como parámetros
		Serie serie3 = new Serie("Better Call Saul", 6, "Drama", "Vince Gilligan");
		
		// Comprobamos si las clases han sido correctamente instanciadas con el método toString()
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());

	}

}
