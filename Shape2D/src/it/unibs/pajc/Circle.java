package it.unibs.pajc;

public class Circle extends Ellipses {
	
	private final int radius;
	public Circle(int radius) {
		super(radius*2,radius*2);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int perimeter() {
		return (int) (Math.PI * 2 * getRadius());
	}

	public String toString() {
		return String.format("Cerchio di raggio: %d ", getRadius());
	}	
}
