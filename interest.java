import java.util.ArrayList;

public class interest {
	String name;
	ArrayList<person> interestList;
	
	public interest(String name, ArrayList<person> interestList) {
		this.name = name;
		this.interestList = new ArrayList<person>(interestList);
	}
	
	public void add(person Person) {
		interestList.add(Person);
	}
	
	public void drop (person Person) {
		interestList.remove(Person);
	}
	
	public String list() {
		StringBuilder description = new StringBuilder();
		description.append(this.name + "\n\n");
		
		for (person p : interestList) {
			description.append(p.getName() + "\n");
			
		}
		return description.toString();
	}

}
