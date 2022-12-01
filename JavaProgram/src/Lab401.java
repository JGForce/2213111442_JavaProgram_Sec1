import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullName = "", firstName = "", lastName = "";
		System.out.print("Full Name: ");
		fullName = scan.nextLine();
		int space=fullName.indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {
		firstName=fullName.substring(0,space); 
		lastName=fullName.substring(space+1);
		System.out.print("First Name: " + firstName.toUpperCase() 
						+ "\nLast Name: " + lastName.toLowerCase());
	    }
	}
}
