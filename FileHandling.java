import java.io.*;
public class FileHandling {
 public static void main(String[] args) throws IOException {
 FileOutputStream fout = new FileOutputStream("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
 try (PrintStream pout = new PrintStream(fout)) {
    pout.println("nitin lohumi is created a file");
    pout.close();
}
FileReader fr = new FileReader("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
try (BufferedReader br = new BufferedReader(fr)) {
    String line = br.readLine();
     System.out.print((String)line);
    br.close();
} 
fout.close();
}
}
