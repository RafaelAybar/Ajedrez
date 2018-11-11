package org.iesalandalus.programacion.caballoajedrez;
import org.iesalandalus.programacion.caballoajedrez.Color;

public class Caballo {
	char columna;
	int fila;
	Color color;
	//Recibimos la posición del caballo
	String posicion = (new Posicion(fila, columna)).toString();
	
	//Creamos el setter para color
	public void setColor(String color) {
		/*ValueOf nos dará una excepción IllegalArgumentException si el color 
		que hemos introducido NO está contemplado en el enum que hemos definido*/
		 this.color = Color.valueOf(color);
		 }
	//Creamos el getter para el color
	public Color getColor(Color color) {
		return color;
		}
	//Creamos el setter para posicion
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	}