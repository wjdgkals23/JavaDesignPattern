package adapter;

public class AdapterImpl implements Adapter {
	
	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		return Math.doubled(f.doubleValue()).floatValue(); //Math Ŭ������ �Լ����� static�ϰ� ����Ǿ��־� �ν��Ͻ� ���� Ȱ�밡��
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		System.out.println("Log -----");
		return (float) Math.half(f.doubleValue());
	}
	
}
