package polymorphism;

public class PolyChild extends PolyParent{
	
	public void display() {
		
		System.out.println("child");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		PolyChild obj = new PolyChild();
		
		obj.display();

	}

}
