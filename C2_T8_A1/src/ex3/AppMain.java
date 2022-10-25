package ex3;

import ex3.Electrodomestico;

public class AppMain {

	public static void main(String[] args) {
		// Clase Electrodomestico instanciada con el constructor por defecto
		Electrodomestico electrodomestico1 = new Electrodomestico();
		
		// Clase Electrodomestico instanciada con el constructor con precio y peso como parémetros
		Electrodomestico electrodomestico2 = new Electrodomestico(20.0, 10.0);
		
		// Clase Electrodomestico instanciada con el constructor con todos los atributos como parémetros
		Electrodomestico electrodomestico3 = new Electrodomestico(50.0, "azul", "A", 8.0);
		
		// Comprobamos si las clases han sido correctamente instanciadas con el método toString()
		System.out.println(electrodomestico1.toString());
		System.out.println(electrodomestico2.toString());
		System.out.println(electrodomestico3.toString());
	}
}