package ch07_ex01;
// hw02
//0529완
class OverLoad{
	int n;
	OverLoad() {
		System.out.println("매개변수없다");
	}
	OverLoad(int n) {
		this.n = n;
		System.out.println("매개변수 1개 int = "+n);
	}
	OverLoad(String s) {
		System.out.println("매개변수 1개 str = "+s);
	}
	OverLoad(String s,int n) {
		System.out.println("매개변수 2개 str ["+ s+"], int"+n);
	}
	void print(){
		
	}
}
public class Ex07OverLoadingEx {

	public static void main(String[] args) {
			OverLoad Ol = new OverLoad();
			OverLoad Ol1 = new OverLoad(12);
			OverLoad Ol2 = new OverLoad("대박");
			OverLoad Ol3 = new OverLoad("금요일",16);
		
//			Ol.print();
//			Ol.print(12);
//			Ol.print("대박");
//			Ol.print("금요일",16);
			

	}

}





//console
//매개변수 없다
//매개변수 1개 Int = 12
//매개변수 1개 str대박
//매개변수 2개 str[금요일] , int = 16