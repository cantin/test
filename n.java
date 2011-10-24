import java.util.*;
import java.util.regex.*;
 abstract class a{
	 abstract void f();
	 void u(){}
 }
public class n  {
	void f(){
		System.out.println("ssss");
	}
	public static  void p(){
		Pattern pattern = Pattern.compile("(\\s*\\w+)+");
		String a = "jkj kasd sss";
		System.out.println(pattern.matcher(a).matches());
	}
	static {
		System.out.println("sss");
	}
	public static void main(String[] args) {
	/*	for(Map.Entry entry : System.getenv().entrySet()){
			System.out.println(entry.getKey());
			entry.getValue();
		}
		n test = new n();
		n test1 = new n();
		try{
		Class test2 = Class.forName("n");
		System.out.println("tt");
		n test3 =(n) test2.newInstance();
		test3.f();
		}catch(Exception e){
		}*/
		n.p();
	}
}
