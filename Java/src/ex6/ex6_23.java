package ex6;

public class ex6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data11 d = new Data11();
		Data22 d2 = new Data22();
		//오류가 나는 이유 = 기본생성자를 만들지 않아서 (매개변수 생성자를 정의했기 때문에 컴파일러에서 기본생성자를 안만들어줌)
		//기본생성자 오류는 다른오류로 나오기 때문에 찾기가 어렵다
	}

}

class Data11{
	int value;
}

class Data22{
	int value;
	Data22(){
		//기본생성자
	}
	Data22(int x){
		value = x;
	}
}