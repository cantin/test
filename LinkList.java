import java.util.*;
public class LinkList{
	public void addMiddle(LinkedList<Integer> list,int[] array){
		ListIterator it = list.listIterator();
		for(int i = 0; i<(list.size()/2); i++){
			it.next();
		}
		for(int i = 0; i<array.length; i++){
			it.add(array[i]);
		}
		System.out.println(list);
	}
	public static void main(String[] args){
		LinkList test = new LinkList();
		LinkedList list = new LinkedList();
		int[] array = {10,20,30,40};
		for(int i = 0; i<10; i++){
			list.add(i);
		}
		test.addMiddle(list,array);
	}
}


