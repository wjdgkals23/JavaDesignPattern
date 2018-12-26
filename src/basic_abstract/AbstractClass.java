package basic_abstract;

public abstract class AbstractClass {
	int num;
	String str;
	
	public AbstractClass() {
		System.out.println("AbstractClass Default Constructor");
	}
	
	public AbstractClass(int num, String str) {
		System.out.println("AbstractClass Constructor");
		this.num = num;
		this.str = str;
	}
	
	public void func1() {
		System.out.println("--- func1() START ---");
	}
	
	public abstract void func2();
}
