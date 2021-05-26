package ex03.aop.spring;

public class CalImpl implements ICalc {

	@Override
	public int add(int x, int y) {
		//보조 관심사(cross-cutting-concern)
		int sum = x + y;
		//보조 관심사(cross-cutting-concern)
		return sum;
	}

	@Override
	public int sub(int x, int y, int z) {
		//보조 관심사(cross-cutting-concern)
		int cha = x - y - z;
		//보조 관심사(cross-cutting-concern)
		return cha;
	}

	@Override
	public int mul(int x, int y) {
		//보조 관심사(cross-cutting-concern)
		int gob = x * y;
		//보조 관심사(cross-cutting-concern)
		return gob;
	}

}
