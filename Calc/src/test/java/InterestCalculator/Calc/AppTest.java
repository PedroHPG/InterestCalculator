package InterestCalculator.Calc;

import static org.junit.Assert.assertThat;
import InterestCalculator.Calc.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    @Test
    public void testSimpleInterestCalculation() {
    	assertEquals(App.interestCalculation('s', 10, 100, 10), 100.00);
    }
}
