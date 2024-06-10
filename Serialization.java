import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class Demo implements java.io.Serializable{
    public int a ;
    public String str;
  public Demo(int a , String str){
      this.a = a;
      this.str = str;
    }
}
public class Serialization {
    public static void main(String[] args) {
        Demo d = new Demo(1, "hello my name is nitin and this is wrote by java");
        String filename ="C:/Users/Lenovo/Documents/nitin.txt";
        try {
        FileOutputStream file  = new FileOutputStream(filename);
        ObjectOutputStream out  = new ObjectOutputStream(file);
        out.writeObject(d);
        out.close();
        file.close();
        System.out.println("the object is serailization");
        } catch (Exception e) {
            System.out.println("incought cougght exception");
        }

        Demo object1 = null;

        try {
            FileInputStream file  = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Demo)in.readObject();
            in.close();
            file.close();
            System.out.println("the object is deserialized");
            System.out.println("a = " +object1.a);
            System.out.println("string = "+ object1.str);
        } catch (Exception e) {
           System.out.println("input output exception");
        }
    }
}
