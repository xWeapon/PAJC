package it.unibs.pajc;
import java.util.*;

public class CalcModel {
	private HashMap<String, OperatoreBinario> calc;
	
	public CalcModel() {
		calc = initCalc();
	}
	
	private HashMap<String, OperatoreBinario> initCalc() {
		HashMap<String, OperatoreBinario> calc = new HashMap();
		
		calc.put("+", (x,y) -> x + y);
		calc.put("-", (x,y) -> x - y);
		calc.put("*", (x,y) -> x * y);
		calc.put("/", (x,y) -> x / y);
		
	return calc;
		
	}
	
	public OperatoreBinario getOperator(String opSymbol) {
		return calc.get(opSymbol);
	}
	
	public Set<String> getOperatorsSymbol() {
		return calc.keySet();
	}
}
