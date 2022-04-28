package ex7;
class TV{
	boolean power;
	int channel;
	void power() {power = !power;}
	void channerUp() {++channel;}
	void channelDown() {--channel;}
}
class CaptionTv extends TV{
	boolean Caption;
	void displayCaption(String text) {
		if(Caption) {
			System.out.println(text);
		}
	}
}
public class ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channerUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world!");
		ctv.Caption = true;
		ctv.displayCaption("Hello, world!");
		
	}

	
}
