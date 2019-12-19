
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JsonDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
			String name = input.nextLine();
			
		System.out.print("Enter your age: ");
			int age = input.nextInt();
			
		System.out.print("Enter if you're a studen: (y/n) ");
			String student = input.nextLine();
			
		//JSON Object
		JSONObject root = new JSONObect();
		
		root.put("name", name);
		root.put("age", age);
		root.put("student", student);
		
		System.out.println(root.toJSONString());
		

	}

}
