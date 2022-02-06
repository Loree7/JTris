package it.unipa.prg.es12;

public class Posizione {
	private double x, y;

	public Posizione(double x, double y) {
		setX(x);
		setY(y);
	}

	public Posizione() {
		this(0, 0);
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return ("(" + getX() + ", " + getY() + ")");
	}

}