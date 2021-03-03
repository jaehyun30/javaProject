package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "F";
		int score = 90;
		
		switch (score / 10) {
		case 10:
			grade = "A+"; break;
		case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		default:
			grade = "F";
		}
		
		System.out.println("점수" + score + "는" + grade + "입니다");
	    System.out.println("end of prog");
	    
    }
}
		//if구문과 90점이상 -> A
		//else if 80점이상 -> B
	    // else if 70점이상 -> C
	    // else 그외에는 -> F로
	    // 점수 85는 B 입니다.
	
