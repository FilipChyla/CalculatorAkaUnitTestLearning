import userinput.UserInput;
import userinterface.UserInterface;

public class SimpleCalculatorApp {
    private final UserInput userInput;
    private final SimpleCalculator simpleCalculator;
    private final UserInterface userInterface;

    public SimpleCalculatorApp(UserInput userInput, SimpleCalculator simpleCalculator, UserInterface userInterface) {
        this.simpleCalculator = simpleCalculator;
        this.userInput = userInput;
        this.userInterface = userInterface;
    }

    public float callOperation(int operation) {
        float[] numbers;

        switch (operation) {
            case 1 -> {
                numbers = userInput.getAdditionNumbers();
                return simpleCalculator.add(numbers[0], numbers[1]);
            }
            case 2 -> {
                numbers = userInput.getSubtractionNumbers();
                return simpleCalculator.subtract(numbers[0], numbers[1]);
            }
            case 3 -> {
                numbers = userInput.getMultiplyingNumbers();
                return simpleCalculator.multiply(numbers[0], numbers[1]);
            }
            case 4 -> {
                numbers = userInput.getDivisionNumbers();
                try {
                    return simpleCalculator.divide(numbers[0], numbers[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                    return 0;
                }
            }
            default -> {
                System.err.println("Something went wrong");
                return 0;
            }
        }

    }

    public int getOperation() {
        return userInput.getOperation();
    }

    public void showInterface() {
        userInterface.showInterface();
    }

    public void showResult(float result) {
        userInterface.showResult(result);
    }
}
