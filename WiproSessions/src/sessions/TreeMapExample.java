package sessions;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Map<Integer,String>Employee=new TreeMap<>();
		//Comparator is nothing but to print in reverse order
		TreeMap<Integer,String>Employee=new TreeMap<>(Comparator.reverseOrder());
		//comparator is a built in method and reverseOrder is the built in interface
		Employee.put(101,"ashu");
		Employee.put(102,"vinnu");
		Employee.put(103,"sara");
		//Employee.put(null, "Sai");    //null pointer exception
		System.out.println(Employee);
		

	}

}
