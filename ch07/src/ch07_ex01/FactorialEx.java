package ch07_ex01;

import java.util.Scanner;

class Fac1{

	int result = 1;
// 재귀함수 -> 자기자신을 재 호출
	void Factorial (int cnt) {
			if (cnt >1) {
					result *= cnt;
					System.out.print(cnt + "*");
					Factorial(--cnt);
			}
			else {
					System.out.println(cnt);
					System.out.println("Factorial 결과는"+result);
					return;
		}
	}
}

public class FactorialEx {

	public static void main(String[] args) {
				Fac1 e = new Fac1();		// 팩토리얼 객체 선언
				int InNum ;						
				
				System.out.println("Factorial 할 10이하의 숫자를 입력하세요?");
				Scanner sc = new Scanner(System.in);
				InNum = sc.nextInt();
				e.Factorial(InNum);
				

	}

}
