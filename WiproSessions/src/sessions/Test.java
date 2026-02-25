package sessions;
interface vehicle{
	void start();
	default void fuelType() {
	
		System.out.println("fueled");
	}
}
class cars implements vehicle{
	public void start()
	{
		System.out.println();
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v =new cars();
		v.start();
		v.fuelType();

	}

}
