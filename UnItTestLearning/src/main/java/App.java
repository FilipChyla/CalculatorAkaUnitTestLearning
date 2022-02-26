import userinput.ConsoleBasedUserInput;
import userinterface.ConsoleBasedUserInterface;

public class App {
    public static void main(String[] args) {
        SimpleCalculatorApp app = new SimpleCalculatorApp(new ConsoleBasedUserInput(), new SimpleCalculator(), new ConsoleBasedUserInterface());
        while (true) {
            app.showInterface();
            app.showResult(app.callOperation(app.getOperation()));
        }
    }
}
