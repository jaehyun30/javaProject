package objects;

public class Student {
	// 속성(필드)
	public static void main(String[] args) {
		String studentNo;
		int grade;
		int math;
		int eng;
		
		// 생성자:필드값을 초기화.
		Student() {
		
		}
	
		Student(String studentNo) {
			this.studentNo = studentNo;
		}
		
		// 기능(메소드)
		void study() {
			System.out.println("공부합니다.");
	    }
		void run() {
			System.out.println("운동을 합니다.");
		}
		
		void introduce() {
			System.out.println("학번 " + studentNo + ", 학년: " + grade+", 영어: " +);
		}
		
		
	}
}