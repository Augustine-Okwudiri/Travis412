package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testminus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(1, 1), 0);
	}
	 @Test
	    public void testAddNegativeNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(-9, calc.add(-4, -5));
	    }

	    @Test
	    public void testAddWithZero() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(6, calc.add(6, 0));
	    }

	  
	    @Test
	    public void testMinusPositiveNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(2, calc.minus(5, 3));
	    }

	    @Test
	    public void testMinusNegativeNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(1, calc.minus(-4, -5));
	    }

	    @Test
	    public void testMinusWithZero() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(7, calc.minus(7, 0));
	    }

	   
	    @Test
	    public void testMultiplyPositiveNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(20, calc.multiply(4, 5));
	    }

	    @Test
	    public void testMultiplyByZero() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(0, calc.multiply(7, 0));
	    }

	    @Test
	    public void testMultiplyNegativeNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(-15, calc.multiply(-3, 5));
	    }

	    @Test
	    public void testMultiplyTwoNegatives() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(12, calc.multiply(-3, -4));
	    }

	    
	    @Test
	    public void testDividePositiveNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(3, calc.divide(9, 3));
	    }

	    @Test
	    public void testDivideNegativeNumbers() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(-4, calc.divide(-20, 5));
	    }

	    @Test
	    public void testDivideTwoNegatives() {
	        SimpleCalculator calc = new SimpleCalculator();
	        assertEquals(5, calc.divide(-25, -5));
	    }

	    @Test(expected = ArithmeticException.class)
	    public void testDivideByZero() {
	        SimpleCalculator calc = new SimpleCalculator();
	        calc.divide(10, 0);
	    }

}
