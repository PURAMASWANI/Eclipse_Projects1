package sessions;
interface message
{
void show(String msg);
}

public class Lambda {
public static void main(String[] args) {
	message m=(msg)->{
		System.out.println("message is : ");
		System.out.println(msg);
	};
	m.show("welcome to java ");
}
		
}


