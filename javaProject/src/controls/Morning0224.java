package controls;

public class Morning0224 {
	public static void main(String[] args) {
		int e = 92;
	
		if(e>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("수 입니다.");
			
		} else if(e>=80) {
			System.out.println("점수가 80~90 입니다.");
			System.out.println("우 입니다.");
			
		} else if(e>=70) {
			System.out.println("점수가 70~80 입니다.");
			System.out.println("미 입니다.");
			
		}
		
	}

}

//
int engScore = (int) (Math.random() * 100 + 1);
int mathScore = (int) (Math.random() * 100 + 1);
String result = getAverage(engScore, mathSxore);
System.out.println("영어:" + engSxore + ",수학:" + mathScore)


public static String getAverage(int n1, int n2 ) {
	String grade = "";
	double avg = (n1 + n2) / 2.0;
	if (avg >= 90) {
        grade = "수";
	} else if (avg >= 80) { 
	}   grad = "우";

//1) 영어, 수학점수 담을 변수 선언
		// 평균이 90 이상이면 "수"
		//		 80 이상이면 "우"
		//		 70이상이면 "미" 이하이면 "가"
		// 값을 담을 변수 선언.
		// 2) 임의의 값을 생성하는 Math.random()을 사용해서
		// 3) ~ 100까지 임의의 값을 생성해서