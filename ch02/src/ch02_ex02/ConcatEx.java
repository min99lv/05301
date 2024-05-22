package ch02_ex02;
//Study
public class ConcatEx {

	public static void main(String[] args) {
		String str1 = "num"+3+4;  //num이 문자열이기 때문에 3,4도 문자열로서 더해진다
		String str2 = 3 + 4 + "=num"; //숫자로 인식하고 먼저 더하기때문에 7+문자열이 된다
		System.out.println("str1->"+str1); //str1->num34
		System.out.println("str2->"+str2); //str2->7=num

	}

}
