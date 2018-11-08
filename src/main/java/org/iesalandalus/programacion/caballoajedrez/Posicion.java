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
				if (columna < 'a' || columna > 'h') throw new IllegalArgumentException("Los valores de la columna son incoherentes");
				else {
					this.columna = columna;
				}
				
			}
			public void setFila(int fila) {
				if (fila < 0 && fila > 8)throw new IllegalArgumentException("Los valores de la fila son incoherentes");	
				else {
					this.fila = fila;
				}
			}
			//Creamos el constructor
			public Posicion(int fila, char columna){
				//Comprobamos que tenga los valores pertinentes
				if (columna < 'a' || columna > 'h') throw new IllegalArgumentException("Los valores de la columna son incoherentes");
				else {
					this.columna = columna;
				}
				if (fila < 0 && fila > 8)throw new IllegalArgumentException("Los valores de la fila son incoherentes");	
				else {
					this.fila = fila;
				}
				}
				
			}