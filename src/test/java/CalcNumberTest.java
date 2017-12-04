/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import number.CalcNumber;

import static org.junit.Assert.*;

public class CalcNumberTest {
    @Test public void testcalcNumber() {
        CalcNumber calc = new CalcNumber();
        int value = calc.calcNumber(10256, 512);
        assertEquals(value, -1);
        value = calc.calcNumber(104, 515);
        assertEquals(value, 150145);
    }
}