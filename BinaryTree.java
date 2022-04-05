class Node{
	Node left,right;
	int data=10;
	public Node(int value) {
		data=value;
		left=right=null;

		
	}
}
class BinaryTree{
	 Node root;
	BinaryTree(int data){
		root=new Node(data);
	}
	BinaryTree(){
		root=null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tr=new BinaryTree();
		tr.root = new Node(1);
		tr.root.left = new Node(2);
		System.out.println(" "+tr.root.data);
		System.out.println("/"+" "+"\\");
		System.out.println(tr.root.left.data+" "+tr.root.right);


	}

}
