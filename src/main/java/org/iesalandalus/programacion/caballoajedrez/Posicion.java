package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
			public int fila;
			public char columna;
			
			// Creamos los getter
			public char getColumna() {
				return columna;
			}
			public int getFila() {
				return fila;
			}
			
			//Creamos los setter
			public void setColumna(char columna) {
				if (columna < 'a' || columna > 'h') {
					this.columna = columna;
				}
				else {
					throw new IllegalArgumentException("Los valores de la columna son incoherentes");
				}
				
			}
			public void setFila(int fila) {
				if (fila < 9 && fila > 0) {
					this.fila = fila;
				}
				else {
					throw new IllegalArgumentException("Los valores de la fila son incoherentes");
				}
			}
			//Creamos el constructor
			public Posicion(int fila, char columna){
				//Comprobamos que tenga los valores pertinentes
				if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
					this.columna = columna;
				}
				else {
					throw new IllegalArgumentException("Los valores de la columna son incoherentes");
				}
				if (fila < 9 && fila > 0) {
					this.fila = fila;
				}
				else {
					throw new IllegalArgumentException("Los valores de la fila son incoherentes");
				}
				
			}
		}