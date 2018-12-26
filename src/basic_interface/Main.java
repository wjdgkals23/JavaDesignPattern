package basic_interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA ia = new ImplementsClass();
		InterfaceB ib = new ImplementsClass();
		
		ia.funcA();
//		ia.funcB X
		ib.funcB();
//		ib.funcA X
	}

}
