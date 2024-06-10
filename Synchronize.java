class table{
   int i;
    synchronized void printTable(int n){
        for( i=0; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
              System.out.println("e  = "+ e);
            }
        }
    }
}
class MyThread1 extends Thread{
    table t;
    MyThread1(table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread2 extends Thread {
    table t;
    MyThread2(table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class Synchronize {
public static void main(String[] args) {
    table obj  = new table();
    MyThread1 t1= new MyThread1(obj);
    MyThread2 t2 = new MyThread2(obj);
    t1.start();
    t2.start();
    try {
        Thread.sleep(1000);
    } catch (Exception e) {
        System.out.println("exceptionj");
    }
}
}