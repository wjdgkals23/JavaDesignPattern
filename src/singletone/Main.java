package singletone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemSpeaker speaker = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker.setVolume(11);
		
		System.out.println(speaker.getVolume());
		System.out.println(speaker2.getVolume()); // ������ �ν��Ͻ��� ����
		
	}

}
