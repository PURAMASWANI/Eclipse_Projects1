package sessions;

public class SyncThread {
		 
		synchronized void withdraw(String Name)
		{
		System.out.println(Name + " is withdrawing money");
	//	try
		//{
			//Thread.sleep(2000);//this value is just like how much time it can sleep - it is like sleep this amout (2000) of time .
		//}
		//catch(Exception e){}    // without this try block also we get same output ---it is used for sleep purpose only.
		 
		System.out.println(Name + " Withdrawal completed");
		}
			
		public static void main(String[] args) {
		 
			SyncThread atm=new SyncThread();
			
			new Thread(() -> atm.withdraw("User-1")).start();
			//new Thread(() -> atm.withdraw("User-2")).start();
			
		 
			}
		 
		
		 

	}


