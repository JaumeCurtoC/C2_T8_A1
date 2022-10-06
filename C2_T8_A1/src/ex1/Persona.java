package ex1;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo = 'H';
	private double peso;
	private double altura;
	
	//Constructor con valores vacios por defecto / Hecho a mano
	public Persona(String DNI) {
		this.nombre = "";
		this.edad = 0;
		this.DNI = DNI;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	//Constructor con algunos valores declarados, el resto por defecto /Hecho a mano
	public Persona(String nombre, int edad, char sexo, String DNI) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	//Constructor con todos los valores declarados / Hecho de forma automática con algunas cambios
	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//toString creada para comprobar si las instancias de la clase han salido bien en la clase Main / Hecho a mano
	public String toString() {
		return "Persona -> (Nombre: "+this.nombre+", Edad: "+edad+", DNI: "+this.DNI+", Sexo: "+this.sexo+", Peso: "+this.peso+", Altura: "+this.altura+")";
	}
	
}
