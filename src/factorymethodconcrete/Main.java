package factorymethodconcrete;

import factorymethodframework.Item;
import factorymethodframework.ItemCreator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemCreator creator = new HpCreator();
		Item item = creator.create();
		
		item.use();
	}

}
