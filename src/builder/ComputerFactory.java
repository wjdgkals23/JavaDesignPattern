package builder;


// Builder ���Ͽ��� �پ��� Ŭ�������� �߻�ü�� Ȱ���ؼ� �پ��� ��ü���� ������ ����

public class ComputerFactory {
	private BluePrint print; // �߻�ü�� Ȱ���� �پ��� Ŭ�������� �޴� ����

	public ComputerFactory(BluePrint print) { // �ʱ�ȭ
		super();
		this.print = print;
	}
	
	public void make() { // ��ü ���� �� �Ӽ� �Ҵ�
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer() { // ��ü ��ȯ
		return print.getComputer();
	}
}
