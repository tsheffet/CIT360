package ThreadsExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor1 {
	ExecutorService Service = Executors.newFixedThreadPool(2);
	{
		System.out.println("Executor1 starts.");
		
		Service.execute(new DoRun());
		Service.execute(new DoRun());
		
		Service.shutdown();
		
		System.out.println("Executor 1 is done.");
		
		
	}

}
