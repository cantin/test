import java.util.*;

public class Genertor{
  String name[] = { "snow white","star war","the martix","fire man"};
  static int i = 0;
  public String next(){
	 if(i%(name.length) == 0) i=0;
         return name[i++];
	}

  public static void main(String[] args){
	List<String> list = new ArrayList<String>();
 	Set<String> set = new HashSet<String>();
	Genertor genertor = new Genertor();
	for(int i =0; i<5; i++){
		list.add(genertor.next());
		set.add(genertor.next());
	}
	System.out.println(list);
	System.out.println(set);
}
}
