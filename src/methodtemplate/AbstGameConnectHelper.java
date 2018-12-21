package methodtemplate;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String Id, String pass);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	// 템플릿 메소드
	public String requestConnection(String encodeinfo) {
		// 보안 작업 -> 암호화 된 문자열을 디코드, 반환 값들을 통해 id,pass 값을 할당한다.
		String decodeinfo = doSecurity(encodeinfo);
		String Id = "aaa";
		String pass = "dddd";
		// 인증 작업 -> 아이디와 비밀번호 확인 작업
		String userName = "userName";
		if(!authentication(Id, pass)) {
			throw new Error("아이디 비밀번호 불일치");
		}
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			System.out.println("셧다운 처리");
			break;
		case 0:
			System.out.println("게임 매니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한 없음");
			break;
		default:
			break;
		}
		
		return connection(decodeinfo);
	};
}
