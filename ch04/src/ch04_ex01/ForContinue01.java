package ch04_ex01;

public class ForContinue01 {

	public static void main(String[] args) {
		for (int i =0; i < 10; i++) {							// i <10까지 진행
			System.out.println("대박 i="+i);
			if (i>5)continue;									// continue를 만나면 위로 올라가기때문에 쪽박 출력 X
			System.out.println("쪽박 i="+i);			// 5까지 출력
		}


		}
}
