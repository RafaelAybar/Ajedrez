package org.iesalandalus.programacion.caballoajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public void mostrarMenu() {
		System.out.println("Introduce 1 para crear un caballo por defecto");
		System.out.println("Introduce 2 para crear un caballo de un color con una columna inicial válida");
		System.out.println("Introduce 3 para mover el caballo");
		System.out.println("Introduce 4 para salir");
	}

	/*
	 * public int elegirOpcion() { // Validamos la respuesta if (respuesta > 4 ||
	 * respuesta < 1) { throw new
	 * IllegalArgumentException("la opción introducida no es correcta"); } else {
	 * return respuesta; } }
	 */

	public void elegirColor(Color color) {
		if (color.equals(Color.BLANCO)) {
			color = Color.BLANCO;
		} else {
			color = Color.NEGRO;
		}

	}

	public void crearCaballoDefecto() {
		Caballo caballodefecto = new Caballo();
	}

	public void ejecutarOpcion(int respuesta) {
		switch (respuesta) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Opción no válida");
		}
	}

	public static void main(String[] args) {
		int respuesta = Entrada.entero();
		/*
		 * System.out.
		 * println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez"
		 * ); // Menú System.out.println("Bienvenido selecciona qué deseas hacer");
		 *
		 *
		 * i do { switch (respuesta) { case 1: Caballo posicion = new Caballo();
		 * System.out.println("Se ha creado el caballo por defecto en la posición (8,)"
		 * ); } } while (respuesta != 4); // int fila = Entrada.entero(); // char
		 * columna = Entrada.caracter();
		 */
	}

	/*
	 *
	 * int filaNueva = new Scanner(System.in).nextInt(); int filaNueva =
	 * Entrada.entero(); //Para validar el dato tenemos que forzzarlo como string
	 * System.out.println("Introduce la columna"); char columnaNueva =
	 * Entrada.caracter(); //Como es una sola letra, usamos charAt(0) para obtenerla
	 * //char letraColumna = columnaNueva.charAt(0);
	 *
	 * //validamos los valores introducidos
	 *
	 * if (filaNueva < 9 && filaNueva > 0) { System.out.println("Fila correcta"); }
	 * else { throw new
	 * IllegalArgumentException("Los valores de la fila son incoherentes"); } if
	 * (columnaNueva == 'a' || columnaNueva == 'b' || columnaNueva == 'c' ||
	 * columnaNueva == 'd' || columnaNueva == 'e' || columnaNueva == 'f' ||
	 * columnaNueva == 'g' || columnaNueva == 'h'){
	 * System.out.println("Columna correcta"); } else { throw new
	 * IllegalArgumentException("Los valores de la columna son incoherentes"); } }
	 */

	/*
	 * Instanciamos Color Color blanco = Color.BLANCO; Color negro = Color.NEGRO;
	 *
	 * //Creamos el enum Direccion
	 *
	 * //Instanciamos Direccion Direccion arriba_izquierda =
	 * Direccion.ARRIBA_IZQUIERDA; Direccion arriba_derecha =
	 * Direccion.ARRIBA_DERECHA; Direccion derecha_arriba =
	 * Direccion.DERECHA_ARRIBA; Direccion derecha_abajo = Direccion.DERECHA_ABAJO;
	 * Direccion abajo_derecha = Direccion.ABAJO_DERECHA; Direccion abajo_izquierda
	 * = Direccion.ABAJO_IZQUIERDA; Direccion izquierda_arriba =
	 * Direccion.IZQUIERDA_ARRIBA; Direccion izquierda_abajo =
	 * Direccion.IZQUIERDA_ABAJO;
	 *
	 *
	 *
	 */
}