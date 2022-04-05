import java.io.File;
import java.io.FileNotFoundException;
class DeleteFile{
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Sai Shruthi\\eclipse-workspace\\WriteFile\\Demo.txt");
		if(file.delete()) {
			System.out.println(file.getName() + " is deleted");
		}
		else {
			System.out.println("Delete failed");
		}
	}
}