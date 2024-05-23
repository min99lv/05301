package ch03_ex01;
//0523완
public class Ex05StringEqualsEx {			//	스트링 변수 예제

	public static void main(String[] args) {
		String strVar1 = "김혁";
		String strVar2 = "김혁";		// Strvar1 와 Strvar2 주소 값이 다르다
		String strVar3 = new String("김혁");
									// new String 객체 생성할 때 쓰는 변수 : 같은 값이 있더라도 재생성  
									// => String str = "java" : 같은 값이 있으면 재생성 하지 않음
									// 스택 영역 : str 힙영역 : "java"
		System.out.println(strVar1 == strVar2);					// String-> == : 주소값을 비교하는 것 
		System.out.println(strVar1 == strVar3);					// 
		System.out.println();
		System.out.println(strVar1.equals (strVar2));		// String->.equals() : 메모리의 값을 비교하는것
		System.out.println(strVar1.equals (strVar2));
	}

}
