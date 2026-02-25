package sessions;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PatientRegistrations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> patientId = new HashSet<>();
        
        System.out.print("Enter no. of patients that are need to be added: ");
        int n = sc.nextInt();
        
        while (n > 0) {
            System.out.print("Enter the Id of Patient: ");
            int temp = sc.nextInt();
            if (patientId.contains(temp)) {
                System.out.println("Patient already Registered: ");
            } else {
                patientId.add(temp);
                System.out.println("Patient is Successfully registered ");
                n--; // decrement only on successful registration
            }
        }
        
        System.out.println("total no. of Patients are now: " + patientId.size());
        for (int patient : patientId) {
            System.out.println(patient);
        }
        sc.close();
    }
}