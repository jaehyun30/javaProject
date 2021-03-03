package References;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] Aray = {10, 11, 12, 13, 14};
		int maxValue = 0;
		for(int i=0; i<5; i++) {
			Aray[i]=(int)(Math.random()*10+1);
		}

		System.out.println(Aray[0]);
		System.out.println(Aray[1]);
		System.out.println(Aray[2]);
		System.out.println(Aray[3]);
		System.out.println(Aray[4]);

   }
}