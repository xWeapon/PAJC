package it.unibs.pajc;

import java.io.*;
class FibonacciMain {

        public static long fibonacci(long i) {
	if (i == 0) return 0;
	else if (i == 1) return 1;
	else return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
	long i;
	System.out.print("Inserire un intero i >= 0: ");
	i = Integer.parseInt(br.readLine());
	System.out.print("fibonacci(" + i + ") = " + fibonacci(i));
    }
}
