class Thred implements Runnable{
    Thread t;
    String name;
    Thred(String Threadname){
      name = Threadname;
      t =new Thread(this,name);
      System.out.println("child thread "+t);
    }
    public void run(){
     try {
        for(int i=0; i<5; i++){
            System.out.println("Thread is runing "+i);
            Thread.sleep(1000);
        }
     } catch (Exception e) {
        System.out.println("Exit");
     }
     System.out.println("Exiting Thread");
    }
}
public class MultiThreading {
public static void main(String[] args) {
    Thred n1 = new Thred("Thread_1");
    Thred n2= new Thred("thread_2");
    Thred n3 = new Thred("thread_3");
    n1.t.start();
    n2.t.start();
    n3.t.start();
    try {
        Thread.sleep(1000);
    } catch (Exception e) {
       System.out.println("error in main method");
    }
}
 
}
