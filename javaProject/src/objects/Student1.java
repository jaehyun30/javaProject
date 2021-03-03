package objects;

public class Student1 {

	public static void main(String[] args) {
		String name;
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름: " + name + ", 영어: " + eng + 
					", 수학: " + math + ",합계: " +(eng + math));
		}
	}
}