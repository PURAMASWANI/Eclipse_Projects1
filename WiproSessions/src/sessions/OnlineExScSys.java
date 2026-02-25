package sessions;

import java.util.*;

public class OnlineExScSys {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Maths", 85);    // Autoboxing
		scores.put("Science", 92);
        scores.put("English", 78);

        System.out.println("Scores:");
        for (String subject : scores.keySet()) {
            System.out.println(subject + ": " + scores.get(subject));
        }

        int total = 0;
        for (int score : scores.values()) { // Unboxing
            total += score;
        }
        double average = total / scores.size();
        System.out.println("Average Score: " + average);
    }

	
    
}
		

