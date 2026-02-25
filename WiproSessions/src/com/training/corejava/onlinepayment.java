package com.training.corejava;
import java.util.*;
public class onlinepayment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("enter amount");
    int amount1= sc.nextInt();
    Paymenttype validator =  amount-> amount > 1000;
//    validator.check();
//        Paymenttype.paymentstatus();
        if (!validator.validate(amount1)) {
            System.out.println("Invalid amount!");
            return;
        }else {
            System.out.println("valid amount!");
          
        }
        payment  payment;
        System.out.println("Choose Payment Method :");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int choice= sc.nextInt();
        if (choice == 1) {
            payment = new creditcardpayment(amount1);
        } else if (choice == 2) {
            payment = new  upipayment(amount1);
        } else {
            System.out.println("Invalid payment option");
            return;
        }
 
        payment. paymentprocess();
        sc.close();
  }
}
