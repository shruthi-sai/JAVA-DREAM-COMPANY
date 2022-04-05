import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int position=-1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Target no is:");
		int target = in.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				position = i;
				break;
				
			}
			
		}
		if(position!=-1) {
			System.out.println(target+" "+position);
		}
		else {
			System.out.println("Cannot find the target"+ " "+position);
		}

	}

}
