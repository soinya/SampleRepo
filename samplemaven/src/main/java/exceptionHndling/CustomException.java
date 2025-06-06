package exceptionHndling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		
	int a = 16;
		
		if(a>18)
			System.out.println("Eligible");
		
		else
		{
			throw new VotingException("age below 18");
		}

	}

	}


