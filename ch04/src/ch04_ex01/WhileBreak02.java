package ch04_ex01;

public class WhileBreak02 {

	public static void main(String[] args) {
						int i = 0, j = 0;
						while (true) 
						{
							i++;
										while(true)	
							{
											j++;
											System.out.print("현재 j는 "	+	j	+	"\t");
											if (j	==	5) break;
							}
										
							System.out.println("\n현재 i는"	+	i);
							j = 0;
							if (i	==	10) break;
						}

	}

}
