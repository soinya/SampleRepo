package exceptionHndling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 16;
		
		if(a>18)
			System.out.println("Eligible");
		
		else
		{
			throw new ArithmeticException("age below 18");
		}

	}

}
