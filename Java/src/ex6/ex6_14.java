package ex6;
class Data4{
	int x;
}

public class ex6_14 {

	public static void main(String[] args) {
		Data4 d = new Data4();
		
		d.x=10;
		
		Data4 e = copy(d);
		System.out.println(e.x);
	}
	
	static Data4 copy(Data4 d) { //참조형 반환 타입
		Data4 tmp = new Data4();
		tmp.x = d.x;
		return tmp;
	}
}
