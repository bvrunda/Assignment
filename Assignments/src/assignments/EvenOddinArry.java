package assignments;
//program to print elements present in even position 
public class EvenOddinArry {
	public static void main(String[] args) {
		
		int arr[] = new int[] {9,4,5,3,2,1};
		int sum= 0;
		
		System.out.println("element present in even position ");
		
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	}

}
