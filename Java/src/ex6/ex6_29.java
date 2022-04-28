package ex6;

class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {}
}


public class ex6_29 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품넘버는 : "+p1.serialNo);
		System.out.println("p2 제품넘버는 : "+p2.serialNo);
		System.out.println("p3 제품넘버는 : "+p3.serialNo);
		System.out.println(Product.count);

	}

}
