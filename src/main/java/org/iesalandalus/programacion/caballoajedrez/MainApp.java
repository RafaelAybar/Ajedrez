package org.iesalandalus.programacion.caballoajedrez;

public class MainApp {
	private Color color;
	private int numeroPrincipal;
	private int numeroMover;

	public void mostrarMenu() {
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
			this.color = Color.BLANCO;
		} else {
			this.color = Color.NEGRO;
		}

	}

	public void crearCaballoDefecto() {
		Caballo caballo = new Caballo();
		System.out.println("Se ha creado el caballo negro con la posición por defecto, (8,b)");
	}

	public void crearCaballoDefectoColor() {
		Caballo caballo = new Caballo(color);
	}

	public void mover() {

	}

	public void mostrarMenuDirecciones() {
		System.out.println("La lista de posiciones disponibles es la siguiente");
		System.out.println(
				"1 ARRIBA_IZQUIERDA 2 ARRIBA_DERECHA 3 DERECHA_ARRIBA 4 DERECHA_ABAJO 5 ABAJO_DERECHA 6 ABAJO_IZQUIERDA 7 IZQUIERDA_ARRIBA 8 IZQUIERDA_ABAJO");

	}

	public Direccion elegirDireccion(Direccion direccion) {
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
			throw new IllegalArgumentException("La fila introducida no es correcta");
		}
		return direccion;

	}

	public void crearCaballoColorPosicion(Color color, Direccion direccion) {

	}

	public void ejecutarOpcion(int numeroPrincipal) {
		switch (numeroPrincipal) {
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
//		numeroPrincipal = Entrada.entero();
		/*
		 * System.out.
		 * println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez"
		 * ); // Menú System.out.println("Bienvenido selecciona qué deseas hacer");
		 *
		 *
		 * i do { switch (numeroPrincipal) { case 1: Caballo posicion = new Caballo();
		 * System.out.println("Se ha creado el caballo por defecto en la posición (8,)"
		 * ); } } while (numeroPrincipal != 4); // int fila = Entrada.entero(); // char
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