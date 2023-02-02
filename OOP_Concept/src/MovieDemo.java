import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Theater tt = new Theater();
		
		System.out.print("Input movie id   : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
	
		System.out.println();
		
		System.out.print("Input director name   : ");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String directorMail = scan.nextLine();
		System.out.print("Input director gender : ");
		String directorGen = scan.nextLine();
		
		while(directorGen.equalsIgnoreCase("m") || directorGen.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again : ");
			directorGen = scan.nextLine();
		}
		
		System.out.println();
		
		System.out.print("Input movie theater no. : ");
		int movieNumber = scan.nextInt();
		
		while(movieNumber < 1 || movieNumber > 16) {
			System.out.print("Please input 1 - 15 only : ");
			movieNumber = scan.nextInt();
		}
		
		Theater tt = new Theater(directorName,directorMail,directorGen.charAt(0))
		
	}

}
