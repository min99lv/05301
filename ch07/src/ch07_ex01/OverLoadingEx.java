package ch07_ex01;
// hw02
public class OverLoadingEx {

	public static void main(String[] args) {
			OverLoad Ol = new OverLoad();
			Ol.print();
			Ol.print(12);
			Ol.print("대박");
			Ol.print("금요일",16);
			

	}

}






//매개변수 없다
//매개변수 1개 Int = 12
//매개변수 1개 str대박
//매개변수 2개 str[금요일] , int = 16