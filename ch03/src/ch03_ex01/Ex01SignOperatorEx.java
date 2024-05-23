package ch03_ex01;

public class Ex01SignOperatorEx {				//	단항연산자 예제

	public static void main(String[] args) {
		int x	=	-100;			
		int result1	=	+x;		//	= result1 = result1 + x = -100 --> result1 = 값이 없는 것은 자동으로 0
		int result2=0;
		System.out.println("result2초기값->"+	result2);
		result2	=	-x;				//	= result 2= result 2 --> - (-100) = 100
		System.out.println("result1="	+	result1);
		System.out.println("result2="	+	result2);
		
		short s	=	100;
		//short result3 = -s;		// 컴파일 에러 --> short의 값이 너무 작기 때문에 연산 오류
		int result3	=	-s;
		System.out.println("result3="	+	result3);

	}

}
