package methodtemplate;

import java.util.Date;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String str) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ� �۾�");
		return str;
	}

	@Override
	protected boolean authentication(String Id, String pass) {
		// TODO Auto-generated method stub
		System.out.println("���̵� ��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("���� Ȯ��");
		Date date = new Date();
		if(date.getHours() < 17) {
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ����");
		return info;
	}

}
