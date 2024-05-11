public class Multi_thread {
public static void main(String[] args){
    Thread obj = Thread.currentThread();
    System.out.println("threads is "+obj);
    obj.setName("nitin");
    System.out.println("after changing the name"+obj);
    try{
       for(int i=4; i>0; i--){
        System.out.println(i);
        Thread.sleep(1000);
       }
    }catch(Exception e){
        System.out.println("error thread is ococur");
    }
}
}
