package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket sereverSocket = null;
		Socket socket = null;
		
		try {
			sereverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���Ʈ ���� ��� �Ϸ�");
			socket = sereverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����!");
			System.out.println("socket: " + socket);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			try {
				if(sereverSocket != null) sereverSocket.close();
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
	}

}
