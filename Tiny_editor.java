import java.io.*;
public class Tiny_editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("write here below the 100 lines");
        System.out.println("write stop to stop writing");
        for(int i  =0; i<100; i++){
            str[i]= br.readLine();
            if(str[i].equals("stop")){
                break;
            }
        }
        System.out.println("here is your thought of writing");
        for(int  i =0; i<100; i++)
       { if(str[i].equals("stop"))
           {
            break;
               }    
           System.out.println(str[i]);
       }
    }
}
