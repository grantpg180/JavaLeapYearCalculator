package LeapYearCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearCalcTest {
    
    @Test
    public final void testsYearsBelow1000(){
    LeapYearCalc year = new LeapYearCalc();
        assertTrue("500", year.calculateYearsUnder999(500));
        assertTrue("999", year.calculateYearsUnder999(999));

    }
    @Test
    public void calculateLeapYearsBelow1000(){
        LeapYearCalc year = new LeapYearCalc();
        assertEquals("400", year.calculateLeapYearsBelow1000(400));
        assertEquals("322", year.calculateLeapYearsBelow1000(322));


    }

   
}