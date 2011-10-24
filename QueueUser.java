import java.util.*;

class Command{
	String s;
	Command(String s){
		this.s = s;
	}
	void  operation(){
		System.out.println(s);
	}
}

class QueueFactory{
	public Queue<Command> factory(Command com, Queue<Command> qu){
		qu.add(com);
		return qu;
	}
}

public class QueueUser{
	public void queueUser(Queue<Command> qu){
		Command com = qu.poll();
		com.operation();
	}

	public static void main(String[] args){
		Queue<Command> qu = new LinkedList<Command>();
		Command com1 = new Command("1");
		Command com2 = new Command("2");
		Command com3 = new Command("3");
		Command com4 = new Command("4");
		QueueFactory quft = new QueueFactory();
		quft.factory(com1,qu);
		quft.factory(com2,qu);
		quft.factory(com3,qu);
		quft.factory(com4,qu);
		QueueUser quser = new QueueUser();
		quser.queueUser(qu);
		quser.queueUser(qu);
		System.out.println(qu);
		qu.peek().operation();
		
		System.out.println(qu);
	}
}
