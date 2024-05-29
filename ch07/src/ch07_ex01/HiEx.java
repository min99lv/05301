package ch07_ex01;
//hw01

class D1 {
	
		void hi (int cnt) {
			if (cnt < 6) {
				System.out.println("안녕, 나야 !! cnt-->"+cnt);
				hi(--cnt);
			}
			
				
				
			}
		}


public class HiEx {

	public static void main(String[] args) {
			D1 d = new D1(); 	//  반복 객체 선언
			d.hi(6);
	}

}

// 결과
//안녕, 나야 !!   cnt-->6
//안녕, 나야 !!   cnt-->5
//안녕, 나야 !!   cnt-->4
//안녕, 나야 !!   cnt-->3
//안녕, 나야 !!   cnt-->2
//안녕, 나야 !!   cnt-->1
//안녕, 나야 !!   cnt-->0