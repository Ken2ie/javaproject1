import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constructors
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logic logic = new Logic();

        // Input
        String input = scanner.nextLine();

        // To count the number of simulations ran
        int simulatorCounter = 0;

        System.out.println("Please press space and enter");

        while(input.equals(" ")){
                int generatedNumber = random.nextInt(4);
                logic.init(generatedNumber);

                System.out.println("Please press space and enter");
                input = scanner.nextLine();
        }
    }
}
