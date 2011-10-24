interface five{
 void a();
} 
class four{
  public void f(){
  System.out.println("ssss");
  }
}

class three extends four{
 public  String f(String s){
  System.out.println("sss");
  return s;
 }
}

class two extends three{
 public int f(int s){
  System.out.println("ss");
  return s;
}
}

public class zero extends two implements five{
 public char f(char s){
  System.out.println("s");
 return s;
}
public void a(){}
 public static void main(String[] args ){
   zero z = new zero();
   z.f();
   z.f("shi");
   z.f(1);
   z.f('s');
}
}
