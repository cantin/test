import java.io.*;
import static state.*;
public  enum state {A,B,C}
public class DFA{
 void f(){
     BufferedReader in = new BufferedReader(new InputStreamReader(new InputStream(System.in)));
     String s;
     s=in.readLine();
     state t = state.A;
     for(char c : s.toCharArray)
       switch(t) {
           case A: {if(c == 'a'){ t = B;break;}
                    if(c == 'b'){ t = A;break;}
                     else {System.out.println("error");break;}
                    }
	   case B: {if(c == 'a'){ t = B;break;}
                    if(c == 'b'){ t = C;break;}
                     else {System.out.println("error");break;}
                    }
           case C: {if(c == 'a'){ t = B;break;}
                    if(c == 'b'){ t = A;break;}
                     else {System.out.println("error");break;}
                    }
                 }
       if(t == C) System.out.println("OK!");
    }
public static void main(String[] args){
 new DFA().f();
}

         
           }
