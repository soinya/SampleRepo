package inheritance;

public class Child1 extends Parent{
	
	public void print1() {
		
		System.out.println("This is child1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 obj1 = new Child1();
		
		obj1.print1();
		
		obj1.display();

	}

}
