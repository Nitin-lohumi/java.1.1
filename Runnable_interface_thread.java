class NewThread implements Runnable{
    Thread t ;
    NewThread(){
        t = new Thread(this,"nitin_Lohumi");
        System.out.println("child thread "+ t);
    }
    public void run(){
        try{
          for(int i=0; i<5; i++){
             System.out.println("child Thread "+ i);
             Thread.sleep(500);
          }
        }
        catch(Exception e){
            System.out.println("thread Exception");
        }
        System.out.println("Exiting from child thread");
    }
}
public class Runnable_interface_thread {
public static void main(String[] args) {
  NewThread nt = new NewThread();
     nt.t.start();
     try{
      for(int  i=0; i<5; i++){
        System.out.println("parents Class "+ i);
        Thread.sleep(600);
      }
     }catch(Exception e){
       System.out.println("Exception in occur in parent Class"); 
     }
     System.out.println("Existing from parent class");
}
}