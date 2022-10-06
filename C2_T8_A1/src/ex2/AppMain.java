package ex2;

import ex2.Password;

public class AppMain {

	public static void main(String[] args) {
		// Clase Password instanciada con el constructor por defecto
		Password password1 = new Password();
		
		// Clase Password instanciada con el constructor con longitud como parametro
		Password password2 = new Password(10);
		
		// Comprobamos si las clases han sido correctamente instanciadas con el método toString()
		System.out.println(password1.toString());
		System.out.println(password2.toString());

	}

}
