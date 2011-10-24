import java.util.*;
public class GerbilMap{
	public void gMap(Map<String,Gerbil> map){
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			Gerbil g = map.get(s);
			System.out.print(s+":");
			g.hop();
		}
	}
	public static void main(String[] args){
		Map<String,Gerbil> map = new HashMap<String,Gerbil>();
		map.put("alex",new Gerbil(1));
		map.put("aex",new Gerbil(2));
		map.put("ax",new Gerbil(3));
		GerbilMap gerbilmap = new GerbilMap();
		gerbilmap.gMap(map);
		System.out.println(map);
	}
}
