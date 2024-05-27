package ch05_ex01;
// 디버그 02
public class ArrayTest4 {

	public static void main(String[] args) {
			int array [ ] = {76, 45, 34, 89, 100, 50, 90, 92};
			int Temp = 0;
			
			for (int i = 0; i < array.length; i++) {
					for (int j = i + 1; j < array.length; j++) {		// i = 0 이면 45 
							if (array[ i ]>array[ j ])	{
							Temp = array[ i ];						//	 데이터를 교환할 때 쓰는 방법
							array[ i ]=array[ j ];
							array[ j ]=Temp;
							}
					}
			}
			for (int i= 0; i<array.length;i++) {
					System.out.print(" "+array[ i ]);
			}

	}
	

}
