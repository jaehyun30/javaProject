package operators;

public class MethodExample {
	public static void main (String[] args) {
		int result = sum(10, 20);
		result = minus(20, 20);
		result = divide(30, 12);
		
		double r1 = divide(30.0, 20);
		System.out.println();
		// result = 30,20�� ���̸� ����ϴ� minus()
		// result = 15, 13�� ���� ����ϴ� multi()
		// result = 30, 12�� ���� ���� ����ϴ� divide()
	}
	public static void printAge(int age) {
		System.out.println("���̴� :" + age + "�Դϴ�");
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

	