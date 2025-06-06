package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	
	public void print() {
		System.out.println("This is child2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalChild2 obj2 = new HierarchicalChild2();
		
		obj2.display();
		
		obj2.print();

	}

}
