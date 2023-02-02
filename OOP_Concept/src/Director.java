
public class Director {
	
	private String name;
	private String email;
	private char gender;
	
	public Director (String name,  String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
	
	public Director (String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		String fullGen = "";
		if(gender == 'm'|| gender == 'M'){
			fullGen = "Male";  
		}
		else if (gender == 'f' || gender == 'F') {
			fullGen = "Female";
		}
		else {
			fullGen = null;
		}
		return fullGen;
	}
	
	public String toString() {
		return getName() + "(" + getEmail() + ";" + getGenderName() + ")";
	}
}
