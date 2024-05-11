abstract class A {
A(int a){
System.out.println("this is constructor" + a);
}
abstract void m1(int a);
void m1(){
    System.out.println("this is  m1 method ");
}
}
class B extends A{
    int y;

    B(int y){
        super(y);
        this.y = y;
    }
 void m1(int y){
    super.m1();
 }

}
/**
 * JavaExam
 */
public class JavaExam {
public static void main(String[] args) {
B b = new B(10);
b.m1();
}
    
}