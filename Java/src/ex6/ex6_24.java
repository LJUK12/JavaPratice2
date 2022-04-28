package ex6;

public class ex6_24 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		System.out.printf(c1.color+" "+c1.gearType+" "+c1.door);
		Car c2 = new Car("White", "auto", 4);
		System.out.printf(c2.color+" "+c2.gearType+" "+c2.door);
	}

	
}
class Car{
	String color;
	String gearType;
	int door;
	Car(){
		
	}
	Car(String c, String a, int b){
		color = c;
		gearType = a;
		door = b;
	}
}