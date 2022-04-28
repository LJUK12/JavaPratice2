package ex6;
class Data {int x;}

public class ex6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); //占쏙옙占쏙옙占쏙옙占쏙옙 d 
		d.x = 10;
		System.out.println("main() : x = "+ d.x);
		
		change(d.x);
		System.out.println("After change d.x = "+ d.x);
		
		
	}
	
	static void change(int x) { //占썩본占쏙옙 占신곤옙占쏙옙占쏙옙
		// 占쌨소듸옙 占쏙옙占쏙옙占� 占쌨모리울옙占쏙옙 占쏙옙占쏙옙占쏙옙
		x = 1000;//占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 d占싶댐옙 占쌕몌옙 占쏙옙占쏙옙占쏙옙占� 
		System.out.println("change() : x = "+x);
		
	}

}

