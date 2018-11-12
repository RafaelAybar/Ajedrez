package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	private char columna;
	private int fila;
	String posicion = (new Posicion(fila, columna)).toString();
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
}