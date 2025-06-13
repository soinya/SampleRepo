package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList();
		
		//Add
		l.add("Blue");
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		
		System.out.println(l);
		
		//Contains
		System.out.println(l.contains("Red"));
		System.out.println(l.contains("White"));
		
		//get
		System.out.println(l.get(2));
		
		//set
		l.set(3, "Yellow");
		System.out.println(l);
		
		//remove
		l.remove("Green");
		System.out.println(l);
		
		//isEmpty
		System.out.println(l.isEmpty());
		
		//size
		System.out.println(l.size());
		
		l.add("Green");
		l.add("Blue");
		
		System.out.println(l);
		
		//IndexOf
		System.out.println(l.indexOf("Blue"));
		
		//LastIndexOf
		System.out.println(l.lastIndexOf("Blue"));
		
		

	}

}
