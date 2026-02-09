package InterestCalculator.Calc;

import org.junit.Test;

import junit.framework.TestCase;


public class AppTest 
    extends TestCase
{
    @Test
    public void testSimpleInterestCalculation() {
    	assertEquals(100.00, App.interestCalculation('s', 10, 100, 10), 0.005);
    }
    
    @Test
    public void testCompoundInterestCalculation() {
    	assertEquals(159.37, App.interestCalculation('c', 10, 100, 10), 0.005);
    }
}
