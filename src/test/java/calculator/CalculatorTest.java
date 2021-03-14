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
	    public void testSqrt_fun() {
	        double x = 25;
	        double expectedResult = 5.0;
	        double result = calculator.Sqrt_fun(x);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
		
		@Test
		public void testFactorial() {
			double x = 5;
	        double expectedResult = 120;
	        double result = calculator.Factorial(x);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testNat_log() {
			double x = 100;
	        double expectedResult = 4.6;
	        double result = calculator.Nat_log(x);
	        Assert.assertEquals(expectedResult, result, 01);
		}
		
		@Test
		public void testpower_xb() {
			double x = 9.0;
	        double b = 2.0;
	        double expectedResult = 81.0;
	        double result = calculator.power_xb(x, b);
	        Assert.assertEquals(expectedResult, result, 0.01);
		}

}
