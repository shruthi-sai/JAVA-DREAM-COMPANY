import java.util.*;
class InsertionSort{
	public static void insertionsort(int arr[]){
		int n = arr.length;
		for(int j=1;j<n;j++){
			int key = arr[j];
			int i = j-1;
            while((i>-1) && (arr[i]>key)){
            	arr[i+1] = arr[i];
            	i--;
            }
            arr[i+1]=key;
		}
	}
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int a = in.nextInt();
        int[] arr1 = new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Before Sorted: ");
        for(int i : arr1){
        	System.out.print(i +" ");
        }
        System.out.println();
        insertionsort(arr1);
        System.out.println("After Sorted: ");
        for(int i:arr1) {
        	System.out.print(i+" ");
        }
	}
}

        
        

