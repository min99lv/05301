package ch05_ex01;
// hw01
// 0527 완
public class ArrayEx15 {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage : java ArrayEx15 NUM1 OP NUM2");
			System.exit(0);
		}
		char op = args[1].charAt(0);		//	문자열을 문자(char)로 변환한다.
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		// hw01
		// + - x / 수행 --> switch
		// *는 .classpath 가르키므로 x로 변경하여 사용하겠음
		
		switch (op) {
		case '+':
			int p = num1 + num2;
			System.out.println(p);
			break;
		case '-':
			int m = num1 - num2;
			System.out.println(m);
			break;
		case 'x':
			int q = num1 * num2;
			System.out.println(q);
			break;
		case '/':
			int d = num1 / num2;
			System.out.println(d);
			break;
			
		}
		
	}

}


// 아규먼트 값으로 값을 넣는다 100+25 이런식으로 
// 결과 125