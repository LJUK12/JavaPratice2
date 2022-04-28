package ex6;

public class ex6_22 {
// 가변인자 ... 내부적으로 배열을 사용
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate("+", "100", "200"));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
	}
	static String concatenate(String delim,String...args) {
		//가변인자를 선언한 메소드를 오버로딩하면 매개변수를 구별하지 못하는 경우가 발생하기 때문에 조심
		String result="";
		for(String str:args) {
			result += str+delim;
		}
		return result;
	}
}
