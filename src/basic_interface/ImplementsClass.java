package basic_interface;

public class ImplementsClass implements InterfaceA, InterfaceB {
// �ش� Ŭ������ InterfaceA �� interfaceB�� �� �� �ִ�. Ÿ���� �����Ӱ� �����ԵǴ� �������� Ư¡�� ������ �ȴ�.
	
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
