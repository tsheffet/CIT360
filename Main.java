package ThreadsExecutors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin..");
		
		ThreadExtends Thread1 = new ThreadExtends();
		Thread1.start();
		System.out.println("1st Thread extends.." + Thread1);
		
		ThreadExtends Thread2 = new ThreadExtends();
		Thread2.start();
		System.out.println("2nd Thread extends.." + Thread2);
		
		
		
		Thread x = new Thread(new DoRun());
		System.out.println("x thread " + x);
		x.start();
		
		Thread y = new Thread(new DoRun());
		System.out.println("y thread " + y);
		y.start();
		
		/*
		 * The Executors
		 */
		System.out.println("Starting 1.");
		new Executor1();
		System.out.println("Done 1.");
		
		
		System.out.println("Starting 2.");
		new Executor2();
		System.out.println("Done 2.");
		
	}

}
