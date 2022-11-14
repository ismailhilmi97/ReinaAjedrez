package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	
	BLANCO("Blanco"),NEGRA("Negro");
	
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
	

