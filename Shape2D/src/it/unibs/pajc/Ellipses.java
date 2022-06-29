package it.unibs.pajc;

public class Ellipses implements Shape2D {
	int asseMaggiore;
	int asseMinore;
	
	public Ellipses (int _asseMaggiore, int _asseMinore) {
		this.asseMaggiore =_asseMaggiore;
		this.asseMinore = _asseMinore;
	}

	@Override
	public int perimeter() {
		return (int)(2*Math.PI*(Math.sqrt(Math.pow(asseMaggiore, 2) + Math.pow(asseMinore, 2))/2.0));
	}

	@Override
	public int area() {
		return (int)(Math.PI*asseMaggiore*asseMinore / 4.0);
	}
	

}
