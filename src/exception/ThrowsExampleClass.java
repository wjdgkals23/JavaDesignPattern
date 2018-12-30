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
			System.out.println("throws를 통해 예외처리가 발생한 곳에서 예외처리를 담당하기로한 상위 개념까지 올라오게 된다.");
			e.printStackTrace();
		}
	}

}
