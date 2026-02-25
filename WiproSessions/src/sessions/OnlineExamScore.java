package sessions;
import java.util.*;

public class OnlineExamScore {
    public static void main(String[] args) {
        // ArrayList to store exam scores (Wrapper class Integer)
        ArrayList<Integer> scores = new ArrayList<>();

        // Autoboxing: int -> Integer
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(89);

        // Display scores
        System.out.println("Exam Scores:");
        for (Integer score : scores) {
            System.out.println(score);
        }

        // Calculate total score (Unboxing: Integer -> int)
        int total = 0;
        for (Integer score : scores) {
            total += score; // unboxing
        }

        // Calculate average
        double average = (double) total / scores.size();
        System.out.printf("Average Score: %.2f%n", average);
    }
}