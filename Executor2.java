package ThreadsExecutors;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor2 {
	ExecutorService Service2 = Executors.newFixedThreadPool(2);
	{
		System.out.println("Executor2 starts.");
		
		Service2.execute(new DoRun());
		Service2.execute(new DoRun());
		
		Service2.shutdown();
		
		System.out.println("Executor 2 is done.");
	}
	
}