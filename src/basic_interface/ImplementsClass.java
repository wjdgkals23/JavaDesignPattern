package basic_interface;

public class ImplementsClass implements InterfaceA, InterfaceB {
// 해당 클래스는 InterfaceA 나 interfaceB가 될 수 있다. 타입을 자유롭게 가지게되는 다형성의 특징을 가지게 된다.
	
	@Override
	public void funcB() {
		// TODO Auto-generated method stub
		System.out.println("funcB");
	}

	@Override
	public void funcA() {
		// TODO Auto-generated method stub
		System.out.println("funcA");
	}
	
}
