class Test1{
synchronized static  void print(int n){//syncrozation method
    for(int  i=0; i<6; i++){
        System.out.println(n*i);
        try{
            Thread.sleep(1000);
        }
         catch (Exception e) {
         }
    }
}
}
class staticThread1 extends Thread {
    public void run(){
        Test1.print(10);
    }
}
class staticThread2 extends Thread {
    public void run(){
        Test1.print(100);
    }
}
class staticThread3 extends Thread {
    public void run(){
        Test1.print(1000);
    }
}
public class StaticSynchronize {
    public static void main(String[] args) {
       staticThread1 s1 =new staticThread1();
       staticThread2 s2 = new staticThread2();
       staticThread3 s3 = new staticThread3();
       s1.start();
       s2.start();
       s3.start();
    }
}
