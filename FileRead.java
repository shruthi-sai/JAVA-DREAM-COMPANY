
import java.io.File;

import java.util.Scanner;
import java.io.FileNotFoundException;
class FileRead{
public static void main(String[] args) throws FileNotFoundException{
File file = new File("C:\\Users\\Sai Shruthi\\eclipse-workspace\\WriteFile\\Demo.txt");
Scanner myReader = new Scanner(file);
while(myReader.hasNextLine()) {
	String data = myReader.nextLine();
	System.out.println(data);
}myReader.close();

}
}