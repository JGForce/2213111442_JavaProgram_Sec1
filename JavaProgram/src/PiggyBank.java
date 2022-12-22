import java.util.*; 

public class PiggyBank {
	static Scanner scan = new Scanner(System.in);
	static TestPiggyBank pb = new TestPiggyBank();
	
	public static void main(String[] args) {
		inputSizeofPiggyBank();
		
	}
	
	public static void inputSizeofPiggyBank() {
		System.out.println("Money Total: "+pb.getTotal());
		System.out.println("Please define size of PiggyBank:");
		// int  size = scan.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("size of your PiggyBank: "
									+ pb.getPiggyBank());
		inputCoin();
	}
	
	public static void inputCoin() {
		while (true) {
			System.out.println("\n================");
			System.out.println("Menu of PiggyBank");
			System.out.println("=================");
			System.out.println("[1] one baht");
			System.out.println("[2] two baht");
			System.out.println("[3] five baht");
			System.out.println("[4] ten baht");
			System.out.println("[5] exit");
			System.out.println("=================");
			System.out.println("Please select choice[1-5]: ");
		int choice = scan.nextInt();
		if (choice==1) {
			System.out.println("Insert 1 baht money: ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}else if (choice==2) {
			System.out.println("Insert 2 baht money: ");
			pb.addTwo(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}else if (choice==3) {
			System.out.println("Insert 5 baht money: ");
			pb.addFive(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}else if (choice==4) {
			System.out.println("Insert 10 baht money: ");
			pb.addTen(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}else if (choice==5) {
			System.out.println("Bye Bye");
			break;
		}
	}
  }
}
	
	