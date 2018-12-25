package builder;


// Builder 패턴에서 다양한 클래스들의 추상객체를 활용해서 다양한 객체들을 만들어내는 역할

public class ComputerFactory {
	private BluePrint print; // 추상객체를 활용한 다양한 클래스들을 받는 접점

	public ComputerFactory(BluePrint print) { // 초기화
		super();
		this.print = print;
	}
	
	public void make() { // 객체 생성 및 속성 할당
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer() { // 객체 반환
		return print.getComputer();
	}
}
