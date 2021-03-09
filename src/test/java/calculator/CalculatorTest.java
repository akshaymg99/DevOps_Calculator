package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

		@Test
	    public void testAdd() {
	        double a = 15.0;
	        double b = 20.0;
	        double expectedResult = 35.0;
	        double result = calculator.Add(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
		
		@Test
		public void testSubtract() {
			double a = 34;
	        double b = 12;
	        double expectedResult = 22;
	        double result = calculator.Subtract(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testMultiply() {
			double a = 18.5;
	        double b = 12.6;
	        double expectedResult = 233.1;
	        double result = calculator.Multiply(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testDivide() {
			double a = 60.0;
	        double b = 12.0;
	        double expectedResult = 5.0;
	        double result = calculator.Divide(a, b);
	        Assert.assertEquals(expectedResult, result, 0.0001);
		}
		
		@Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        int a = 25;
	        int b = 0;
	        calculator.Divide(a, b);
	    }
}
