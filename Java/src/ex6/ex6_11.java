package ex6;

public class ex6_11 {
	public static void main(String args[]) {
	int[] x = {10};
	System.out.println("before x = "+x[0]);
	change(x);
	System.out.println("changed x = "+x[0]);
	}
	static void change(int[] x) {
		x[0]=100;
		System.out.println("change x = "+x[0]);
	}
}
