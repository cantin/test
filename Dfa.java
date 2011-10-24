 import java.util.Scanner;
 import java.io.*;
 public class Dfa {
    Dfa(){
    /* String s;
     System.out.print("input1:");
     Scanner a = new Scanner(System.in);
     s = a.next();
     System.out.println(s);
      */
     int str;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.print("input2:");
     try{
       while(( str = br.read())!=-1)
       System.out.println((char)str);
       /*  switch(str){
          case ' ': 
          case 'a':
          case 'b':
          default :System.out.println("error"); break;
           }*/
      br.close();
      isr.close();
     }
    catch (Exception e){}
 }
  public static void main(String[]  args){
          Dfa test = new Dfa();
   }
}

