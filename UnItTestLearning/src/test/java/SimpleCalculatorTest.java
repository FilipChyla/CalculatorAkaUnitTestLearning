import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2,2));
    }
    @Test
    void threePlusTenShouldEqualThirteen(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(13, simpleCalculator.add(3,10));
    }
    @Test
    void tenPlusThreeShouldEqualThirteen(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(13, simpleCalculator.add(10,3));
    }

    @Test
    void twoMinusTwoShouldEqualZero(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(0, simpleCalculator.subtract(2,2));
    }
    @Test
    void threeMinusTenShouldEqualNegativeSeven(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(-7, simpleCalculator.subtract(3,10));
    }
    @Test
    void tenMinusThreeShouldEqualSeven(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(7, simpleCalculator.subtract(10,3));
    }
    @Test
    void anythingMinusSameNumberShouldEqualZero(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(0, simpleCalculator.subtract(8,8));
    }

    @Test
    void twoTimesTwoShouldEqualFour(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(4, simpleCalculator.multiply(2,2));
    }
    @Test
    void threeTimesTenShouldEqualThirty(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(30, simpleCalculator.multiply(3,10));
    }
    @Test
    void tenTimesThreeShouldEqualThirty(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(30, simpleCalculator.multiply(10,3));
    }
    @Test
    void anythingTimesZeroShouldEqualZero(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(0, simpleCalculator.multiply(6,0));
    }

    @Test
    void twoDividedByTwoShouldEqualOne(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(1,simpleCalculator.divide(2,2));
    }
    @Test
    void threeDividedBySixShouldEqualHalf(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(0.5,simpleCalculator.divide(3,6));
    }
    @Test
    void fifteenDividedByFiveShouldEqualThree(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        assertEquals(3,simpleCalculator.divide(15,5));
    }
}