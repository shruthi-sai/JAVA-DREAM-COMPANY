import java.util.*;
public class SelectionSort {
	static void selectionsort(int arr[]) {
		int a = arr.length;
		int temp=0;
		for(int i =0;i<a;i++) {
			for(int j =i+1;j<a;j++) {
		        int min = arr[i];

				if(min>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorted: ");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= in.nextInt();
		}
		System.out.println("Before sorted: ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		selectionsort(arr);
		

	}

}
