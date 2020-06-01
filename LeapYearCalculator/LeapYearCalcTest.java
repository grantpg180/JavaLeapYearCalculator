package LeapYearCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearCalcTest {
    
    @Test
    public final void yearsBelow1000(){
    LeapYearCalc year = new LeapYearCalc();
        assertTrue("500", year.calculateYear(500));
        assertTrue("999", year.calculateYear(999));

    }
}