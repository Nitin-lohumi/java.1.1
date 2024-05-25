public class AutoBoxing {
public static void main(String[] args) {
    int a =100;
    Integer a1 = new Integer(a);
    //AutoBoxing.java:4: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
    System.out.println(a1);
}    
}