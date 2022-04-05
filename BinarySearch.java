import java.util.*;


public class BinarySearch {
	

	
	
	int Binary(int start,int end,int target,int mid,int arr[]) {
		int position=-1;
		if(start<=end) {
			mid=(start+end)/2;
			if(target==arr[mid]) {
			position=mid;
			return position;
		}
		else if(target<arr[mid]) {
			return Binary(start,mid-1,target,mid,arr);
		}
		else {
			return Binary(mid+1,end,target,mid,arr);
		}
		}
		else {
				System.out.println("elemets cannot find");
				return -1;
			}
	}
				
			
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Target no is:");
		 int target=in.nextInt();
	    int start=0;
		int end=n-1;
		 int mid=0;
		 int position=-1;
		
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.Binary(start, end, target,mid,arr));
		
		
		
		

	}
}



