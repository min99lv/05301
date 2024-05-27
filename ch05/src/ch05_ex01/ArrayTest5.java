package ch05_ex01;

public class ArrayTest5 {

	public static void main(String[] args) {
			String[ ] m  = {"이름", "국어", "수학","총점","평균"};
			String[ ] name = {"김준수", "이하이","안예은","국가스텐"};
			
			int [ ][ ] score = {{80,70,90},{70,90,90},{80,70,80},{90,90,70}};
			int [ ] tot = new int [3]; int sum = 0, avg = 0;
			System.out.println("성적표\n");
			for ( int i = 0; i < m.length; i++) {
					System.out.print(m[i]+"\t");
			}
			System.out.println("\n----------------------------------------");
			
			for (int j = 0 ; j < name.length; j++) {							// 이름 불러오기
					System.out.print(name[j]);// 4행 불러오기
					for (int k = 0; k< score.length; k++) {
							if (j==k) {
									for (int f = 0; f < score[k].length; f++) { 			// 3열씩 뿌리기
									System.out.print(""+score[k][f]+"\t");
									sum += score[k][f];
									}
									avg = sum/score[k].length;
									System.out.print("\t"+sum+"\t"+avg);
									sum=0;
									avg=0;
									System.out.println();
							}
				}	
			}
	

	
			System.out.print("\n----------------------------------------");
			System.arraycopy(score[0], 0, tot[0], 0, score.length);
			System.out.println();
			
			s1(tot);  // 총합을 구하는 메소드
			
	}

	private static void s1(int[] tot) {
			for(int p : tot) {
			int sum2 = 0;
			sum2 += p;
			System.out.print(sum2);
			
			}
		
	}
}
	

//이름 출력 점수 출력 통계출력 평균출력 다음줄로 넘어가기
	
	

//	private static void sm(int[][] score) {
//		for (int i = 0; i <score.length; i++)
//			sum =
//		
//	}
//
//	private static void sc(int[][] score) {
//		for (int[] s1 : score) {
//			for (int s2 : s1) {
//				System.out.print(s2+"\t");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}

			
//			성적표 
//
//			이름	국어	영어	수학	총점	평균	
//			--------------------------------------------
//			김준수	80	70	90	240	80
//			이하이	70	90	90	250	83
//			안예은	80	70	80	230	76
//			국카스텐	90	90	70	250	83
//			--------------------------------------------
//			총계	320	320	330	970	80