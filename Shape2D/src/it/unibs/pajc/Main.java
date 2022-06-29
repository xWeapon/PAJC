package it.unibs.pajc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shape2D> listaOggetti = new ArrayList(); 
		listaOggetti.add(new Rectangle(30, 50));
		listaOggetti.add(new Square(10));
		listaOggetti.add(new Circle(10));
		
		Shape2D prova = new Circle(20);
		prova.area();
		for(Shape2D s: listaOggetti) {
			System.out.println(s);
			System.out.println("Il perimetro e': "+ s.perimeter());
			if(s instanceof Rectangle) {
				System.out.println("è un rettangolo!");
			}
		}

		HashMap<Class, Integer> map = new HashMap();
		/*
		 * Scorro tutti gli oggetti nella listaOggetti e per ogni oggetto determino
		 * la classe dell'oggetto. Se nella map esiste già un oggetto dichiarato per quella classe.
		 * 
		 */
		for(Shape2D s: listaOggetti) {
			Class key = s.getClass();
			if(map.containsKey(key)) {
				int counter = map.get(key);
				map.put(key, counter + 1);
			}else {
			map.put(key, 1);
			}
		}
	/*
	 * for each sulle coppie chiavi-valore all'interno della map.
	 */
	for(Map.Entry<Class, Integer> kv: map.entrySet()) {
		System.out.printf("%s: %d\n", kv.getKey(), kv.getValue());
		}
	}
}

//1h09m lab 1 pt B



