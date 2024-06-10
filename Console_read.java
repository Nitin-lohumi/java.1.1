import java.io.*;
public class Console_read {
    public static void main(String[] args) throws IOException {
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
        c=(String)br.readLine();
        System.out.println(c);
        }while(!c.equals("stop"));
    }
}
