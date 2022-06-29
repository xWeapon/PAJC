package it.unibs.pajc;

public class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
	}
	
	public int getSide() {
		return height;
	}
	
	@Override
	public String toString() {
		return String.format("Quadrato di lato: %d ", getSide());
	}
	
}
