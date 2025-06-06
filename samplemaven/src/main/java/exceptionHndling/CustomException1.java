package exceptionHndling;

public class CustomException1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
	int a = 16;
		
		if(a>18)
			System.out.println("Eligible");
		
		else
		{
			throw new AgeException("age below 18");
		}

	}

	}


