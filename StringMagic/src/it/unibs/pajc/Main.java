package it.unibs.pajc;

public class Main {
	public static final String FRASE = "Ciao questa è una prova";

	public static void main(String[] args) {
		StringMagic magic = new StringMagic("FRASE");
		System.out.println(magic);
		System.out.println("reverse:" + magic.reverse());
		//System.out.println("Mascheramento vocali: " + magic.maskVowel());
		System.out.println("Freq(T):" + magic.freq('T'));
		magic.printMap();

	}

}
