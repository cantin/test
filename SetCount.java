import java.util.*;
public class SetCount{
	public void count(Set<String> set){
		int totalcount = 0;
		Character[] letter = {'A','E','I','O','U','a','e','i','o','u'};
		Set<Character> s = new TreeSet<Character>();
		//Collections.addAll(s,'A','E','I','O','U','a','e','i','o','u');
		Collections.addAll(s,letter);
			for(String st : set){
				int lettercount = 0;
				for(Character c : st.toCharArray()){
					if(s.contains(c)){
						lettercount++;
						totalcount++;
					}
				}
			System.out.print(st+":"+lettercount+"  ");
			}
		System.out.println("\n"+"totalcount:"+totalcount);
	}
	public static void main(String[] args){
		SetCount test = new SetCount();
		Set<String> set = new TreeSet<String>(new TextFile("SetCount.java","\\W+"));
		test.count(set);
	}
}
