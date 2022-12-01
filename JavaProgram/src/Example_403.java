import java.util.*;
import javax.swing.*;
public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countofSpace = 0;
		for(int i=0;i<sentence.length(); i++) {
			if(sentence.charAt(i)==' ') {
				countofSpace++;
			}
			
		}
	System.out.println("This sentence has " + (countofSpace+1) + " spacebar.");
			System.out.println("This sentence has " + countofSpace + " spacebar.");*/
		String message = JOptionPane.showInputDialog("Input the sentence: ");
		while(message.endsWith(".")); {
			message = JOptionPane.showInputDialog("Input the sentence, again:");
		}
		int countofSpace = 0;
		for(int i=0;i<message.length(); i++) {
			if(message.charAt(i)==' ') {
				countofSpace++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + countofSpace 
									  + " spacebar." + "\nThis sentence has " + (countofSpace+1)
									  + " word.");
	}

}
