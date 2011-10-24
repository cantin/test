class Amphibian{
  Amphibian(){
 System.out. println("sds");
}
  public  void  pf(final Amphibian amphibian){
  System.out.println("Amphibian");
 }
}

public class frog extends Amphibian{
  frog(){System.out.println("ss");}
/* protected void pf(Amphibian amphibian){
    System.out.println("frog");
} */
 public static void main(String args[]){
   //frog test = new frog();
  //frog test1 = new frog();
  // test.pf((Amphibian)test1);
  // new frog().pf(new frog());
  System.out.println("sss");
}
}
