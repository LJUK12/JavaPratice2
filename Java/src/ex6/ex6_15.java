package ex6;

public class ex6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fatorial(4);
		System.out.println(result);
	}
	static int fatorial(int i) {
		int result = 0;
		if(i == 1) {
			result =  1;
		}else {
			result =  i * fatorial(i-1);
		}
		return result;
		//������ ���� �ѰԸ� ���� = ���� �����÷ο� ����
		//���� �Ű������� ��ȿ�� �˻縦 ���ٰ�.
		
	}
}
