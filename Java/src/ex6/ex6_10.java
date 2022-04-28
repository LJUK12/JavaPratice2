package ex6;
class Data2 {int x;}

public class ex6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2(); //占쏙옙占쏙옙占쏙옙占쏙옙 d 
		d.x = 10;
		System.out.println("main() : x = "+ d.x);
		
		change(d);
		System.out.println("After change d.x = "+ d.x);
		
		
	}
	
	static void change(Data2 d) { //占쏙옙占쏙옙占쏙옙 占신곤옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
		// 占쌨소듸옙 占쏙옙占쏙옙占� 占쌨모리울옙占쏙옙 占쏙옙占쏙옙占쏙옙
		d.x = 1000;//占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쌍소몌옙 占싻억옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쌨모리곤옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		System.out.println("change() : x = "+d.x);
		
	}

}

