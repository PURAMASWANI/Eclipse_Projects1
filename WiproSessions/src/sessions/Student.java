
package sessions;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        // Calculations
        int total = english + maths;
        float percentage = total / 2.0f;

        // Grade 
        char grade;

        if (total >= 290) {
            grade = 'A';
        } else if (total >= 275) {
            grade = 'B';
        } else if (total >= 250) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("Student: " + name);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();

  

}

}
