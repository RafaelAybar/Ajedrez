package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

public class Caballo {
	Posicion posicion;
	Color color;
	Direccion direccion;
	Posicion fila;
	Posicion columna;

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

	// Creamos el constuctor con el valor por defecto '8b'
	public Caballo(Posicion posicion) {
		this.posicion = new Posicion(8, 'b');
	}

	/*
	 * Creamos el constructor que establece las posiciones por defecto según el
	 * color
	 */
	public Caballo(Color color) {
		if (color.equals(Color.BLANCO)) {
			this.posicion = new Posicion(1, 'b');
		} else {
			this.posicion = new Posicion(8, 'b');
		}
	}

	// Creamos el constructor con el color y la fila inicial como parámetros
	public Caballo(Color color, char columna) throws OperationNotSupportedException {
		// Comprobamos que la fila sea la correcta
		if (columna != 'b' || columna != 'g') {
			throw new IllegalArgumentException("La fila introducida no es correcta");
		}
		// Asignamos el color en función de la fila introducida
		if (columna == 'b') {
			this.color = Color.BLANCO;
			this.posicion = new Posicion(1, 'b');
		} else {
			this.color = Color.NEGRO;
			this.posicion = new Posicion(1, 'g');
		}
	}

	// Creamos el método mover
	public void mover(Direccion direccion) throws OperationNotSupportedException {
		// Creamos variables locales para almacenar la posicion

		switch (direccion) {
		case ARRIBA_DERECHA:
			break;
		case ARRIBA_IZQUIERDA:
			break;
		case DERECHA_ARRIBA:
			break;
		case DERECHA_ABAJO:
			break;
		case ABAJO_DERECHA:
			break;
		case ABAJO_IZQUIERDA:
			break;
		case IZQUIERDA_ARRIBA:
			break;
		case IZQUIERDA_ABAJO:
			break;
		default:
			throw new OperationNotSupportedException("El movimiento introducido no es válido");

		}
	}
}