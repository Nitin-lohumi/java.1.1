import java.util.*;
class febonacie{
Scanner s1 =new Scanner(System.in);
   int one=0;
   int two=1;
   int next;
   int number;//0 1 1 2 3 5 8
 febonacie(int n){
   number=n;
 }
   void  process(int n){
    System.out.print(one + " " + two );
    if(number>0){
        next = one+ two ;
        System.out.println(" "+ next);
        one=two;
        two =next;
        process(n-1);
    }
}
public class program {
    public static void main(String[] args) {
        febonacie f=  new febonacie(10);
        f.process(10);
    }
}
}