package factorymethodconcrete;

import factorymethodframework.Item;
import factorymethodframework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("������ ���̽����� ȸ�� ������ ������ �����ɴϴ�");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ������ ���� �� ������ �����մϴ�.");
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
