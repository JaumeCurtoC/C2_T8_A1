package ex4;

public class Serie {
	//Atributos
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	// Constructor con titulo y creador pasado por parámetros
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	//Constructor con todos los atributos pasados por parámetros, menos entregado
	public Serie(String titulo, int temp, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = temp;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
		
	}
	// toString para mostrar el contenido de la clase Serie
	public String toString() {
		return "Serie -> (Titulo: "+this.titulo+", Número Temporadas: "+this.numTemporadas+", Entregado:"+ this.entregado+", Género: "+this.genero+", Creador: "+this.creador+")";
	}
	
}
