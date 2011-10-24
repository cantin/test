import java.io.*;
public class SerializableTest implements Serializable {
   public int i;
   public t s; 
   SerializableTest(int i, t s ){
	this.i = i;
	this.s = s;
   }
   public void f(SerializableTest s) throws IOException{
	   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ss.txt"));
	   out.writeObject(s);
	   out.flush();
   }
   public static  void v(SerializableTest s)throws Exception{
	   ObjectInputStream in = new ObjectInputStream(new FileInputStream("ss.txt"));
	   s = (SerializableTest)in.readObject();
	   System.out.println(s);
   }

   public static void main(String[] args)throws Exception{
	   t t = new t(9);
	   SerializableTest test = new SerializableTest(10,t);
	   test.f(test);
	   System.out.println(test);
		SerializableTest.v(test);
   }
}
class t implements Serializable{
	public int i ;
	public t(int i ){
		this.i = i;
	}
}
