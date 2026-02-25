package sessions;

public class ThrowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int bal=2000;
			if(bal<5000)
			{
				throw new Exception("Insufficient ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
