import java.util.concurrent.*;
public class RunnableTest implements Runnable{
	static int i = 2;
	public void run(){
		int j = 0;
		while(j<10){
		System.out.println(i);
		i = i*i;
		j++;
		}
	}
	public static void main(String[] args){
		ExecutorService exec = Executors.newCachedThreadPool();
		int i = 0;
		while(i<4){
			exec.execute(new RunnableTest());
			i++;
			}
		exec.shutdown();
	}
}

