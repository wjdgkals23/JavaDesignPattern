package strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ainterface ainterface = new AinterfaceImpl();
//		
//		ainterface.funcA();
//		
//		AObj aObj = new AObj();
//		
//		aObj.funcAA();
		
		GameCharacter user1 = new GameCharacter();
		
		user1.setWeapon(new Knife());
		user1.attack();
		user1.setWeapon(new Sword());
		user1.attack();
		user1.setWeapon(new Ax());
		user1.attack();
		user1.setWeapon(null);
		user1.attack();
	}

}
