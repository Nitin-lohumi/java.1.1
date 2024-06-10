import java.io.*;
public class File_in_buffer {
public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("c:/Users/Lenovo/OneDrive/Desktop/bufferJava.txt");
    BufferedReader br = new BufferedReader(fr);
    int i=br.read();
   do{
    i=br.read();
    System.out.print((char)i);
   }while(i!=-1);
    fr.close();
    br.close();
  }
}