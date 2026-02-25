package sessions;
public class EmployeeClass {
	private int salary;
	void setSalary(int sal) {
		salary=sal;
		}
	int getSalary() {
		return salary;
		}
	public static void main(String[] args) {
			// TODO Auto-generated met
		EmployeeClass obj = new EmployeeClass();
		obj.setSalary(60000);
		System.out.println(obj.getSalary());
		}
	}
	 

