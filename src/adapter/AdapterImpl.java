package adapter;

public class AdapterImpl implements Adapter {
	
	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		return Math.doubled(f.doubleValue()).floatValue(); //Math 클래스에 함수들이 static하게 선언되어있어 인스턴스 없이 활용가능
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		System.out.println("Log -----");
		return (float) Math.half(f.doubleValue());
	}
	
}
