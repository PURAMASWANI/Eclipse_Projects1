package sessions;
class student{
	int rollno;
	String name;
	static String college = "IIT Delhi";
	student (int r, String n){
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(1, "renu");
		student s2 = new student(2,"sai");
		s1.display();
		s2.display();

	}

}
