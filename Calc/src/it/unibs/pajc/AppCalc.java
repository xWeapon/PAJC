package it.unibs.pajc;
import java.util.*;

public class AppCalc {
	
	public static void main(String[] args) {

		CalcModel model = new CalcModel();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nInserisci A: ");
		double op1 = reader.nextDouble();
		
		System.out.println("\nInserisci B: ");
		double op2 = reader.nextDouble();
		
		String operator = null;//"+", "*", "-", "/"
		OperatoreBinario op = null;
		
		while(op == null) {
			System.out.println("\nInserisci operatore: ");
			operator = reader.next();
			op = model.getOperator(operator);
			
			if(op == null) {
				
				System.out.println("\nOperazioni disponibili: ");
				for(String key: model.getOperatorsSymbol())
					System.out.printf("%s ", key);
				
			}
		}	
		
		double result = op.eval(op1, op2);
		System.out.printf("\n%d %s %d = %d", op1, operator, op2, result);
	}
}
