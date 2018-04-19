package name.noelke.seminar2010.example.calculator.tests;

import static org.junit.Assert.assertEquals;
import name.noelke.seminar2010.example.calculator.Calculator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void switchOnCalculator() {
		System.out.println("\tSwitch on calculator");
		calculator = new Calculator();
		calculator.switchOn();
	}

	@AfterClass
	public static void switchOffCalculator() {
		System.out.println("\tSwitch off calculator");
		calculator.switchOff();
		calculator = null;
	}


	@Before
	public void clearCalculator() {
		calculator.clear();
	}

	@Test
	public void add() {
		calculator.add(1); 
		calculator.add(1); 
		assertEquals(calculator.getResult(), 2); 
	}

	@Test
	public void subtract() {
		calculator.add(10); 
		calculator.subtract(2); 
		assertEquals(calculator.getResult(), 8); 
	}

	@Test
	public void divide() {
		calculator.add(8); 
		calculator.divide(2); 
		assertEquals(calculator.getResult(), 4); 
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		calculator.divide(0); 
	}

	@Test(timeout = 100)
	public void squareRoot() {
		calculator.squareRoot(100);
		assertEquals(calculator.getResult(), 10);
	}

	@Ignore("not ready yet")
	@Test
	public void multiply() {
		calculator.add(10); 
		calculator.multiply(10); 
		assertEquals(calculator.getResult(), 100); 
	}
}