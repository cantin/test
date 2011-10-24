import java.util.*;
public class Gerbil{
 int gerbilNumber;
 Gerbil(int i){
  gerbilNumber = i;
}
void hop(){
 System.out.println(gerbilNumber);
 System.out.println("it is  jump");
}
public static void main(String[] args){
  List<Gerbil> list = new ArrayList<Gerbil>();
  for(int i = 0; i<3; i++){
    	Gerbil test = new Gerbil(i);
   	list.add(test);
	}
   Iterator<Gerbil> it = list.iterator(); 
	while(it.hasNext()){
		Gerbil g = it.next();
		g.hop();
	}
}
}


