package builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerFactory factory = new ComputerFactory(new LgGramBlueprint());
//		factory.setBlueprint(new MacBlueprint());
		factory.make();
		Computer computer = factory.getComputer();
		
//		Computer computer = new Computer("i7", "16g", "256g ssd");
		System.out.println(computer.toString());
	}

}
