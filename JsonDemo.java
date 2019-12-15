import org.json.simple.JSONObject;

class JsonDemo {

   public static void main(String[] args) {
	
      JSONObject obj = new JSONObject();

      obj.put("name","Tiva");
      obj.put("age",new Integer(26));
      obj.put("student",new Boolean(true));

      StringWriter out = new StringWriter();
      obj.writeJSONString(out);
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}