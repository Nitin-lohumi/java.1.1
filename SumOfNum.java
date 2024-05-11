import java.util.*;
public class SumOfNum {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
      System.err.println("enter  4 digit number only ");
      int number =s.nextInt();
      int n1 =number;
      int n2 =number/10;
      int n3 =number/100;
      int n4 = number/1000;
      int s1 = 0;
      int count =0;
      while (number>0){
        number = number /10;
        count = count +1;
      }
      if(count==4){
       while (n1>0){
        s1 = s1+n1%10;
        System.out.print("("+ s1+")+");
        n1= n1/10;
       }
        while (n2>0){
          s1= s1 +n2%10;
          System.out.print("("+ s1+")+");
          n2= n2/10;
        }
        while (n3>0) {
          s1= s1 +n3%10;
          System.out.print("("+ s1+")+");
          n3= n3/10;
        }
        while (n4>0) {
          s1= s1 +n4%10;
          System.out.print("("+ s1+")");
          n4= n4/10;
        }
      
       System.out.println("the sum of numbber digits is " + s1);

      }
      else{
        System.out.println("please enter only 4 digits number");
      }
    }
}
