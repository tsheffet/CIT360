package ThreadsExecutors;
import java.util.concurrent.atomic.*;

public class ThreadExtends extends Thread {
	private AtomicInteger count = new AtomicInteger(10);
	private int num = new AtomicInteger(0).hashCode();
	
	public void runProgram() {
		for (int i=10; i>0; i--) {
			System.out.println(num + count.getAndDecrement());
			
			
				
			}
		}
	
	

}
