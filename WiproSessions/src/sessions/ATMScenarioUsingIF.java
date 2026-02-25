package sessions;
import java.util.Scanner;
public class ATMScenarioUsingIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int orgpin = 1234; // predefined PIN
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter PIN:");
            int pin = sc.nextInt();

            if(pin == orgpin) {
                System.out.println("Transaction successful!");
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN. Try again.");
            }
        }

        if (attempts == 3) {
            System.out.println("Card blocked.");
        }
    }
		

	}


