package ex6;

public class ex6_16 {
	static long fatorial(int n) {
		if(n<=0 || n>20) return -1;
		if(n<=1) return 1;
		return n*fatorial(n-1);
	}




	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		for(int i =1; i<=n;i++) {
			result = fatorial(i);
			
			if(result == -1) {
				System.out.println("��ȿ���� ���� ��: %d%n" + n);
				break;
			}
			System.out.printf("%2d!=%20d%n",i,result);
		}
		
	}

}
