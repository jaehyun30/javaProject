package controls;

public class Exercise05 {

	public static void main(String[] args) {
		for (int i=35; i <=60; i++) {	
			
			int sNum = 44;
			int eNum = 67;
			int sum = getSumValue(sNum, eNum);
			System.out.println(sNum + "과" + eNum + "합:" + sum);
		}
	}
//		public static int getSumValue(int n1, int n2) {
		int startNo = (n1 > n2) ? n2 : n1;
		int sum = 0;
		for (int i=n1; i <=n2; i++) {
			sum = sum + i;
		}
		return sum;


		
		// 44, 67
//결과 = getSumValue(44, 67);
		// "두 수사이의 합계: ???
	
