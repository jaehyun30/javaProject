package operators;

public class MethodExample {
	public static void main (String[] args) {
		int result = sum(10, 20);
		result = minus(20, 20);
		result = divide(30, 12);
		
		double r1 = divide(30.0, 20);
		System.out.println();
		// result = 30,20의 차이를 계산하는 minus()
		// result = 15, 13의 곱을 계산하는 multi()
		// result = 30, 12의 나눈 몫을 계산하는 divide()
	}
	public static void printAge(int age) {
		System.out.println("나이는 :" + age + "입니다");
	}
	
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	
	public static int multi(int a, int b)
	    int result = a * b;
		return result;

	public static int minus(int n1, int n2) {
	int result = n1 - n2;
	return result;
}
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
}

	