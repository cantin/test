import java.util.*;
public class Listiterator{
		public void reverse(List<Integer> list1,List<Integer> list2){
				ListIterator<Integer> it = list1.listIterator();
				while(it.hasNext()) it.next();
				while(it.hasPrevious()) list2.add(it.previous());
				System.out.println(list2);
		}
		public static void main(String[] args){
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			for(int i = 0; i<10; i++){
				list1.add(i);
			}
			Listiterator lt = new Listiterator();
			lt.reverse(list1,list2);
		}
}


						
