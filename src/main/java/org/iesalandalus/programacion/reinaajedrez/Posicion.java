package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

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
		if(columna!='a' || columna!='b' || columna!='c' || columna!='d' || columna!='e' || columna!='f' || columna!='g' || columna!='h' 
		   || columna!='A' || columna!='B' || columna!='C' || columna!='D' || columna!='E' || columna!='F' || columna!='G' || columna!='H') {
			
			throw new IllegalAccessException("La columna debe ser una caracter entre a y h");
			
		}
		this.columna = columna;
	}
	public Posicion(int fila, char columna) throws IllegalAccessException {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion (Posicion posicion) throws IllegalAccessException {
		if(posicion==null) {
			throw new NullPointerException("La posicion no puede ser nula");
		}
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
	}
	//////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Posicion))
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	///////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return String.format("Posicion fila=%s, columna=%s", fila, columna);
	}
	
	
	
	
	
}
