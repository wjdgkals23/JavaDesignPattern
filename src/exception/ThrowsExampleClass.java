package exception;

public class ThrowsExampleClass {

	public static void firstMethod() throws Exception {
		System.out.println("first method");
		secondMethod();
	}

	public static void secondMethod() throws Exception {
		System.out.println("second method");
		thirdMethod();
	}

	public static void thirdMethod() throws Exception {
		System.out.println("third method");
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			firstMethod();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("throws�� ���� ����ó���� �߻��� ������ ����ó���� ����ϱ���� ���� ������� �ö���� �ȴ�.");
			e.printStackTrace();
		}
	}

}
