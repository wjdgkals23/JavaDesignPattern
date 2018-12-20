package strategy;

public class GameCharacter {
	//������
	private Weapon weapon;
	
	//��ȯ ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		// ��������Ʈ 
		if(this.weapon == null) {
			System.out.println("�Ǽ� ����");
		}
		else {
			this.weapon.attack();
		}
	}
}
