package strategy;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		// TODO Auto-generated constructor stub
		this.ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		// TODO Auto-generated method stub
//		
//		System.out.println("AAA");
//		System.out.println("AAA"); // -> �̷��� ����� �ʿ���!!!
		// ������ �����ϴ� ����? -> ainterface��� ��ü�� ������ ���ѱ�� �װ��� ���⸸�ϴ� ����!!
		
		this.ainterface.funcA();
		this.ainterface.funcA();
	}
}
