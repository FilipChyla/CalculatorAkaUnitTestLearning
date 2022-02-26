package userinput;

import java.util.Scanner;

public class ConsoleBasedUserInput implements UserInput {
    private final Scanner userInput = new Scanner(System.in);

    @Override
    public int getOperation() {
        Integer operation = null;

        while (operation == null) {
            try {
                operation = userInput.nextInt();

                if (operation < 1 || operation > 4) {
                    System.err.print("Wrong input! Try again: ");
                    operation = null;
                }

            } catch (Exception e) {
                System.err.print("Wrong input! Try again: ");
                userInput.next();
            }
        }

        return operation;
    }

    @Override
    public float getNumber() {
        Float number = null;

        while (number == null) {
            try {
                number = userInput.nextFloat();
            } catch (Exception e) {
                System.err.print("Wrong input! Try again: ");
                userInput.next();
            }
        }

        return number;
    }

    @Override
    public float[] getAdditionNumbers() {
        float[] numbers = new float[2];

        System.out.print("Type in first addend: ");
        numbers[0] = this.getNumber();

        System.out.print("Type in second addend: ");
        numbers[1] = this.getNumber();
        return numbers;
    }

    @Override
    public float[] getSubtractionNumbers() {
        float[] numbers = new float[2];

        System.out.print("Type in minuend: ");
        numbers[0] = this.getNumber();

        System.out.print("Type in subtrahend: ");
        numbers[1] = this.getNumber();
        return numbers;
    }

    @Override
    public float[] getMultiplyingNumbers() {
        float[] numbers = new float[2];

        System.out.print("Type in first factor: ");
        numbers[0] = this.getNumber();

        System.out.print("Type in second factor: ");
        numbers[1] = this.getNumber();
        return numbers;
    }

    @Override
    public float[] getDivisionNumbers() {
        float[] numbers = new float[2];

        System.out.print("Type in dividend: ");
        numbers[0] = this.getNumber();

        System.out.print("Type in divider: ");
        do {
            numbers[1] = this.getNumber();
            if (numbers[1] == 0) {
                System.err.print("You can't divide by 0! Please try again: ");
            }
        } while (numbers[1] == 0);

        return numbers;
    }
}
