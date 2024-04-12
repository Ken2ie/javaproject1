import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constructors
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logic logic = new Logic();

        // To count the number of simulations ran
        int simulatorCounter = Logs.eventStreams.size();

        // Prompt
        System.out.println("Please press space and enter");

        // Input
        String input = scanner.nextLine();

        while(input.equals(" ") && simulatorCounter != 20){

            simulatorCounter = Logs.eventStreams.size();

                int generatedNumber = random.nextInt(4);
                logic.init(generatedNumber);

                System.out.println("Please press space and enter, Simulation: " + simulatorCounter);
                input = scanner.nextLine();
        }
    }
}
