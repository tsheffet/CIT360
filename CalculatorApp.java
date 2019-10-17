package calculate;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AppController Calculate = new AppController();
		Integer input1;
		Integer input2;
		
		String op;
		
		System.out.println("Enter a # ");
		input1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter +, -, *, /");
		op = input.nextLine();
		
		System.out.println("Enter the 2nd # ");
		input2 = Integer.parseInt(input.nextLine());
		
		System.out.print("The Answer is: ");
		Calculate.chooseOp(op, input1, input2);
		
		
		
		

	}

}
