package factorymethodconcrete;

import factorymethodframework.Item;
import factorymethodframework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("������ ���̽����� ���� ������ ������ �����ɴϴ�");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ���� �� ������ �����մϴ�.");
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPotion();
	}

}
