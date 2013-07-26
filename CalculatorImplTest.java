package calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void testAdditionneritionner() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 5;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0;
		b = 5;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("a nul");
		}
		
		a = 5;
		b = 0;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("b nul");
		}
		
		a = 0;
		b = 0;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("a et b nuls");
		}
		
		a = -5;
		b = 5;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("a negatif");
		}
		
		a = 5;
		b = -5;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("b negatif");
		}
		a = -5;
		b = -5;
		res = a + b;
		if (calc.Additionner(a, b) != res) {
			fail("a et b negatif");
		}
	}

	@Test
	public void testSoustraire() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplier() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDiviser() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 5;
		res = a / b;
		if (calc.Diviser(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0;
		b = 5;
		res = a / b;
		if (calc.Diviser(a, b) != res) {
			fail("a nul");
		}
		
		a = -5;
		b = 5;
		res = a / b;
		if (calc.Diviser(a, b) != res) {
			fail("a negatif");
		}
		
		a = 5;
		b = -5;
		res = a / b;
		if (calc.Diviser(a, b) != res) {
		fail("b negatif");
		}
		
		a = -5;
		b = -5;
		res = a / b;
		if (calc.Diviser(a, b) != res) {
			fail("a et b negatif");
		}
		
	}
	

	@Test (expected = ArithmeticException.class)
	public final void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 0;
		res = 0;
		if (calc.Diviser(a, b) != res) {
		fail("b nul");
		}
	
		a = 0;
		b = 0;
		res = 0;
		if (calc.Diviser(a, b) != res) {
			fail("a et b nuls");
			}
		
	}

}
