package inheritance;

public class HierarchicalChild1 extends HierarchicalParent{

	public void print() {
		System.out.println("This is child1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchicalChild1 obj1=new HierarchicalChild1();
		
		obj1.display();
		
		obj1.print();
		

	}

}
