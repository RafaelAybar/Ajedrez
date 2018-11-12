package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	Posicion posicion;
	Color color;

	// Creamos el setter para color
	public void setColor(String color) {
		/**
		 * ValueOf nos dará una excepción IllegalArgumentException si el color que hemos
		 * introducido NO está contemplado en el enum que hemos definido
		 */
		this.color = Color.valueOf(color);
	}

	// Creamos el getter para el color
	public Color getColor(Color color) {
		return color;
	}

	// Creamos el getter de la posición
	public String getPosicion(String posicion) {
		return posicion;
	}

	// Creamos el setter de la posicion
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
}