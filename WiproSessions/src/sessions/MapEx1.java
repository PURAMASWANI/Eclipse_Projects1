package sessions;
import java.util.HashMap;
import java.util.Map;
public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer>, String>Employee=new Hashmap<>();
		//HashMap<Integer>, String>Employee=new Hashap();
		Map<Integer,String>Employee = new HashMap<>();
		Employee.put(101, "Ashu");//employee is the object the hashmap calss
		Employee.put(102, "Vinnu");
		Employee.put(103, "Sony");
		System.out.println(Employee);
		Employee.put(102, "Vinay");
		System.out.println(Employee+" Updtaed - Overrites Vinnu ");
		Employee.replace(101, "Aswani");
		System.out.println(Employee+" Updtaed - Replace Ashu ");
        Employee.remove(101);
        System.out.println(Employee+" Updtaed - Deleted 101 ");
        Employee.remove(102, "Vinnu");
        System.out.println(Employee+" Updtaed - it remove when key and value are same, if not it can't remove");
        System.out.println(Employee.containsKey(103));
        //System.out.println(Employee.containsKey(103));
        //String.EmployeeName=Employee.get(102);
	}

}
