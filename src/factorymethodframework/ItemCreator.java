package factorymethodframework;

public abstract class ItemCreator {
	
	public Item create() { 
		//create라는 함수는 operation 3개로 나누어진 템플릿 메소드 형태이다.
		Item item;
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	abstract protected void requestItemsInfo(); //op1
	abstract protected void createItemLog(); //op2
	abstract protected Item createItem(); //op3
}
