package ex6;

public class ex6_12 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum =" + sumArr(arr));

	}

	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+", ");
		}
		System.out.println("]");
	}
	static void sortArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
	static int sumArr(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}
}
