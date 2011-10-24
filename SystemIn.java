import java.io.*;
import java.util.*;
public class SystemIn{
	public void  read() throws IOException{
		System.out.print("input you info:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter("ss.txt"));
		PrintStream out1 = new PrintStream(new FileOutputStream("ss.txt"));
		System.setOut(out1);
		String s;
		while((s = in.readLine()) != null && s.length() != 0){
			s.toUpperCase();
			System.out.println(s);
		}
		out1.flush();
	}
	

	public static void main(String[] args) throws IOException{
			SystemIn test = new SystemIn();
			test.read();
	}
}

