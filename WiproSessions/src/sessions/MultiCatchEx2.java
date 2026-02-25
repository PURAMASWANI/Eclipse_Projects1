package sessions;

public class MultiCatchEx2 {

	public static void main(String[] args) {
	
		try
		{
			int arr[]=new int[3];
			arr[4]=10;
			
			int a=5/0;
		 
		}
		catch(Exception e)
		{
			System.out.println(" Exception handle:" + e);
		}
		}
		

	}


