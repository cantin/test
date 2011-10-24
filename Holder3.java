class pet{
  void f(){ System.out.println("pet");
}
class dog extends pet{
  void f(){ System.out.println("dog");};
}
public class Holder3<T>{
  private T a;
 public  Holder3(T a){ this.a = a;}
 public void set(T a){ this.a = a;}
 public T get(){ return a;}
 public static void main(String[] args){
     Holder3<pet> test = new Holder3<dog>(new dog());
     test.f();
}
}
