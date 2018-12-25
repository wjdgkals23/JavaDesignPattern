package factorymethodconcrete;

import java.util.ArrayList;
import java.util.List;

import factorymethodframework.Item;
import factorymethodframework.ItemCreator;

public class Main {
	
	private List<Item> inventory = new ArrayList<Item>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemCreator creator = new HpCreator();
		Item item = creator.create();
		
		item.use();
	}

}
