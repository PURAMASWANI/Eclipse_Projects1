package sessions;
import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {

        // using new keyword
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter City Name: ");
        String city = sc.nextLine();

        System.out.print("Enter Temperature: ");
        float temp = sc.nextFloat();

        // using if-else
        if (temp > 30) {
            System.out.println("City: " + city);
            System.out.println("Temperature: " + temp );
            System.out.println("Condition: Hot Day");
        } else {
            System.out.println("City: " + city);
            System.out.println("Temperature: " + temp );
            System.out.println("Condition: Normal Day");
        }

        sc.close();
    }
}