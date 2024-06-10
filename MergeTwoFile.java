import java.io.*;
public class MergeTwoFile {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception{
    PrintWriter pw = new PrintWriter("C:/users/lenovo/OneDrive/Desktop/merge.txt");
    FileReader fr = new FileReader("C:/users/lenovo/OneDrive/Desktop/oneFile.txt");
    BufferedReader br = new BufferedReader(fr);
    String line = br.readLine();
    while(line!= null){
        pw.print(line);
        line = br.readLine();
    }
    br = new BufferedReader(new FileReader("C:/users/lenovo/OneDrive/Desktop/SecondFile.txt"));
    line = br.readLine();
    while(line!= null){
        pw.print(line);
        line= br.readLine();
    }
  br.close();
}
}


//
// import java.io.*;
// public class MergeTwoFile {
//     public static void main(String[] args) throws Exception{
//         FileReader fr1 = new FileReader("C:/users/lenovo/OneDrive/Desktop/oneFile.txt");
//         BufferedReader br1 = new BufferedReader(fr1);
//         String i ;
//         i = br1.readLine();
//         // while((i=br1.read())!=-1){
//         //   merge =+ (char)i;
//         //   System.out.print((char)i);
//         // }
//         FileReader fr2 = new FileReader("C:/users/lenovo/OneDrive/Desktop/SecondFile.txt");
//         BufferedReader br2= new BufferedReader(fr2);
//         String j = br2.readLine();
//         // while((i=br1.read())!=-1){
//         //   System.out.print((char)i);
//         // }
//          String k=i+j;
//         FileWriter fw=  new FileWriter("C:/users/lenovo/OneDrive/Desktop/mergeFile.txt");
//         BufferedWriter bw = new BufferedWriter(fw);
//         bw.write(k);
//         bw.close();
//         fw.close();
//         br2.close();
//         br1.close();
//     }
// }
