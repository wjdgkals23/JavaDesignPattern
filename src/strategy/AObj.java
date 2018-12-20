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
//		System.out.println("AAA"); // -> 이러한 기능이 필요해!!!
		// 개발을 위임하는 형태? -> ainterface라는 객체에 개발을 떠넘기고 그것을 쓰기만하는 형태!!
		
		this.ainterface.funcA();
		this.ainterface.funcA();
	}
}
