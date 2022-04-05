
public class Main5 {

	public static void validate(int age) {
		// TODO Auto-generated method stub
		if(age<21 || age>27)
			throw new ArithmeticException("Not eligible");
		else
			System.out.println("Eligible");
	}
	public static void main(String [] args) {
		try {
			
		
		validate(30);
		}
		catch(Exception e) {
		System.out.println("rest..");
		}
	
			

	}

}
