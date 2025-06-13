package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet();
		
		//Add
		s.add("soniya");
		s.add("Rani");
		s.add("Tissa");
		
		System.out.println(s);
		
		Set<String> s1 = new HashSet<String>();
		
		//Add
		s1.add("Lithin");
		s1.add("Sajin");
		s1.add("Veena");
		
		System.out.println(s1);
		//add s1 to s
		s.addAll(s1);
		
		System.out.println(s);
		
		
		//contains
		System.out.println(s.contains("Tissa"));
		System.out.println(s.contains("Reeba"));
		
		//containsall
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		
		//Empty
		System.out.println(s.isEmpty());
		
		//remove
		s.remove("Rani");
		System.out.println(s);
		
		//removeAll
		s.removeAll(s1);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear
		s1.clear();
		System.out.println(s1);

	}

}
