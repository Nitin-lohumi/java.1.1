class Test{  
    synchronized void printTable(int n){  
      for(int i=1;i<=5;i++){  
        System.out.println(n*i);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
    }  
   }  
   public class Annonymous{  
   public static void main(String args[]){  
   final Test obj = new Test();
     
   Thread t1=new Thread(){  
   public void run(){  
   obj.printTable(5);  
   }  
   };  
   Thread t2=new Thread(){  
   public void run(){  
   obj.printTable(100);  
   }  
   };  
     
   t1.start();  
   t2.start();  
   }  
   }  