
public class Personallnfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	public Personallnfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	
	public Personallnfo(String first, String last, int month, int day, int year, int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}

	public void setPersonallnfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first,last);
		bDay.setDate(month,day,year);
		personID = ID;
	}
	
	public String toString() {
		return "Name: "+ name.toString() + "\n"
				+ "Date of birth: "+bDay.toString()
				+ "\n"+ "Personal ID: " + personID;
	}
}
