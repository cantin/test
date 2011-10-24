class Cleaner{
 private String s = "Cleaner";
 public void append(String a){ s += a;}
 public void dilute(){append("dilute()"); System.out.println(s); }
 public void apply(){ append("apply()");}
 public void scrub(){ append("scrub()");}
 public String toString(){ return s;}
 public static void main(String args[]){
    Cleaner x = new Cleaner();
    x.dilute();x.apply();x.scrub();
    System.out.println(x);
 } 
}

public class Detegent{
  static public String s = "Detegent";
  private Cleaner cleaner = new Cleaner();
  public void append(String a){ s = a;}
  public void dilute(){ cleaner.dilute();}
  public static void main(String[] args){
     Detegent x = new Detegent();
     x.dilute();
     Cleaner.main(args);
     x.append("zai zhi");
     System.out.println(s);
 }
}

      
