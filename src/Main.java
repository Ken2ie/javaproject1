import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constructors
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String input = scanner.nextLine();

        while(true){
            if(!input.equals(" ")){
                System.out.println("Please press space and enter");
                input = scanner.nextLine();
            } else {
                random.nextInt(4);
            }
        }
    }
}
