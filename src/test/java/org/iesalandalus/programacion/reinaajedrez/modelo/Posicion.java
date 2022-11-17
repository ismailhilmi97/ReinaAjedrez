package org.iesalandalus.programacion.reinaajedrez.modelo;

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
			if(columna>'h' || columna<'a') {
				
				throw new IllegalAccessException("La columna debe ser una caracter entre a y h");
				
			}
			this.columna = columna;
		}
		
		//CONSTRUCTORES
		public Posicion(int fila, char columna) {
			if(fila>8 || fila<1) {
				throw new IllegalArgumentException("ERROR: Fila no válida.");
			}
			this.fila=fila;
			if(columna>'h' || columna<'a') {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			}
			this.columna=columna;
		}
		
		public Posicion (Posicion posicion) {
			if(posicion==null) {
				throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
			}
			this.fila=posicion.getFila();
			this.columna=posicion.getColumna();
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
			return String.format("fila=%s, columna=%s", fila, columna);
		}

}
