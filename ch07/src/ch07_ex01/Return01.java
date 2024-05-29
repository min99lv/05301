package ch07_ex01;

class C1 {
	void divide1(int x, int y) {
		if (y == 0) {
			System.out.println("y가 0이야 0으로 못 나눠");
			return; // 여기까지 하고 메소드를 호출한 곳으로 되돌아간다.
		}
		System.out.printf("%d / %d = %d\n" , x, y, x / y);

	}

	int divide2(int x, int y) {
		if (y == 0) {
			System.out.println("y가 0이야 0으로 못 나눠");
			return y;
		}else
		System.out.printf("%d / %d = %d\n" , x, y, x / y);
		int retDivide = x / y;
		return retDivide;
	}

}

public class Return01 {

	public static void main(String[] args) {
		int resultDivide;
		C1 c = new C1();
		c.divide1(13, 3);
		resultDivide = c.divide2(13, 3);
		System.out.println("Main resuleDivide-->" + resultDivide);

	}

}
