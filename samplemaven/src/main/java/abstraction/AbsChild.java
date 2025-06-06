package abstraction;

public class AbsChild extends AbsParent{
	
	public void meth() {
		System.out.println("Child Class");
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("display method");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("print method");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object creation 
		
/*		AbsChild obj = new AbsChild();
		
		obj.display();
		obj.print();
		obj.meth();
	*/
		
		
		//Reference creation
		
		AbsParent obj1 = new AbsChild();
		
		obj1.display();
		obj1.print();
		
	}		

}
