import java.util.*;
public class PatternTest{
   void pattern(){
	 String sp = "then, when you have found the shrubbery, you must "+"cut down the mightiest tree in the forest... "+
			"with.... a hetting!";
		System.out.println(Arrays.toString(sp.split("you")));		
		System.out.println(Arrays.toString(sp.split("the")));
		System.out.println(sp.replaceAll("a|e|i|o|u","_"));
   }
   public static void main(String[] args){
	   PatternTest test = new PatternTest();
	   test.pattern();
   }
}
