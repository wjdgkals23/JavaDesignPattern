package builder2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String spec = sc.nextLine();
		String [] specs = spec.split(" ");
		Computer computer = ComputerBulider
				.start()
				.setCpu(specs[0])
				.setRam(specs[1])
				.setStorage(specs[2])
				.build();
		
		System.out.println(computer.toString());
	}

}
