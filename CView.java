import java.util.Scanner;

public class CView {
	
	static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public CView() {
		
	}

	public void print(String toPrint) {
		System.out.print(toPrint);
		
	}
	
	public String getAnswer(String toPrint) {
		System.out.print(toPrint);
		return scanner.nextLine();
	}
	
	public void close() {
		scanner.close();
	}
}
