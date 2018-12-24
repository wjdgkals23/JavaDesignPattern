package prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(1,1,3);
		circle1.addInnercircle(new Circle(3,2,5));
		Circle circle2 = (Circle) circle1.copy();
		
		circle2.addInnercircle(new Circle(3,5,3));
		circle1.setR(2);
		
		circle1.toStringinnercircle();
		circle2.toStringinnercircle();
		
		System.out.println(circle1.getR());
		System.out.println(circle2.getR());
	}

}
