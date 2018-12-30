package lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> { System.out.println(s1+ " " + s2 + " " + s3); };
		li1.method("Temp", "Temp2", "Temp3");
		
		LambdaInterface2 li2 = (i1, i2) -> { return i1+i2; };
		System.out.println(li2.method2(2, 3));
		
		li2 = (i1,i2) -> { return i1 * i2; };
		System.out.println(li2.method2(2, 3));
	}

}
