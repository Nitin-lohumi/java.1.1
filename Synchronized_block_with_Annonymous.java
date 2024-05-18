class Sender {
    public void print(String msg)
     {
      System.out.println("sending msg is "+ msg);
      try{
      Thread.sleep(1000);
      }catch(Exception e){
        System.out.println("exception");
      }
      System.out.println("\n" +msg + " Sent");  
     }

}
class SenderThread extends Thread {
    String msg;
    Sender obj;
    SenderThread(String m ,Sender o){
       this.msg = m;
       this.obj = o;
      }
      public void run(){
        synchronized(obj){
          obj.print(msg);
        }
      }
}

public class Synchronized_block_with_Annonymous {
    public static void main(String[] args) {
      Sender s = new Sender();
      SenderThread t0= new SenderThread("hello",s);
      SenderThread t1 = new SenderThread("this is nitin lohumi ",s);
      t0.start();
      t1.start();
      try  
      {   
        t0.join();   
        t1.join();   
      }   
      catch(Exception e)   
      {   
        System.out.println("Interrupted");   
      }   
    }
}
