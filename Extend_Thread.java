class Thread_cls extends Thread{
    Thread_cls(){
        super("nitin");
        System.out.println("child Thread"+ this);
    }
    public void run(){
        try {
            for(int i=0; i<5; i++){
                System.out.println("Child Thread "+ i);
                Thread.sleep(400);
            }
        } catch (Exception e) {
          System.out.println("Child thread Exception");
        }
        System.out.println("Existing");
    }
}
class Extend_Thread {
public static void main(String[] args) {
    Thread_cls n =  new Thread_cls();
    n.start();
    try {
        for(int i=0; i<5; i++){
            System.out.println("parents Thread "+ i);
            Thread.sleep(400);
        }
    } catch (Exception e) {
      System.out.println("parent thread "+ e);
    }
    System.out.println("Existing");

}
}