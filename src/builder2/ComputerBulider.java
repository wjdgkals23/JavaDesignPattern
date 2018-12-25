package builder2;

public class ComputerBulider {

	private Computer computer;

	private ComputerBulider() {
		computer = new Computer("", "", "");
	}

	public static ComputerBulider start() {
		return new ComputerBulider();
	}

	public ComputerBulider setCpu(String cpuspec) {
		this.computer.setCpu(cpuspec);
		return this;
	}

	public ComputerBulider setRam(String ramspec) {
		this.computer.setRam(ramspec);
		return this;
	}

	public ComputerBulider setStorage(String storagespec) {
		this.computer.setStorage(storagespec);
		return this;
	}
	
	public Computer build() {
		return computer;
	}
}
