package basic_abstract;

public class ClassEx extends AbstractClass {
	
	public ClassEx() {
		System.out.println("ClassEx Default Constructor");
	}

	public ClassEx(int num, String str) {
		super(num, str);
		System.out.println("ClassEx Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		System.out.println("--- func2() START ---");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num + "," + str;
	}

}
