package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		
		s.add("Red");
		s.add("Blue");
		s.add("Yellow");
		s.add("Orange");
		
		System.out.println(s);
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		i.remove();
		System.out.println(s);
	
	
	
	int a[] = {2,5,6,1};
	for(int b:a) //for(dataType variable:ArrayName)
	{
		System.out.println(b);
	}

}
}
