package ex6;

public class ex6_22 {
// �������� ... ���������� �迭�� ���
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate("+", "100", "200"));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
	}
	static String concatenate(String delim,String...args) {
		//�������ڸ� ������ �޼ҵ带 �����ε��ϸ� �Ű������� �������� ���ϴ� ��찡 �߻��ϱ� ������ ����
		String result="";
		for(String str:args) {
			result += str+delim;
		}
		return result;
	}
}
