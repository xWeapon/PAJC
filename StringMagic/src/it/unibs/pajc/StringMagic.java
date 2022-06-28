package it.unibs.pajc;

import java.util.HashMap;
import java.util.Map;

public class StringMagic {
	//non voglio un accesso diretto dall'esterno => private. 
	//Inoltre non voglio modificare la stringa base una volta costruito l'oggetto => final
	private final String baseString;
	
	public StringMagic(String _baseString) {
		this.baseString =_baseString;
	}

	public String getBaseString() {
		return baseString;
	}
	public String reverse() {
		char[] source = baseString.toCharArray();
		char[] dest = new char[source.length];
		
		for(int i=0; i<source.length; i++) {
			dest[i] = source[source.length - i - 1];
		}
		
		return new String(dest);
	}
	
	public String maskVowel() {
		return baseString.replaceAll("[aeiouAEIOU]", "*");
	}
	
	public int freq(char c) {
		int count = 0;
		for(char ch: baseString.toCharArray()) {
			if(ch == c) {
				count++;
			}
		}
		
		return count;
	}
	
	public void printMap() {
		HashMap<String,Integer> map = new HashMap();
		
		for(char ch: baseString.toCharArray()) {
			if(map.containsKey("" + ch)) {
				int count = map.get("" + ch);
				map.put("" + ch, count+1);
			}else {
				map.put("" + ch, 1);
			}
		}
		for(Map.Entry<String, Integer> kv: map.entrySet()) {
			System.out.println("S: " + kv.getKey() + " --> " + kv.getValue());
		}
	}
	
	@Override
	public String toString() {
		return baseString;
	}
}
