package userinterface;

public class ConsoleBasedUserInterface implements UserInterface {
    @Override
    public void showInterface() {
        System.out.println("""
                1.Addition
                2.Subtraction
                3.Multiplying
                4.Division""");

        System.out.print("Choose your operation: ");

    }

    @Override
    public void showResult(float result) {
        System.out.println("Result: " + result);

        System.out.print("Press enter to continue.");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        System.out.println();
        System.out.println();
    }
}
