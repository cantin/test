import java.util.*;
public  class IterableClass implements Iterable<String> {
 public String[] words = ("And that is how"+"this is the hope.").split(" ");
   public Iterator<String> iterator(){
 return new Iterator<String>(){
       private int index = 0;
       public boolean hasNext(){}//return index < words.length;}
       public String next(){}// return words[index++];}
       public void remove(){}
      };
  }
 public static void main(String[] args){
     IterableClass test = new IterableClass();
     for(String s: test)
            System.out.println(s+" ");
}
}
