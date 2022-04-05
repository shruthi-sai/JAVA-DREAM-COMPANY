import java.util.*;
class BinarytreeA {
	int root=0;
	String s[]=new String[10];
	void Root(String value) {
		s[0]=value;
	}
	void LeftSubTree(String value,int root) {
		int leftsubtree=(root*2)+1;
		if(s[root]==null) {
			System.out.println("cannot find path"+leftsubtree);
		}
		else {
			s[leftsubtree]=value;
		} 
	}
	void RightSubTree(String value,int root) {
		int rightsubtree=(root*2)+2;
		if(s[root]==null) {
			System.out.println("cannot find path"+rightsubtree);
		}
		else {
			s[rightsubtree]=value;
			//System.out.println(s[rightsubtree]);
		}
		
	}
	void display() {
		for(int i=0;i<10;i++)
			if(s[i]!=null) {
				System.out.println(s[i]);
			}
	}

	public static void main(String[] args) {
		BinarytreeA bs = new BinarytreeA();
		bs.Root("A");
		bs.LeftSubTree("b", 0);
		bs.RightSubTree("c", 0);
		bs.display();
	}

		
		

	}


