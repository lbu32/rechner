package name.noelke.seminar2010.example.calculator.tests;

import junit.framework.TestCase;
import name.noelke.seminar2010.example.calculator.Calculator;

public class CalculatorTestV3 extends TestCase {

	private static Calculator calculator;

	public CalculatorTestV3() {
		System.out.println("\tSwitch on calculator");
		calculator = new Calculator();
		calculator.switchOn();
	}
	
	public void setUp() {
		calculator.clear();
	}

	public void testAdd() {
		calculator.add(1); 
		calculator.add(1); 
		assertEquals(calculator.getResult(), 2); 
	}

	public void testDivide() {
		calculator.add(8); 
		calculator.divide(2); 
		assertEquals(calculator.getResult(), 4); 
	}
}