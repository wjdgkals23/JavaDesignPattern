package methodtemplate;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String Id, String pass);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	// ���ø� �޼ҵ�
	public String requestConnection(String encodeinfo) {
		// ���� �۾� -> ��ȣȭ �� ���ڿ��� ���ڵ�, ��ȯ ������ ���� id,pass ���� �Ҵ��Ѵ�.
		String decodeinfo = doSecurity(encodeinfo);
		String Id = "aaa";
		String pass = "dddd";
		// ���� �۾� -> ���̵�� ��й�ȣ Ȯ�� �۾�
		String userName = "userName";
		if(!authentication(Id, pass)) {
			throw new Error("���̵� ��й�ȣ ����ġ");
		}
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			System.out.println("�˴ٿ� ó��");
			break;
		case 0:
			System.out.println("���� �Ŵ���");
			break;
		case 1:
			System.out.println("���� ȸ��");
			break;
		case 2:
			System.out.println("���� ȸ��");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		default:
			break;
		}
		
		return connection(decodeinfo);
	};
}
