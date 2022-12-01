import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String lowerMessage = message.toLowerCase(); 
		if (lowerMessage.indexOf("nichi") >= 0) {
			System.out.println("Nichi is a message");
		}
		else {
			System.out.println(message);
		}
	}

}
