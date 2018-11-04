package org.iesalandalus.programacion.caballoajedrez;

import java.util.Scanner;

public class Posicion {
			public int fila;
			public static char columna;
			
			// Creamos los getter
			public char GetColumna() {
				return columna;
			}
			public int GetFila() {
				return fila;
			}
			
			//Creamos los setter
			public void SetColumna(char columna) {
				if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
					Posicion.columna = columna;
				}
				else {
					throw new IllegalArgumentException("Los valores de la columna son incoherentes");
				}
				
			}
			public void SetFila(int fila) {
				if (fila < 9 && fila > 0) {
					this.fila = fila;
				}
				else {
					throw new IllegalArgumentException("Los valores de la fila son incoherentes");
				}
			}
			
			public static class PosicionConstructor{
				public static void main(String arg[]) {
					
					System.out.println("Introduze la fila");
					int filaNueva = new Scanner(System.in).nextInt();
					//Para validar el dato tenemos que forzzarlo como string
					System.out.println("Introduce la columna");
					String columnaNueva = new Scanner(System.in).next();
					//Como es una sola letra, usamos charAt(0) para obtenerla
					char letraColumna = columnaNueva.charAt(0);
					
					//validamos los valores introducidos
					
					if (filaNueva < 9 && filaNueva > 0) {
						System.out.println("Fila correcta");
					}
					else {
						throw new IllegalArgumentException("Los valores de la fila son incoherentes");
					}
					if (letraColumna == 'a' || letraColumna == 'b' || letraColumna == 'c' || letraColumna == 'd' || letraColumna == 'e' || letraColumna == 'f' || letraColumna == 'g' || letraColumna == 'h'){
						System.out.println("Columna correcta");
					}
					else {
						throw new IllegalArgumentException("Los valores de la columna son incoherentes");
					}
				}
				
			}
		}