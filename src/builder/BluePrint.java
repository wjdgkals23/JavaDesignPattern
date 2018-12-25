package builder;

// 만들고자 하는 객체의 추상객체

public abstract class BluePrint {
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	abstract public Computer getComputer();
}
