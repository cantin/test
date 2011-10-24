import java.io.*;
import java.util.regex.*;
import java.util.*;
public class BufferList{
	public List f(String filename) throws IOException{
		BufferedReader  in  = new BufferedReader(new FileReader(filename));
		String s;
		List list = new LinkedList();
		while((s = in.readLine()) != null)
				list.add(s);
		return list;
	}
	public void display(List list){
		int i = list.size();
		while(i-- != 0){
			System.out.println(list.get(i));
		}
	}
	public List change(List list){
		String s;
		 for(int i = 0; i<list.size(); i++){
			 s = (String)list.get(i);
			list.remove(i);
			list.add(i,s.toUpperCase()); 
		}
		return list;
	}
	public List search(List list,String regex){
		Pattern pattern = Pattern.compile(regex);
		List rlist = new LinkedList();
		for(Object s : list){
			String a = (String)s;
			System.out.println(a+"\n");
			String[] c = a.split(" ");
			for(int i = 0; i<c.length; i++){
			 if(pattern.matcher(c[i]).matches())
			 {rlist.add(a);break;}
			}
		}
		return rlist;
	}
	public void write(String filename) throws IOException{
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		BufferedReader in = new BufferedReader(new FileReader("BufferList.java"));
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null){
			System.out.println(s);
			out.println(lineCount+":"+s);
			lineCount++;
		}
		out.flush();
	}

	public static void main(String[] args) throws IOException{
		BufferList test = new BufferList();
		/*List list = test.f(args[0]);
		list = test.change(list);
		list = test.search(list,args[1]);
		test.display(list);*/
		test.write("ss.txt");
	}
}

