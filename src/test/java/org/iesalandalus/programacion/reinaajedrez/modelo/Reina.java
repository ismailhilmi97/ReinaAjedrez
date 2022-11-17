package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			if (posicion == null) {
				throw new NullPointerException("El color no es el esperado.");
			}
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posición no es la esperada.");
		}
		this.posicion = posicion;
	}

	// CONSTRUCTOR POR DEFECTO
	public Reina() {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	// CONSTRUCTOR QUE CREA UNA REINA DEPENDE DEL COLOR PASADO COMO PARAMETRO
	public Reina(Color color) {
		this();
		if(color==null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
		}
		setColor(color);
	}

	// EL MÉTODO MOVER
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		/////////////////////////////////////////////////
		System.out.println("-- Vamos a mover la reina -- ");
		switch (direccion) {
		case NORTE:
			if (posicion.getFila() + pasos > 8) {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
			break;

		case SUR:
			if (posicion.getFila() - pasos <= 0) {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
			break;

		case ESTE:
			if (posicion.getColumna() + (char) pasos > 'h') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));
			break;

		case OESTE:
			if (posicion.getColumna() - (char) pasos < 'a') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));
			break;

		case NORESTE:
			if (posicion.getFila() + pasos > 8 || posicion.getColumna() + (char) pasos > 'h') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + pasos)));
			break;

		case SUROESTE:
			if (posicion.getFila() - pasos <= 0 || posicion.getColumna() - (char) pasos < 'a') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - pasos)));
			break;

		case SURESTE:
			if (posicion.getFila() - pasos <= 0 || posicion.getColumna() + (char) pasos > 'h') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + pasos)));
			break;

		case NOROESTE:
			if (posicion.getFila() + pasos > 8 || posicion.getColumna() - (char) pasos < 'a') {
				posicion = getPosicion();
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			} else
				setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - pasos)));
			break;
		default:
			break;
		}
	}

	// toSTRING
	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}

}
