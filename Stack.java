import java.util.*;
class Stack {
	class Node{
		Node next;
		int data=10;
		Node head;
		Node tail;
		Node top=null;
		int push(int data) {
			Node new1 = new Node();
			if(top==null) {
				new1.data=data;
				new1.next=null;
				top=new1;
				System.out.println(new1.data+" "+ new1);
				return push(data-1);
			}
			else if(data==0) {
				return 0;
			}
			else {
				new1.data=data;
				new1.next=null;
				top.next=new1;
				System.out.println(new1.data+" "+new1);
				return push(data-1);
			}
		}
	}


	public static void main(String[] args) {
		Stack.Node obj = new Stack().new Node();
		obj.push(10);
	}
}