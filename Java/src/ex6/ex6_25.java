package ex6;

public class ex6_25 {
	public static void main(String args[]) {
		Car2 c1 = new Car2();
		System.out.println(c1.color+" "+c1.gear+" "+c1.door);
		Car2 c2 = new Car2("black");
		System.out.println(c2.color+" "+c2.gear+" "+c2.door);
		Car2 c3 = new Car2("green", "auto", 3);
		System.out.println(c3.color+" "+c3.gear+" "+c3.door);
		//»ý¼ºÀÚ this()
		
	}

}

class Car2{ 
	String color;
	String gear;
	int door;
	Car2(){
		this("white", "auto", 4);
	}
	Car2(String color){
		this(color, "auto", 4);
	}
	Car2(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
	
}
