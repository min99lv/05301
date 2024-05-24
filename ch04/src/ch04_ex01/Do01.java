package ch04_ex01;

public class Do01 {				//	Do while문 예제

	public static void main(String[] args) {
					int sum	=	0, i	=	1;														
					do 
					{																	// 끝날 때 검정하는Do while문 <-> 처음에 검정하는 while 문 
						sum	+=	i;											// 최초 한번은 무조건 수행 -> 오류를 처리하기 좋다 -> 안정적인 코드
						i++;
					} while (i	<=	10);
					System.out.println("합계:"	+	sum);
					
	}

}
