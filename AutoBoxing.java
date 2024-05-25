public class AutoBoxing {
@SuppressWarnings("removal")
public static void main(String[] args) {
    int a =100;
    Integer a1 = new Integer(a);
    //AutoBoxing.java:4: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
    System.out.println(a1);
    int b = a1;
    System.out.println("unboxing "+ b);
}    
}