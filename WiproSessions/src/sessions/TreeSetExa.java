package sessions;

import java.util.TreeSet;

public class TreeSetExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>cities=new TreeSet<>();
		try {
			cities.add("Delhi");
			cities.add("Mumbai");
			cities.add("chennai");
		    cities.add(null);
			System.out.println(cities);
		}
		catch(NullPointerException e)
		{
			System.out.println(cities);
			System.out.println("Null value not allow in TreeSet");
		}
	

	}

}
