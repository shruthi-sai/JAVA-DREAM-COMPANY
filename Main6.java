import java.util.regex.*;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pattern pat = Pattern.compile(".m");
		Matcher ma = pat.matcher("am");
		boolean b = ma.matches();
		System.out.println(b);*/
		
		
		/*Pattern pat = Pattern.compile("abb");
		Matcher ma = pat.matcher("abbcabbeabb");
		while(ma.find())
		{
			System.out.println(ma.group()+" Start index is "+ma.start()+" End index is "+ma.end()+ " Group count: "+ma.groupCount());
		}*/
		
               //(or)
    	/*boolean b = Pattern.compile(".m").matcher("am").matches();
		System.out.println(b);
		
		//Methods
		System.out.println(Pattern.matches("[A-Z]{6}","ABCDLL"));
		System.out.println(Pattern.matches("[A-Z]","ABC"));
		System.out.println(Pattern.matches("[A-Z]","A"));
		System.out.println(Pattern.matches("[A-Z]?","ABC"));
		System.out.println(Pattern.matches("[A-Z]?","A"));
		System.out.println(Pattern.matches("[A-Z]?","01"));
		System.out.println(Pattern.matches("[A-Z]+","ABCD"));*/
		
	    //Phone no
       /*System.out.println(Pattern.matches("[6789]\\d{9}","8017041350"));*/
		
		//gmail
		/*System.out.println(Pattern.matches("\\w*[@]*[gmail.com]*","saikiridharan@gmail.com" ));
		//System.out.println(Pattern.matches("\\w*[@]*[a-z]*.*[a-z]","saishruhti2002@kcg.in"));*/
		
		//Password
		/*System.out.println(Pattern.matches("[A-Z]?[a-z]*[0-9]*[@$]*{4,}","as1@"));*/

		//Username
		System.out.println(Pattern.matches("[A-Z]*{6,20}","SAISHRUTHI"));
		
		
		//Email
		System.out.println(Pattern.matches("[^0-9]?[a-z]*[_@gmail.com]*","1saishruthi@gmail.com"));
		System.out.println(Pattern.matches("[a-z_0-9&&[^A-Z]]*[@gmail.com]+","saishruthi_@gmail.com"));


		
		//Difference between + and *
       /*System.out.println(Pattern.matches("[abc]+",""));
    	System.out.println(Pattern.matches("[abc]*",""));*/
     	
     	//Range
     /*	System.out.println(Pattern.matches("[a-z]{10}","abcdefghijk"));
     	System.out.println(Pattern.matches("[a-z]{10}","abcdefghij"));
     	System.out.println(Pattern.matches("[a-z]{1,}","abcdefghijk"));
     	System.out.println(Pattern.matches("[^0-9]","a"));*/


	}

}
