package factorymethodconcrete;

import factorymethodframework.Item;
import factorymethodframework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("데이터 베이스에서 회복 물약의 정보를 가져옵니다");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("회복 물약을 생성 후 정보를 저장합니다.");
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
