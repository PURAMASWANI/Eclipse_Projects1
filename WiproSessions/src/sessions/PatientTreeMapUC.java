package sessions;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class PatientTreeMapUC {

	public static void main(String[] args) {
		TreeMap<Integer, String>Patient=new TreeMap<>();
		Patient.put(1, " Ashu ");
		Patient.put(2, " Sree");
		Patient.put(3, " Rocky ");
		Patient.put(4, " Sai ");
				
		//System.out.println(Patient + " Patients : ");
		Patient.put(2,"Sony");
		System.out.println(Patient +"Updated");
		System.out.println("Retrieve Patient 3: " + Patient.get(3));
		Patient.remove(1);
        System.out.println(Patient + " Patient 1 Removed");		
        for (Map.Entry<Integer, String> e : Patient.entrySet()) {
            System.out.println(e.getKey()  + e.getValue());
        } 
        System.out.println("Patient 4 is exists  " +
                Patient.containsKey(4));
        System.out.println("Total Patients: " + Patient.size());
        Patient.clear();
        System.out.println(Patient + " System Cleared");

		}
		
		 

	}


