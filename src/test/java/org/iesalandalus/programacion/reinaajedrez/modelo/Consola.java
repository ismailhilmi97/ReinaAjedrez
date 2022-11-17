package org.iesalandalus.programacion.reinaajedrez.modelo;
import java.lang.reflect.Method;

import java.util.InputMismatchException;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("****************Menú de Opciones**********************");
		System.out.println("1. Crear reina por defecto.");
		System.out.println("2. Crear reina eligiendo el color");
		System.out.println("3. Mover");
		System.out.println("4. Salir");
		System.out.println("******************************************************");

	}

	public static int elegirOpcionMenu() throws OperationNotSupportedException {

		int opcion = 0;
		boolean salir = true;
		try {
			while (salir) {
				mostrarMenu();
				System.out.print("Elige una opción: ");
				opcion = Entrada.entero();
				System.out.println();

				switch (opcion) {
				case 1: // Crear reina por defecto
					MainApp.crearReinaDefecto();

					break;

				case 2: // Crear reina eligiendo el color
					MainApp.crearReinaColor();
					break;

				case 3: // Mover
					try {
						System.out.println("*******Mover la reina*******");
						Reina reina3 = new Reina(Consola.elegirColor());
						System.out.println("Posicion Actual: " + reina3.toString());
						System.out.println();
						reina3.mover(Consola.elegirDireccion(), Consola.elegirPasos());
						System.out.println("La nueva posicion: "+reina3.toString());
						System.out.println();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;

				case 4: // Salir
					despedirse();
					salir = false;
					break;
				default:
					System.out.println("******Opción no válida, debes ingresar un número entre 1 y 4******");
					System.out.println();
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
		}

		return opcion;
	}

	// EL MÉTDODO ELEGIR OPCIÓN DE COLORES
	static public Color elegirColor() {
		Color colorOpcion = null;
		int opcion = 0;
		try {
			while (opcion < 1 || opcion > 2) {
				System.out.println("1. Blanco");
				System.out.println("2. Negro");
				System.out.println();
				System.out.print("Ingresa el color de la reina : ");
				opcion = Entrada.entero();
				System.out.println("****************************************************");
				System.out.println();
				if (opcion == 1) {
					colorOpcion = Color.BLANCO;
				} else if (opcion == 2) {
					colorOpcion = Color.NEGRO;
				} else
					System.out.println("Debes insertar 1 o 2");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
		}

		return colorOpcion;
	}

	// MENÚ CON LOS DIRECCIONES DISPONIBLES
	static public void mostrarMenuDirecciones() {
		System.out.println("****************Menú de Direcciones**********************");
		System.out.println("[1] NORTE.");
		System.out.println("[2] NORESTE.");
		System.out.println("[3] ESTE");
		System.out.println("[4] SURESTE");
		System.out.println("[5] SUR.");
		System.out.println("[6] SUROESTE.");
		System.out.println("[7] OESTE.");
		System.out.println("[8] NOROESTE.");
		System.out.println();
	}

	// MÉTODO PARA ELEGIR UNA DIRECCIÓN VÁLIDA
	public static Direccion elegirDireccion() {
		Direccion direccionOpcion = null;
		int opcion = 0;
		try {
			while (opcion <= 0 || opcion > 8) {
				mostrarMenuDirecciones();
				System.out.print("Elige una dirección: ");
				opcion = Entrada.entero();
				System.out.println("****************************************************");
				
				
				switch (opcion) {
				case 1:
					direccionOpcion = Direccion.NORTE;
					break;
				case 2:
					direccionOpcion = Direccion.NORESTE;
					break;
				case 3:
					direccionOpcion = Direccion.ESTE;
					break;
				case 4:
					direccionOpcion = Direccion.SURESTE;
					break;
				case 5:
					direccionOpcion = Direccion.SUR;
					break;
				case 6:
					direccionOpcion = Direccion.SUROESTE;
					break;
				case 7:
					direccionOpcion = Direccion.OESTE;
					break;
				case 8:
					direccionOpcion = Direccion.NOROESTE;
					break;
				default:
					System.out.println("Solo números entre 1 y 8");
					break;
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
		}
		return direccionOpcion;
	}

	// MÉTODO PARA ELEGIR EL NUMERO DE PASOS
	public static int elegirPasos() {
		int numeroPasos = 0;
		int opcion = 0;
		try {
			while (opcion < 1 || opcion > 7) {
				System.out.println("****************Menú del nuúmero de pasos**********************");
				System.out.println("[1] UN PASO.");
				System.out.println("[2] DOS PASOS.");
				System.out.println("[3] TRES PASOS");
				System.out.println("[4] CUATRO PASOS");
				System.out.println("[5] CINCO PASOS.");
				System.out.println("[6] SEIS PASOS.");
				System.out.println("[7] SIETE PASOS.");
				System.out.println();
				System.out.print("Elige el número de pasos : " );
				opcion = Entrada.entero();
				System.out.println("****************************************************");
				
				if (opcion == 1) {
					numeroPasos = 1;
				} else if (opcion == 2) {
					numeroPasos = 2;
				} else if (opcion == 3) {
					numeroPasos = 3;
				} else if (opcion == 4) {
					numeroPasos = 4;
				} else if (opcion == 5) {
					numeroPasos = 5;
				} else if (opcion == 6) {
					numeroPasos = 6;
				} else if (opcion == 7) {
					numeroPasos = 7;
				} else
					System.out.println("Debe ingresar un número entre 1 y 7");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
		}

		return numeroPasos;
	}

	// MÉTODO CON UN MENSAJE DE DESPEDIDA
	public static void despedirse() {
		System.out.println("*************************************************");
		System.out.println("*******GRACIAS POR VISITARNOS, HASTA LUEGO*******");
		System.out.println("*************************************************");
	}

}
