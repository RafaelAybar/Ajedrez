package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");
		
	}
	//Creamos el enum Color
	public enum Color {
		BLANCO, NEGRO
	}
	
	//Instanciamos Color
	Color blanco = Color.BLANCO;
	Color negro = Color.NEGRO;
	
	//Creamos el enum Direccion
	public enum Direccion{
		ARRIBA_IZQUIERDA, ARRIBA_DERECHA, DERECHA_ARRIBA, DERECHA_ABAJO, ABAJO_DERECHA,  ABAJO_IZQUIERDA, IZQUIERDA_ARRIBA, IZQUIERDA_ABAJO
	}
	//Instanciamos Direccion
	Direccion arriba_izquierda = Direccion.ARRIBA_IZQUIERDA;
	Direccion arriba_derecha = Direccion.ARRIBA_DERECHA;
	Direccion derecha_arriba = Direccion.DERECHA_ARRIBA;
	Direccion derecha_abajo = Direccion.DERECHA_ABAJO;
	Direccion abajo_derecha = Direccion.ABAJO_DERECHA;
	Direccion abajo_izquierda = Direccion.ABAJO_IZQUIERDA;
	Direccion izquierda_arriba = Direccion.IZQUIERDA_ARRIBA;
	Direccion izquierda_abajo = Direccion.IZQUIERDA_ABAJO;
	
	//Creamos la clase Posicion
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
				throw new IllegalArgumentException("Los valores de la colummna son incoherentes");
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
	}
	
}