package sessions;
import java.util.ArrayList;
import java.util.Scanner;

public class BankLoan {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Age: ");
	        Integer age = scanner.nextInt(); // autoboxing

	        System.out.print("Enter CIBIL Score: ");
	        Integer cibilScore = scanner.nextInt(); // autoboxing

	        System.out.print("Enter Monthly Income: ");
	        Double income = scanner.nextDouble(); // autoboxing

	        if (age >= 21 && age <= 60) {
	            if (income >= 30000.0 && cibilScore >= 700) {
	                System.out.println("You are Eligible for the Loan ");
	            } else {
	                System.out.println("Sorry! Not  Eligible for The Loan ");
	            }
	        } else {
	            System.out.println("Age Criteria Not Met ");
	        }

	        scanner.close();
	    }
	

}
