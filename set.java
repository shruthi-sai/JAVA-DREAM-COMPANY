package set;
import java.util.*;
class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		obj.add("50");
		obj.add("100");
		obj.add("hello");
		
		LinkedHashSet lhs = new LinkedHashSet(obj);
		lhs.add(50);
		lhs.add(50);
		lhs.add("hello");
		lhs.add("ko");
		TreeSet ts = new TreeSet(obj);
		System.out.println(lhs);

	}

}
