package ThreadsExecutors;

import java.util.concurrent.atomic.AtomicInteger;

public class DoRun implements Runnable {
	//same as thread extends
	private AtomicInteger count = new AtomicInteger(10);
	private int num = new AtomicInteger(0).hashCode();
	
	
	
	public void runProgram() {
		// TODO Auto-generated method stub
			for (int i=10; i>0; i--) {
			System.out.println(num + count.getAndDecrement());

	}

	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
