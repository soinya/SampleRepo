package interfaceExample;

public class MultipleChild implements Multiple1, Multiple2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleChild obj = new MultipleChild();
		
		obj.meth1();
		obj.meth2();
	}

	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("meth2");
	}

	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("meth1");
	}

}
