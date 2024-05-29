package ch07_ex01;

class Encapsule {
		private String name;  //--> 정보보호를 위해서 캡슐화
		private int age;
//		public String name;
//		public int age;
		
		
		public String getName() {
				return name;
		}
		public int getAge () {
			return age;
		}
		public void setname(String name) {
			this.name = name; 
		}
		public void setAge(int age) {
			if (age<0) 	System.out.println("나이 입력 오류 ㅎㅎ");
			else this.age = age;
			}
		}


public class EncapsuleEx {

	public static void main(String[] args) {
			Encapsule h1 = new Encapsule();
//			h1.name = "김준수";		--> 퍼블릭인 경우에 사용 가능
//			h1.age = -10;
			
			h1.setname("김준수");
			h1.setAge(-10);
			
			System.out.println("이름 :" + h1.getName());
			System.out.println("나이 :" + h1.getAge());

	}

}
