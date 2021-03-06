package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	private static Color color;
	private int numeroPrincipal;
	private static int numeroMover;
	private static Caballo caballo;

	public static void mostrarMenu() {
		System.out.println("Introduce 1 para crear un caballo por defecto");
		System.out.println("Introduce 2 para crear un caballo de un color con una columna inicial válida");
		System.out.println("Introduce 3 para mover el caballo");
		System.out.println("Introduce 4 para salir");
	}

	public int elegirOpcion() {
		if (numeroPrincipal > 4 || numeroPrincipal < 1) {
			throw new IllegalArgumentException("la opción introducida no es correcta");
		} else {
			return numeroPrincipal;
		}
	}

	public void elegirColor(Color color) {
		if (color.equals(Color.BLANCO)) {
			MainApp.color = Color.BLANCO;
		} else {
			MainApp.color = Color.NEGRO;
		}

	}

	public static Caballo crearCaballoDefecto() {
		Caballo caballo = new Caballo();
		return caballo;
	}

	public void crearCaballoDefectoColor() {
		Caballo caballo = new Caballo(color);
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("La lista de posiciones disponibles es la siguiente");
		System.out.println(
				"1 ARRIBA_IZQUIERDA 2 ARRIBA_DERECHA 3 DERECHA_ARRIBA 4 DERECHA_ABAJO 5 ABAJO_DERECHA 6 ABAJO_IZQUIERDA 7 IZQUIERDA_ARRIBA 8 IZQUIERDA_ABAJO");

	}

	public static Direccion elegirDireccion(int numeroMover) {
		Direccion direccion;
		switch (numeroMover) {
		case 1:
			direccion = Direccion.ARRIBA_DERECHA;
			break;
		case 2:
			direccion = Direccion.ARRIBA_DERECHA;
			break;
		case 3:
			direccion = Direccion.DERECHA_ARRIBA;
			break;
		case 4:
			direccion = Direccion.DERECHA_ABAJO;
			break;
		case 5:
			direccion = Direccion.ABAJO_DERECHA;
			break;
		case 6:
			direccion = Direccion.ABAJO_IZQUIERDA;
			break;
		case 7:
			direccion = Direccion.IZQUIERDA_ARRIBA;
			break;
		case 8:
			direccion = Direccion.IZQUIERDA_ABAJO;
			break;
		default:
			throw new IllegalArgumentException("El valor introducido no es correcto");
		}
		return direccion;
	}

	public static Caballo crearCaballoColorPosicion(Color color) {
		Caballo caballo = new Caballo(color);
		System.out.println("Se ha creado un caballo del color introducido");
		return caballo;
	}

	public static void ejecutarOpcion(int numeroPrincipal) throws OperationNotSupportedException {
		switch (numeroPrincipal) {
		case 1:
			caballo = crearCaballoDefecto();
			System.out.println("Se ha creado un caballo en la posición por defecto (8,b)");
			break;
		case 2:
			System.out.println("Introduce el color que quieres: 1 Blanco 2 Negro");
			int opcion = Entrada.entero();
			if (opcion == 1) {
				color = Color.BLANCO;
				caballo = crearCaballoColorPosicion(color);
				System.out.println("Se ha creado un caballo de color blanco en la posición (1,b)");
			} else if (opcion == 2) {
				color = Color.NEGRO;
				caballo = crearCaballoColorPosicion(color);
				System.out.println("Se ha creado un caballo de color negroen la posición (8,b)");
			} else {
				throw new IllegalArgumentException("El valor introducido no es correcto");
			}

			break;
		case 3:
			if (caballo == null) {
				System.out.println("No se puede mover el caballo si no lo has creado previamente");
			} else {
				mostrarMenuDirecciones();
				int numeroMover = Entrada.entero();
				Direccion direccion = elegirDireccion(numeroMover);

				Caballo.mover(direccion);
				System.out.println("El caballo se ha desplazado en la dirección introducida");

			}
			break;
		case 4:
			System.out.println("Hasta luego");
			break;
		default:
			throw new IllegalArgumentException("El valor introducido no es correcto");
		}
	}

	public static void main(String[] args) throws OperationNotSupportedException {
		System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");

		mostrarMenu();
		int numeroPrincipal = Entrada.entero();
		do {
			ejecutarOpcion(numeroPrincipal);
			System.out.println("Selecciona qué quieres hacer ahora");
			numeroPrincipal = Entrada.entero();
		} while (numeroPrincipal != 4);
	}
}