//using inheritance
/*class SingleThread extends Thread{

	
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		s1.start();

	}

}*/

//use of sleep 
/*class SingleThread extends Thread{
	
	public void run() {
		for(int i =0;i<5;i++) {
			try {
			
			
				Thread.sleep(3000);
			}
			catch(Exception e) {}
		}
		System.out.println("Thread is running");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		s1.start();

	}

}*/



//using interface
/*class SingleThread implements Runnable{
	
	public void run() {
		Thread t3=new Thread();
	    for(int i =0;i<5;i++) {
			try {
				t3.sleep(1000);
			}
			catch(Exception e) {}
		
		System.out.println(i);
	}
}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		Thread t4 = new Thread(s1);
		t1.start();
		t2.start();
		t4.start();

	}
}*/



//use of join - multiple threading -individual thread by thread process
/*class SingleThread implements Runnable{
	
	public void run() {
		Thread t3=new Thread();
		for(int i =0;i<5;i++) {
			try {
				t3.join();
			}
			catch(Exception e) {}
		
		System.out.println(i);
	}
}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		t1.start();
		t2.start();

	}
}*/


//use of setname and getname
/*class SingleThread implements Runnable{
	
	public void run() {
		Thread t3=new Thread();
		for(int i =0;i<5;i++) {
			try {
				t3.join();
			}
			catch(Exception e) {}
		
		System.out.println(i);
	}
}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		
		//t1.start();
		//t2.start();
		t1.setName("Sai shruthi");
		System.out.println(t1.getName());

	}
}*/



//use of setPriority, getP
riority and is Alive
class SingleThread implements Runnable{
	
	public void run() {
		Thread t3=new Thread();
		for(int i =0;i<5;i++) {
			try {
				t3.join();
			}
			catch(Exception e) {}
		
		System.out.println(i);
	}
}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s1 = new SingleThread();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		Thread t4=new Thread("Mech");
		
		
		t1.start();
		System.out.println(t1.isAlive());//T1 is running so true

		t2.start();
		t1.setName("Sai shruthi");
		System.out.println(t4.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(4);
		System.out.println("new "+t1.getPriority() );
		System.out.println(t1.isAlive());//T1 is done running so false

	}
}

