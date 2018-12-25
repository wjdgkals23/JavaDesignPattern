package builder;

public class LgGramBlueprint extends BluePrint {

	private Computer computer;
	
	public LgGramBlueprint() {
		computer = new Computer("default","default","default");
	}
	
	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("i123123");
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		// TODO Auto-generated method stub
		computer.setStorage("256g ssd");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}
	
	
	
}
