package ex6;
// iv(인스턴스변수) 의 사용여부에 따라서 static 메소드와 인스턴스 메소드로 나뉨
class MyMath2{
	//객체는 iv의 묶음 (인스턴스 변수)
	long a,b;
	long add() {
		return a+b;
	}
	static long add(long a, long b) { //iv 안쓸경우 static을 붙임
		return a+b;
	}
}


public class ex6_19 {
	
	public static void main(String[] args) {
		long result = MyMath2.add(1,2);
		System.out.println(result);
		MyMath2 m2 = new MyMath2(); //인스턴스 생성
		m2.a=1;
		m2.b=2;
		long result2 = m2.add();
		System.out.println(result2);
	}

}
