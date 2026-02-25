package sessions;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b= sc.nextInt();
		System.out.println("1 Add");
		System.out.println("2 Sub");
		System.out.println("3 Mul");
		System.out.println("4 Div");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 :
			System.out.println("Addition " +(a+b));
			break;
		case 2 :
			System.out.println("Subtraction " +(a-b));
			break;
		case 3 :
			System.out.println("Multiplication " +(a*b));
			break;
		case 4 :
			System.out.println("Division " +(a/b));
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();
		
		

	}

}
