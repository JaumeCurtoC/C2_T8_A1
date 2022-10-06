package ex3;

import ex3.Color;
import ex3.ConsumoEnergetico;

public class Electrodomestico {
	// Atributos
	protected double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;

	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = Color.blanco.toString();
		this.consumoEnergetico = ConsumoEnergetico.F.toString();
		this.peso = 5.0;
	}

	// Constructor con precio y peso como parámetros
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = Color.blanco.toString();
		this.consumoEnergetico = ConsumoEnergetico.F.toString();
		this.peso = peso;
	}

	// Constructor con todos los atributos como parametro
	public Electrodomestico(double precio, String color, String consumo, double peso) {
		this.precioBase = precio;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumo(consumo);
		this.peso = peso;
	}
	
	// toString para mostrar el contenido de la clase Electrodomestico
	public String toString() {
		return "Electrodoméstico -> (Precio: " + this.precioBase + ", Color: " + this.color + ", Consumo Energético: "
				+ this.consumoEnergetico + ", Peso: " + peso + ")";
	}

	// Método para comprobar el nombre del color pasado por parámetro en el constructor
	private String comprobarColor(String colorC) {
		String c = "";
		// Primero asignamos el valor por defecto, este cambiará si el parámetro color
		// es válido
		c = Color.blanco.toString();
		
		// Recorremos el enum de color y ponemos el parámetro color todo en minúsculas
		// para que se puedan comparar sin problemas
		for (Color miColor : Color.values()) {
			if (colorC.toLowerCase().equals(miColor.toString())) {
				c = colorC.toLowerCase();
			}
		}

		return c;
	}

	// Método para comprobar el nombre del consumo pasado por parámetro en el constructor
	private String comprobarConsumo(String consumoC) {
		String co = "";
		// Primero asignamos el valor por defecto, este cambiará si el parámetro consumo
		// es válido
		co = ConsumoEnergetico.F.toString();
		
		// Recorremos el enum de colorEnergetico y ponemos el parámetro consumo todo en
		// mayúsculas para que se puedan comparar sin problemas
		for (ConsumoEnergetico miConsumo : ConsumoEnergetico.values()) {
			if (consumoC.toUpperCase().equals(miConsumo.toString())) {
				co = consumoC.toUpperCase();
			}
		}
		
		return co;
	}

}
