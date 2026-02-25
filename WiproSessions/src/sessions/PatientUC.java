package sessions;
import java.util.*;
public class PatientUC {
	public static void main(String[] args) {
	        TreeMap<Integer, String> Patient = new TreeMap<>();
	        Scanner scanner = new Scanner(System.in);

	        // Inserting patients with user input
	        System.out.print("Enter patient ID 1: ");
	        int id1 = scanner.nextInt();
	        scanner.nextLine();  // consume newline
	        System.out.print("Enter patient name 1: ");
	        String name1 = scanner.nextLine();
	        Patient.put(id1, name1);

	        System.out.print("Enter patient ID 2: ");
	        int id2 = scanner.nextInt();
	        scanner.nextLine();  
	        System.out.print("Enter patient name 2: ");
	        String name2 = scanner.nextLine();
	        Patient.put(id2, name2);

	        System.out.print("Enter patient ID 3: ");
	        int id3 = scanner.nextInt();
	        scanner.nextLine();  
	        System.out.print("Enter patient name 3: ");
	        String name3 = scanner.nextLine();
	        Patient.put(id3, name3);

	       System.out.print("Enter patient ID 4: ");
	        int id4 = scanner.nextInt();
	        scanner.nextLine();  
	        System.out.print("Enter patient name 4: ");
	        String name4 = scanner.nextLine();
	        Patient.put(id4, name4);

	        // Updating a patient with user input
	        System.out.print("Enter new name for patient ID 2: ");
	        String newName = scanner.nextLine();
	        Patient.put(2, newName);

	        System.out.println(Patient + " Updated");

	        // Retrieve a patient
	        System.out.print("Enter patient ID to retrieve: ");
	        int retrieveId = scanner.nextInt();
	        System.out.println("Retrieve Patient " + retrieveId + ": " + Patient.get(retrieveId));

	        // Remove a patient with user input
	        System.out.print("Enter patient ID to remove: ");
	        int removeId = scanner.nextInt();
	        Patient.remove(removeId);
	        System.out.println(Patient + " Patient " + removeId + " Removed");

	        // Display all patients
	        for (Map.Entry<Integer, String> e : Patient.entrySet()) {
	            System.out.println(e.getKey() + " " + e.getValue());
	        }

	        // Check if patient 4 exists
	        System.out.println("Patient 4 is exists " + Patient.containsKey(4));
	        
	        scanner.close();
	    }
	}