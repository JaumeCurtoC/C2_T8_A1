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

	// Constructor con precio y peso como par�metros
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
		return "Electrodom�stico -> (Precio: " + this.precioBase + ", Color: " + this.color + ", Consumo Energ�tico: "
				+ this.consumoEnergetico + ", Peso: " + peso + ")";
	}

	// M�todo para comprobar el nombre del color pasado por par�metro en el constructor
	private String comprobarColor(String colorC) {
		String c = "";
		// Primero asignamos el valor por defecto, este cambiar� si el par�metro color
		// es v�lido
		c = Color.blanco.toString();
		
		// Recorremos el enum de color y ponemos el par�metro color todo en min�sculas
		// para que se puedan comparar sin problemas
		for (Color miColor : Color.values()) {
			if (colorC.toLowerCase().equals(miColor.toString())) {
				c = colorC.toLowerCase();
			}
		}

		return c;
	}

	// M�todo para comprobar el nombre del consumo pasado por par�metro en el constructor
	private String comprobarConsumo(String consumoC) {
		String co = "";
		// Primero asignamos el valor por defecto, este cambiar� si el par�metro consumo
		// es v�lido
		co = ConsumoEnergetico.F.toString();
		
		// Recorremos el enum de colorEnergetico y ponemos el par�metro consumo todo en
		// may�sculas para que se puedan comparar sin problemas
		for (ConsumoEnergetico miConsumo : ConsumoEnergetico.values()) {
			if (consumoC.toUpperCase().equals(miConsumo.toString())) {
				co = consumoC.toUpperCase();
			}
		}
		
		return co;
	}

}
