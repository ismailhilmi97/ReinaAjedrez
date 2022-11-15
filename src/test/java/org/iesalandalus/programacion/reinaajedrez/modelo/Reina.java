package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Color color;
	private Posicion posicion;
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if(color == null) {
			if(posicion==null) {
				throw new NullPointerException("EL color no debe ser nulo");
			}
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion){
		if(posicion==null) {
			throw new NullPointerException("La posicion no debe ser nula");
		}
		this.posicion = posicion;
	}
	
	//CONSTRUCTOR POR DEFECTO
	public Reina() throws IllegalAccessException {
		color=Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}
	
	//CONSTRUCTOR QUE CREA UNA REINA DEPENDE DEL COLOR INTRODUCIDO
	public Reina(Color color) throws IllegalAccessException {
		this();
		if(color==Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		}
		else if(color==Color.NEGRA) {
			posicion = new Posicion(8, 'd');
		}
		setColor(color);
	}
	
	//EL MÉTODO MOVER
	public void mover(Direccion direccion,int pasos) {
		if(direccion==null) {
			throw new NullPointerException("La direccion no puede ser nula");
		}
		
	}

}
