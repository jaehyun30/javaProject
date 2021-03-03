package References;

import java.util.Scanner;

public class Morning0226 {
	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		for (String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("합계점수" + sum);
	}
		
		
		
	public static void arraytCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
			
		}
		
		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 1, newAry2, 0, 2);
		System.out.println(newAry[0]);
		System.out.println(newAry[1]);
		System.out.println(newAry[3]);
		System.out.println(newAry[4]);
    }
}
		
		//		int [] engScores = new int[3];
//		int [] mathScore = new int[3];
//		
//		double avg = 0;
		
//		Scanner scn = new Scanner(System.in);
		
//		for(int i=0; i<3; i++) {
//			engScores[i] =scn.nextInt();
//			mathScore[i] =scn.nextInt();
			
//		}System.out.println(engScores[0],  engScores[1], engScores[2]);
		
		
		

//	}

		
		// int 영어성적 담을 수 있는 배열. engScores => 3
		// int 수학성적 담을 수 있는 배열. mathScores => 3
		
		//영어, 수학 성적 입력.
		//영어의 평균, 수학점수의 평균을 구하는코딩.
		//출력형태 -> 영어평균: 85.5 / 수학평균: 88.7
	
//		int[] engScores = new int[3];
//		engScores = new int[] { 90, 88, 87 };
//		int[ mathScores = new int[3];
//		mathScores = new int[] { 88, 90, 92 };
		
//		int[][] scores = new int[2][3];
//		scores[0] = new int[] { 90, 88, 87 };
//		scores[1] = new int[] { 88, 90 };
		
//		int[][] scores = { { 90, 88, 87 },{ 88, 90, 92 } };
//		double avg = 0.0;
//		for (int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//		}
		
//		System.out.println(scores.length);
//		System.out.println(scores[0].length);
//		System.out.println(scores[1].length);

	


