package interfaceExample;

public class Interface1Child  implements Inteface1{
	
	public void display1() {
		System.out.println("child display1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object creation
		Interface1Child obj = new Interface1Child();
		
		obj.display();
		obj.print();
		obj.display1();
		
		//refernce creation
		Inteface1 obj1 = new Interface1Child();
		obj1.display();
		obj1.print();
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("display");
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}
