package com.training.corejava;

abstract class payment {
	  public int amount ;
	  public  payment(int amount) {
	        this. amount = amount;
	    }
	  abstract  void paymentprocess();
	}
	class creditcardpayment extends payment{
	  public creditcardpayment(int amount) {
	    super(amount);
	  }
	  void paymentprocess () {
	    System.out.println(" Done by CreditCardPayment "+amount);
	    
	  }
	  
	}
	class upipayment extends payment{
	  public  upipayment(int amount) {
	    super(amount);
	  }
	  
	  void paymentprocess () {
	    System.out.println(" This Payment done by UPI "+amount);
	  }
	}


