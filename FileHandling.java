import java.io.*;
public class FileHandling {
 public static void main(String[] args) throws IOException {
//  FileOutputStream fout = new FileOutputStream("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
//  try (PrintStream pout = new PrintStream(fout)) {
//     pout.println("nitin lohumi is created a file");
//     pout.close();
// }
// FileReader fr = new FileReader("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
// try (BufferedReader br = new BufferedReader(fr)) {
//     String line = br.readLine();
//      System.out.print((String)line);
//     br.close();
// } 
// fout.close();
FileWriter fw = new FileWriter("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("hello my name is nitin and i m from here where you can not find out");
bw.close();
FileReader  fr = new FileReader("C:/users/lenovo/OneDrive/Desktop/FileHandling.txt");
BufferedReader br = new BufferedReader(fr);
int line =  br.read();
for(int i=0; i<100; i++){
    System.out.println((char)line);
    line=br.read();
    if(line==-1){
       break;
    }
}
}

}
