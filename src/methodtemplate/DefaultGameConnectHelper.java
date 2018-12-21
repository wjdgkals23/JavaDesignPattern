package methodtemplate;

import java.util.Date;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String str) {
		// TODO Auto-generated method stub
		System.out.println("디코드 작업");
		return str;
	}

	@Override
	protected boolean authentication(String Id, String pass) {
		// TODO Auto-generated method stub
		System.out.println("아이디 암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("권한 확인");
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
		System.out.println("접속 정보 유지");
		return info;
	}

}
