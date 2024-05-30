package ch07_ex03;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		// 3
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			// sum = sum + 1 = 1
		}
		return sum;
	}

	int sum2(int... values) {
		int sum = 0;
		System.out.println("values->" + values); // 넘어온 values값을 출력
																						// 내부적으로 배열로 잡힌다.
		for (int i = 0; i < values.length; i++) {
			System.out.println("values[i]->" + values[i]); // values값의 i가 무엇인지 출력
			sum += values[i];
		}
		return sum;
	}

}
