import java.util.*;
import java.io.*;
import java.util.regex.*;
public class DirList{

	public static void main(String[] args){
/*		File file = new File(".");
		DirFilter dr = new DirFilter(args[0]);
		String[] list;
	    System.out.println(file.list().length);
		list = file.list(new DirFilter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		System.out.println(list.length);
		for(String name : list)
			System.out.println(name);
			*/
		f(args[0]);
	}
	public static void f(String ss){
		String[] a = TextFile.read("DirList.java").split(" ");
		File file = new File(".");
		List list = new ArrayList();
		DirFilter dirFilter = new DirFilter(ss);
		for(String s : a)
			if(dirFilter.accept(file,s))
				list.add(s);
		System.out.println(list);

		
}
}

	class DirFilter implements FilenameFilter{
		private Pattern pattern;
		public DirFilter(String regex){
			pattern = Pattern.compile(regex);
		}
		public boolean accept(File dir, String name){
			return pattern.matcher(name).matches();
		}
	}

