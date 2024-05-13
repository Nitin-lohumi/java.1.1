class Ab implements Runnable{
  Thread t;
  String Name;
  Ab(String threadName){
    this.Name= threadName;
    t= new Thread(this,Name);
  }
  public void run(){
    try{
      for(int i=0; i<3; i++){
        System.out.println("thread"+i);
      }
    }catch(Exception e){
        System.out.println("Error occur");
    }
  System.out.println("Exit");

  }

}

public class Thread_Join_Alive {
public static void main(String args[]){
  Ab a= new Ab("thread 1");
  Ab b= new Ab("thread 2");
  Ab c= new Ab("thread 3");
  
  a.t.start();
  b.t.start();
  c.t.start();
  System.out.println("is alive "+ a.t.isAlive());
  System.out.println("is alive "+ b.t.isAlive());
  System.out.println("is alive "+ c.t.isAlive());
  try {
    System.out.println("waiting.. to terminate");
    a.t.join();
    a.t.join();
    a.t.join();
  } catch (Exception e) {
   System.out.println("niii ");
  }
  System.out.println("is alive "+ a.t.isAlive());
  System.out.println("is alive "+ b.t.isAlive());
  System.out.println("is alive "+ c.t.isAlive());
  System.out.println("Exit");
}    
}