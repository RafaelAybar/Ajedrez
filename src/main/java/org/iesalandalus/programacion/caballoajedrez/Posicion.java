package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	private int fila;
	private char columna;

	// Creamos los getter
	public char getColumna() {
		return columna;
	}

	public int getFila() {
		return fila;
	}

	// Creamos los setter
	public void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("Los valores de la columna son incoherentes");
		} else {
			this.columna = columna;
		}

	}

	public void setFila(int fila) {
		if (fila < 0 && fila > 8) {
			throw new IllegalArgumentException("Los valores de la fila son incoherentes");
		} else {
			this.fila = fila;
		}
	}

	// Creamos el constructor
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

	// Creamos el constructor copia
	public Posicion(final Posicion copia) {
		this.columna = copia.columna;
		this.fila = copia.columna;
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
		Posicion other = (Posicion) obj;
		if (columna != other.columna) {
			return false;
		}
		if (fila != other.fila) {
			return false;
		}
		return true;
	}

	// Creamos el método toString
	@Override
	public String toString() {
		return getColumna() + "" + getFila();
	}
}