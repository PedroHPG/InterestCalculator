package InterestCalculator.Calc;

import org.junit.Test;

import junit.framework.TestCase;


public class AppTest 
    extends TestCase
{
    @Test
    public void testSimpleInterestCalculation() {
    	assertEquals(App.interestCalculation('s', 10, 100, 10), 100.00);
    }
    
    @Test
    public void testCompoundInterestCalculation() {
    	assertEquals(App.interestCalculation('c', 10, 100, 10), 159.37);
    }
}
