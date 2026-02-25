package sessions;

import java.util.LinkedList;

public class ListHospitalQueue {
    public static void main(String[] args) {
        LinkedList<String> patients = new LinkedList<>();

        // Add patients to the queue
        patients.add("John");
        patients.add("Mary");
        patients.add("David");
        patients.addFirst("Emergency-Jane");
        patients.addLast("Peter");

        System.out.println("Patient List: " + patients);

        // Get first and last patients
        System.out.println("First Patient: " + patients.getFirst());
        System.out.println("Last Patient: " + patients.getLast());

        // Check if a patient is present
        System.out.println("Is Mary present? " + patients.contains("Mary"));

        // Get position of a patient
        System.out.println("Position of David: " + patients.indexOf("David"));

        // Treat a patient
        System.out.println("Treated Patient: " + patients.removeFirst());

        // Remove a patient
        patients.remove("Peter");

        // Print remaining patients
        System.out.println("Total Remaining Patients: " + patients.size());
        System.out.println("Updated Patient List:");
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
}