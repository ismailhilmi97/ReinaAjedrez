package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
	//ATRIBUTOS
	private int fila;
	private char columna;
	
	//GET y SET
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) throws IllegalAccessException {
		if(fila>8 || fila<1) {
			throw new IllegalAccessException("El valor de fila no debe ser entre 1 y 8");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) throws IllegalAccessException {
		if(columna!='a' && columna!='b' && columna!='c' && columna!='d' && columna!='e' && columna!='f' && columna!='g' && columna!='h' 
		   && columna!='A' && columna!='B' && columna!='C' && columna!='D' && columna!='E' && columna!='F' && columna!='G' && columna!='H') {
			
			throw new IllegalAccessException("La columna debe ser una caracter entre a y h");
			
		}
		this.columna = columna;
	}
	
	
}
