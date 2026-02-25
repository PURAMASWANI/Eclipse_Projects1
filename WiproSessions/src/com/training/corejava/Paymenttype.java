package com.training.corejava;
	@FunctionalInterface
	 public interface Paymenttype {
	//  boolean validate( int amount1);
	  public boolean validate(int amount) ;
//	    return amount >1000;
	//  }
	  default void check() {
	    System.out.println("validating payment");
	  }
	  static void paymentstatus() {
	    System.out.println("amount should be greaterthan1000");
	  }
	}


