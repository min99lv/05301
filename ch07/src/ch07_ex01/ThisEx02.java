package ch07_ex01;


class G2 {
		int k;
	
		G2() {
		System.out.println("매개변수 없다");
	}
		G2(int k){
			this(); // 나의... 기본생성자 -> 를 가르킴 -> 다음에 내 생성자를 뿌려줌
			this.k =k;
			System.out.println("매개변수 1개 k = "+k);
			
		}
		G2 (int k, int y)
		{
			this ();
			this.k = k;
			System.out.println("매개변수 2개 k = "+k+" y = "+y);
		}
		void print() {
			System.out.println("k = "+k);
		}
	
}


public class ThisEx02 {

	public static void main(String[] args) {
				G2 g2 = new G2(7);
				g2.print();
				G2 g3 = new G2(7,13);
				g2.print();

	}

}
