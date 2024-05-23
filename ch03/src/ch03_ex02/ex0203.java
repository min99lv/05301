package ch03_ex02;
// 과제 -5/23 완료
public class ex0203 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수 
		int pencilsPerStudents = 0;
				
		//남은 연필 수 
		int pencilsLeft = 0;
		
		pencilsPerStudents = pencils / 30;
		pencilsLeft = 534 % 30;
		
		System.out.println("학생 한 명이 가지는 연필 수 ->"	+	pencilsPerStudents);
		System.out.println("남은 연필 수 ->"	+	pencilsLeft);
		

	}

}
