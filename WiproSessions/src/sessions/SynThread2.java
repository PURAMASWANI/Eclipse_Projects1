package sessions;
class counter
{
	int count =0;
    synchronized void  increement()// when we use synchronization it will show exact output..it cant change
	{
		count++;
	}
}
public class SynThread2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c=new counter();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<40;i++)c.increement();
		});
		Thread t2=new Thread(()-> {
			for(int i=0;i<90;i++)c.increement();
		});
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.count);

	}

}
