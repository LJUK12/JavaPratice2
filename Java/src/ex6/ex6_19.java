package ex6;
// iv(�ν��Ͻ�����) �� ��뿩�ο� ���� static �޼ҵ�� �ν��Ͻ� �޼ҵ�� ����
class MyMath2{
	//��ü�� iv�� ���� (�ν��Ͻ� ����)
	long a,b;
	long add() {
		return a+b;
	}
	static long add(long a, long b) { //iv �Ⱦ���� static�� ����
		return a+b;
	}
}


public class ex6_19 {
	
	public static void main(String[] args) {
		long result = MyMath2.add(1,2);
		System.out.println(result);
		MyMath2 m2 = new MyMath2(); //�ν��Ͻ� ����
		m2.a=1;
		m2.b=2;
		long result2 = m2.add();
		System.out.println(result2);
	}

}
