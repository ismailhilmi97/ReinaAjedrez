package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	
	BLANCO("Blanco"),NEGRO("Negra");
	
	//ATRIBUTO
	private String cadenaAMostrar;
	
	//CONSTRUCTOR
	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	//toSTRING
	@Override
    public String toString() {
			return String.format("Posicion [cadenaAMostrar=%s]", cadenaAMostrar);
		}
}
