package it.unibs.pajc;

public class Rectangle implements Shape2D {
	protected int height;
	protected int width;
	
	public Rectangle(int _width, int _height) {
		this.width =_width;
		this.height =_height;
	}

	@Override
	public int perimeter() {
		return (height + width)*2;
	}

	@Override
	public int area() {
		return height*width;
	}

	@Override
	public String toString() {
		return String.format("Rettangolo: %d x %d", width, height);
	}
	
}
