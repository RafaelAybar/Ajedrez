package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

public class Caballo {
	private Posicion posicion;
	private Color color;

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

	// Creamos los setter y getter para color
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Creamos el constuctor con el valor por defecto '8b'
	public Caballo() {
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
		if (columna != 'b' && columna != 'g') {
			throw new IllegalArgumentException("La fila introducida no es correcta");
		}
		// Asignamos el color en función de la fila introducida
		if (columna == 'b') {
			this.setColor(Color.BLANCO);
			this.posicion = new Posicion(1, 'b');
		} else {
			this.setColor(Color.NEGRO);
			this.posicion = new Posicion(1, 'g');
		}
	}

	// Creamos el método mover
	public void mover(Direccion direccion) throws OperationNotSupportedException {
		// Creamos variables locales para almacenar la posicion

		int fila = posicion.getFila();
		char columna = posicion.getColumna();

		switch (direccion) {
		case ARRIBA_DERECHA:
			posicion.setFila(fila + 2);
			posicion.setColumna(columna++);
			break;
		case ARRIBA_IZQUIERDA:
			posicion.setFila(fila + 2);
			posicion.setColumna(columna--);
			break;
		case DERECHA_ARRIBA:
			// Bibliografía:
			// https://stackoverflow.com/questions/8688668/in-java-is-the-result-of-the-addition-of-two-chars-an-int-or-a-char
			posicion.setColumna(columna += 2);
			posicion.setFila(fila++);
			break;
		case DERECHA_ABAJO:
			posicion.setColumna(columna += 2);
			posicion.setFila(fila--);
			break;
		case ABAJO_DERECHA:
			posicion.setFila(fila - 2);
			posicion.setColumna(columna++);
			break;
		case ABAJO_IZQUIERDA:
			posicion.setColumna(columna--);
			posicion.setFila(fila + 2);
			break;
		case IZQUIERDA_ARRIBA:
			posicion.setColumna(columna -= 2);
			posicion.setFila(fila++);
			break;
		case IZQUIERDA_ABAJO:
			posicion.setColumna(columna -= 2);
			posicion.setFila(fila--);
			break;
		default:
			throw new OperationNotSupportedException("El movimiento introducido no es válido");

		}

	}

	// Creamos el método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Caballo other = (Caballo) obj;
		if (color != other.color) {
			return false;
		}
		if (posicion == null) {
			if (other.posicion != null) {
				return false;
			}
		} else if (!posicion.equals(other.posicion)) {
			return false;
		}
		return true;

	}

	// Creamos el método toString
	@Override
	public String toString() {
		return "Caballo [" + (posicion != null ? "posicion=" + posicion + ", " : "")
				+ (color != null ? "color=" + color : "") + "]";
	}
}
