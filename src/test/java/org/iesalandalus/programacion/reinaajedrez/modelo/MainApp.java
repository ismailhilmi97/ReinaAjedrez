package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class MainApp {
	private static  Reina reina;
	//
	
	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		System.out.println("------- BIENVENIDO EN NUESTA APPLICACIÓN-------");
		System.out.println();
		Consola.elegirOpcionMenu();
	}
	
	static void crearReinaDefecto() {
		try {
			System.out.println("*******Crear una reina por defecto*******");
			System.out.println();
			reina=new Reina();
			System.out.println("Los informacion de la reina creada: "+reina.toString());
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void crearReinaColor() {
		try {
			System.out.println("*******Crear una reina elegiendo el color*******");
			System.out.println();
			reina = new Reina(Consola.elegirColor());
			System.out.println("Informacio de la reina creada: "+reina.toString());
			System.out.println(); // saltar de linea
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
	}
	
	
	private void mover() throws OperationNotSupportedException {
		reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
	}
	
	private void mostrarReina() {
		try {
			reina.toString();
		} catch (Exception e) {
			System.out.println("No se puede crear la reina.");
		}
		
	}
	
	public static void main(String[] args) throws OperationNotSupportedException{
		
		ejecutarOpcion(1);
		
	}

}
