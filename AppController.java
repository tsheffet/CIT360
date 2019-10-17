package calculate;
import java.util.HashMap;

public class AppController {
	//create the hashmap to help assign operations
	public static HashMap<String, calculateMath> x = new HashMap <String, calculateMath>();
	
	public void AppController() {
		
	}
	
	public static void chooseOp(String op, Integer num1, Integer num2) {
		x.put("+", new Addition());
		x.put("-", new Subtraction());
		x.put("*", new Multiply());
		x.put("/", new Divide());
		
		calculateMath choose = x.get(op);
		choose.execute(num1, num2);
	}
}
