package stringbufferbuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Temp");
		System.out.println(str);
		str.append("22");
		System.out.println(str);
		str.insert(2, "temp");
		System.out.println(str);
		str.delete(4,5);
		System.out.println(str);
	}	

}
