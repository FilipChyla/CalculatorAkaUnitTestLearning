import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoNumbersAddedShouldReturnCorrectResult(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();

        assertThat(simpleCalculator.add(1,3)).isEqualTo(4);
        assertThat(simpleCalculator.add(0,8)).isEqualTo(8);
        assertThat(simpleCalculator.add(3,15)).isEqualTo(18);
        assertThat(simpleCalculator.add(7,9)).isEqualTo(16);
        assertThat(simpleCalculator.add(-30.5f,-0.2f)).isEqualTo(-30.7f);
    }

    @Test
    void twoNumbersSubtractedShouldReturnCorrectResult(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();

        assertThat(simpleCalculator.subtract(5,3)).isEqualTo(2);
        assertThat(simpleCalculator.subtract(8,12)).isEqualTo(-4);
        assertThat(simpleCalculator.subtract(7.2f,4.6f)).isEqualTo(2.6f);
        assertThat(simpleCalculator.subtract(12,-8)).isEqualTo(20);
        assertThat(simpleCalculator.subtract(-6.9f,-53.5f)).isEqualTo(46.6f);
    }

    @Test
    void twoNumbersMultipliedShouldReturnCorrectResult(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();

        assertThat(simpleCalculator.multiply(3,4)).isEqualTo(12);
        assertThat(simpleCalculator.multiply(5,8)).isEqualTo(40);
        assertThat(simpleCalculator.multiply(-3,6)).isEqualTo(-18);
        assertThat(simpleCalculator.multiply(-2,-3.5f)).isEqualTo(7);
        assertThat(simpleCalculator.multiply(-0.5f, -12.5f)).isEqualTo(6.25f);
    }

    @Test
    void twoNumbersDividedShouldReturnCorrectResult() throws Exception {
        SimpleCalculator simpleCalculator=new SimpleCalculator();

        assertThat(simpleCalculator.divide(4,2)).isEqualTo(2);
        assertThat(simpleCalculator.divide(21,3)).isEqualTo(7);
        assertThat(simpleCalculator.divide(10,4)).isEqualTo(2.5f);
        assertThat(simpleCalculator.divide(-6,-2)).isEqualTo(3);
        assertThat(simpleCalculator.divide(-1.5f,0.5f)).isEqualTo(-3);

        Throwable thrown = catchThrowable(() -> simpleCalculator.divide(8,0));
        assertThat(thrown).isInstanceOf(Exception.class);
    }
}