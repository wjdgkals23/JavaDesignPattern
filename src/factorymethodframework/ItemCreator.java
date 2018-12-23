package factorymethodframework;

public abstract class ItemCreator {
	
	public Item create() { 
		//create��� �Լ��� operation 3���� �������� ���ø� �޼ҵ� �����̴�.
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
