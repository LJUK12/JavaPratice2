package ex6;

class Document{
	static int count = 0;
	String name; //������
	Document(){
		this("�������"+ ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("���� :"+ this.name);
		
	}
}

public class ex6_30 {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}
