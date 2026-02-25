package sessions;

import java.util.ArrayList;

public class BankLoanEliSys {
    public static void main(String[] args) {
    	
        int age = 30;
        int cibilScore = 750;
        double  income = 60000.0;
        double  freelance = 10000.0;

        ArrayList<Double> incomes = new ArrayList<>();
        incomes.add(income);

        if (age >= 21 && age <= 60) {
            if (incomes.get(0) >= 50000.0 && cibilScore >= 700) {
                System.out.println("Loan Eligible ");
            } else {
                System.out.println("Loan Not Eligible ");
            }
        } else {
            System.out.println("Age Criteria Not Met ");
        }
    }
}