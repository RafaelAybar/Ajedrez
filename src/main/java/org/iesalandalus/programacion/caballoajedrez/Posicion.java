package org.iesalandalus.programacion.caballoajedrez;
import java.util.Scanner;
import org.iesalandalus.programacion.utilidades.*;

public class Posicion {
			public int fila;
			public char columna;
			
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
					this.columna = columna;
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
				
				/*public static void main(String arg[]) {
					
					System.out.println("Introduze la fila");
					//int filaNueva = new Scanner(System.in).nextInt();
					int filaNueva = Entrada.entero();
					//Para validar el dato tenemos que forzzarlo como string
					System.out.println("Introduce la columna");
					char columnaNueva = Entrada.caracter();
					//Como es una sola letra, usamos charAt(0) para obtenerla
					//char letraColumna = columnaNueva.charAt(0);
					
					//validamos los valores introducidos
					
					if (filaNueva < 9 && filaNueva > 0) {
						System.out.println("Fila correcta");
					}
					else {
						throw new IllegalArgumentException("Los valores de la fila son incoherentes");
					}
					if (columnaNueva == 'a' || columnaNueva == 'b' || columnaNueva == 'c' || columnaNueva == 'd' || columnaNueva == 'e' || columnaNueva == 'f' || columnaNueva == 'g' || columnaNueva == 'h'){
						System.out.println("Columna correcta");
					}
					else {
						throw new IllegalArgumentException("Los valores de la columna son incoherentes");
					}
				}*/
				
			}
		}