package ex6;

public class ex6_13 {

	public static void main(String[] args) {
		ex6_13 r = new ex6_13();
		int result = r.add(3,5);
		System.out.println("result = "+result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);

	}
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int[] c) {
		return c[0] = a+b;
	}
}
