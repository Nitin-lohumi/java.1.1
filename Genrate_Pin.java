import java.util.*;
class Pin{
    public int minDigit(int n1, int n2 , int n3){
        int min=((n1%10)<(n2%10))?((n1%10<n3%10)?(n1%10):(n3%10)):((n2%10)<(n3%10)?n2%10:n3%10);
            return min;
        }
     public int maxDigit(int n1, int n2, int n3){
        int max= ((n1%10)>(n2%10)) ? 
        ((n1%10>n3%10)?(n1%10):(n3%10)): ((n2%10)>(n3%10)?n2%10:n3%10);
        return max;
    }
}  
public class Genrate_Pin {    
    public static void main(String [] args){  
        Pin m = new Pin();
      @SuppressWarnings("resource")  
    Scanner s = new Scanner(System.in);  
      System.out.println("Enter the frist number");
      int n1 = s.nextInt();  
      System.out.println("Enter the second  number");
      int n2 = s.nextInt();
      System.out.println("Enter the third number");
      int n3 = s.nextInt();
      int a =n1 , b = n2 , c = n3;
      int pin =0;
      int min = m.minDigit(a,b,c);
      for(int i=0; i<3; i++){
       pin = pin*10 +m.maxDigit(n1,n2,n3);
       n1=n1/10;
       n2=n2/10;
       n3=n3/10;
       }
       int r=0, p=0;
       while(pin>0){
        r = pin%10;
        p = p*10+r;
        pin= pin/10;
       } 
       for(int i=0; i<3; i++){
          if(min>=m.minDigit(a,b,c)){
            min=m.minDigit(a,b,c);
            a=a/10;
            b=b/10;
            c=c/10; 
          }
        }
          min = min*1000;
          if(p<100){
            p=p*10;
            p=min+p;
          }
          else{
            p = p+min;
          }
        System.out.println("the pin number is "+ p);
        }
}
