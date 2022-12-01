import java.util.*;
public final class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!(sentence.endsWith("."))) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int next = 0, i=0;
		for(i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') {
				System.out.print(sentence.substring(next,i).trim()+"\n");
				next = i;
		    }
		}
		if(sentence.endsWith(".")) {
			System.out.print(sentence.substring(next).trim());
		}
	}

}
