import java.util.*;
class element {
	int i = 1;
}
public class SubList {
 	element ment[] = new element[10] ;
	SubList(){
		for(int i =0; i<10; i++){
			ment[i] = new element();
		}
	}
	public static void main(String[] args){
 		SubList sublist = new SubList();
		List<element> list1 = Arrays.asList(sublist.ment);
		System.out.println(list1);
		List<element> list2 = list1.subList(1,3);
		System.out.println(list2);
		}
}		
