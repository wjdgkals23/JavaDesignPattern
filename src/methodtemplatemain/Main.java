package methodtemplatemain;

import methodtemplate.AbstGameConnectHelper;
import methodtemplate.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("test");
	}

}
