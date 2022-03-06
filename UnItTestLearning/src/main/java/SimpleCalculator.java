public class SimpleCalculator {
    public float add(float... num) {
        float sum = 0;
        for (float i : num) {
            sum += i;
        }
        return sum;
    }

    public float subtract(float minuend, float subtrahend) {
        return minuend - subtrahend;
    }

    public float multiply(float multiplicand, float multiplier) {
        return multiplicand * multiplier;
    }

    public float divide(float dividend, float divider) throws Exception {
        if (divider == 0) {
            throw new Exception("You can't divide by 0!");
        } else {
            return dividend / divider;
        }
    }
}
