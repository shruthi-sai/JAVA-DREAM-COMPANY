import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
class WriteFile{
public static void main(String[] args) throws IOException{
File file = new File("Demo.txt");
PrintWriter output = new PrintWriter(file);
output.println("Face");
output.println(10);
output.close();
}
}
