package prototype;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {
	private int x,y,r; // �Һ�Ŭ�����̹Ƿ� ���簡 �����ϰ� �� �ȴ�.
	private ArrayList<Circle> innercircle = new ArrayList<Circle>(); // ArrayList �Һ���ü�� �ƴϹǷ� ���� �������־���Ѵ�.
	private List<String> test = new ArrayList<String>(); // List�� List ���� �������̽��� clone�� �������� �ʴ´�.

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		circle.innercircle = (ArrayList) innercircle.clone();
		circle.x = x+1;
		circle.y = y+1;
		
		return circle;
	}

	public ArrayList<Circle> getInnercircle() {
		return innercircle;
	}

	public void setInnercircle(ArrayList<Circle> innercircle) {
		this.innercircle = innercircle;
	}
	
	public void addInnercircle(Circle c) {
		this.innercircle.add(c);
	}
	
	public void toStringinnercircle() {
		for(int i=0; i<this.innercircle.size(); i++) {
			System.out.println(this.innercircle.get(i).getX() + "," + this.innercircle.get(i).getY()+ "," + this.innercircle.get(i).getR());
		}
	}
	
}
