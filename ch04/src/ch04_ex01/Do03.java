package ch04_ex01;

import java.util.Scanner;	//자바 유틸 객체 

public class Do03 {			// Dowhile문을 사용하여 숫자 맞추기 게임 예제

	public static void main(String[] args) {
		Scanner sc = new Scanner	(System.in);		// 스캐너객체를 사용하면 int형태로 값을 받아들일 수 있다.
		
		int cnt = 0, num;
		int answer = (int)	(Math.random()	*	100)	+	1;	//1~100정수		
				do {
					System.out.println("1~100중 어떤 숫자일까요?");
					num = sc.nextInt();	// 숫자로 가져왔기때문에 숫자입력 가능 
					
					//System.out.println("num->"+num);
					
					if (answer == num) {
						System.out.println(cnt+"번에 맞췄습니다 축하 !!");
						break;
					} else if (answer >num) {
						System.out.println("더 큰수를 입력하세요");
					} else System.out.println("작은 수를 입력하세요");
					cnt++;
				} while (true);
				
	}

}

