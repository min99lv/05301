package ch02_ex02;
//Study
public class Conditional10pEx { //삼항연산자

	public static void main(String[] args) {
			int a = 20, b =30, max;
			max = a  >  b ?  a : b ;   // a>b크면 ? a   &  아니면 b
					
			/*                                   윗줄이랑 같은 뜻
			if (a > b) {
				max = a;
			} else {
				max = b;
			}
			*/
			System.out.println("max->"+ max);
	}

}
