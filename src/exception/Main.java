package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0;
		int y=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exception Before");
		
		try {
			y = i/j;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Exception After");
		
		int [] arr = new int [5];
		
		try {
			System.out.println("input i");
			i = scan.nextInt();
			System.out.println("input j");
			j = scan.nextInt();
			System.out.println("i/j = " + i/j);
			
			for(int m=0; m<6; m++) { //배열크기 이외의 구역에 값 넣기
				arr[m] = i/j;
			}
			
			System.out.println("여기는 나오게 안 나오게!?");
		}
//		 catch (Exception e) {
//			switch (e.getMessage()) {
//			case "/ by zero" :
//				System.out.println("0으로는 못나눠요!");
//				break;
//			default:
//				break;
//			}
//		}
		catch (InputMismatchException e) { // 입력값이 잘못되었을 때
			System.out.println("here");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("어쨌거나 반드시!!! 실행되어야하는 경우!");
		}
	}

}
