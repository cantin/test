public class SixTuple<a,B,C> {
  public final a one;
  public final B two;
  public final C three;
  SixTuple(a one,B two,C three){
	  this.one = one;
	  this.two = two;
	  this.three = three;
  }
  public String toString(){
	  return one+" "+two+" "+three;
  }
  public static void main(String[] args){
	  SixTuple<Integer,String,String> test = new SixTuple<Integer,String,String>(1,"ss","ww");
	 System.out.println(test);
  }
} 
