package controls;

public class WhileExample {
	public static void main(String[] args) {
		// 반목문
		// for(int i=0; i<=9; i++){.....}
		// 1 ~ 10 까지 합:
		int sum = 0;
		int i = 1;
		while (i <= 10) {
	        sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 10 합:" + sum);
	}
}
//		int i = 0;
//		while(true) {
//			if(i++ >= 5) {
//	    	   break;
//			}
//		}
//	}
