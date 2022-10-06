package ex1;

import ex1.Persona;

public class AppMain {

	public static void main(String[] args) {
		//Clase Persona instanciada con el constructor por defecto
		Persona persona1 = new Persona("12345678T");
		
		//Clase Persona instanciada con el constructor con algunos valores por defectos
		Persona persona2 = new Persona("Jaume Curto", 22, 'H', "33998811J");
		
		//Clase Persona instaciada con todos los atributos como parámetros
		Persona persona3 = new Persona("Rosa Clara", 30, "87654321R", 'M', 60.5, 1.67);
		
		//Comprobamos si las clases han sido correctamente instanciadas con el método toString()
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

	}

}
