package ex6;

public class ex6_26 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		System.out.println(c1.color+" "+c1.gear+" "+c1.door);
		Car3 c2 = new Car3(c1);
		System.out.println(c2.color+" "+c2.gear+" "+c2.door);
		c1.door = 100;
		System.out.println(c1.color+" "+c1.gear+" "+c1.door);

	}

}

class Car3{
	String color;
	String gear;
	int door;
	Car3(){
		this("white", "auto", 4);
	}
	Car3(Car3 c){
		this(c.color,c.gear,c.door);
		/*
		 * this.color=c.color; this.gear=c.gear; this.door=c.door;
		 */
	}
	Car3(String color, String gear, int door){
		this.color=color;
		this.gear=gear;
		this.door=door;
	}
}