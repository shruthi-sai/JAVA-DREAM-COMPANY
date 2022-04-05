import java.util.*;
public class BubbleSort {
	static void bubblesort(int arr[]) {
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nArrays after Sorted: ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int arr[]=new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Arrays before Sorted: ");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		bubblesort(arr);

	}

}
