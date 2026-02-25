package sessions;

public class BankAcc { 
	int bal= 10000;
	 void Withdrawal(String name , int amount) {
		if(bal<0) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println(name + " withdrawing " + amount);
			bal-=amount;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankAcc b=new BankAcc();
		//public static void main(String[] args) {
			BankAcc a1 = new BankAcc();
	 
		//	Thread t1 = new Thread(()->{a1.Withdrawal(5000);});
			//Thread t2 = new Thread(()->{a1.Withdrawal(5000);});
			Thread t1=new Thread(()->a1.Withdrawal("Thread1", 6000));
			Thread t2=new Thread(()->a1.Withdrawal("Thread2", 5000));
			t1.start();
			t2.start();	
		}

	}
	


